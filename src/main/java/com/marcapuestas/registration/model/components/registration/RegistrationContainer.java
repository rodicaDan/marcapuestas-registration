package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.WebButton;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class  RegistrationContainer {

    public String title;
    public String subtitle;

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCheckmark() {
        return checkmark;
    }

    public void setCheckmark(String checkmark) {
        this.checkmark = checkmark;
    }

    public String checkmark;


    private WebButton registrationButton;
    private WebButton fbButton;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setRegistrationButton(WebButton registrationButton) {
        this.registrationButton = registrationButton;
    }

    public WebButton getRegistrationButton() {
        return registrationButton;
    }

    public WebButton getFbRegistrationButton() {
        return fbButton;
    }

    public void setFbRegistrationButton(WebButton fbButton) {
        this.fbButton = fbButton;
    }





}
