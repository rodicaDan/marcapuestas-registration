package com.marcapuestas.registration.stepdefs.expectedData;

import com.google.common.collect.ImmutableSet;
import org.apache.http.client.utils.DateUtils;

import java.util.*;

/**
 * Created by Rodicad on 24/09/2017.
 */
public class RegistrationFormValues {

    public static final String FOOTER_IMG_LOCATION = "https://utils.marcaapuestas.es/api-login/media/images/brands/marca/marca_footer.png";
    public static final String TEN_EUROS_OFFER_IMG_LOCATION = "https://static.marcaapuestas.es/utils/api-login/media/images/brands/marca/offers/sportsbook/desktop/4.png";
    public static final String CASINO_OFFER_IMG_LOCATION = "https://static.marcaapuestas.es/utils/api-login/media/images/brands/marca/offers/casino/desktop/2.png";
    public static final String DOUBLE_DEPOSIT_OFFER_IMG_LOCATION = "https://static.marcaapuestas.es/utils/api-login/media/images/brands/marca/offers/sportsbook/desktop/2.png";


    public static final String INFO_MESSAGE = "Este campo es obligatorio";
    public static final String TITLE = "Abre tu cuenta";
    public static final String SUBTITLE = "Es gratis y solo tardas 15 segundos";
    public static final String CONTINUE_BUTTON_LABEL = "CONTINUAR";

    //Step 1 fields
    public static final String CITIZENSHIP_LABEL = "Nacionalidad";
    public static final String CITIZENSHIP_PLACEHOLDER = "España";

    public static final String DNI_HOLDER = "DNI";
    public static final String DNI_ERROR_MESSAGE = "DNI/NIE incorrecto. Por favor, verifica el número de DNI/NIE.";

    public static final String FIRST_NAME_HOLDER = "Nombre como en tu DNI";

    public static final String FIRST_LAST_NAME_HOLDER = "Primer Apellido como en tu DNI";
    public static final String SECOND_LAST_NAME_HOLDER = "Segundo Apellido como en tu DNI";

    public static final String DATE_OF_BIRTH_LABEL = "Fecha de nacimiento";
    public static final String DAY_HOLDER = "Día";

    private static Iterable<String> setDays() {
        ArrayList<String> days = new ArrayList<>();
        days.add(DAY_HOLDER);
        for (int i= 1; i <=31; i++) {
            days.add(String.format("%02d", i));
        }
        return days;
    }
    public static final Set<String> DAYS_OPTIONS =  ImmutableSet.<String>builder().addAll(setDays()).build();

    public static final String MONTH_HOLDER = "Mes";
    public static final Set<String> MONTH_OPTIONS =  ImmutableSet.<String>builder().addAll(setMonths()).build();

    private static Iterable<String> setMonths() {
        ArrayList<String> months = new ArrayList<>();
        months.add(MONTH_HOLDER);
        for (int i= 1; i <=12; i++) {
            months.add(String.format("%02d", i));
        }
        return months;
    }

    public static final String YEAR_HOLDER = "AÑO";
    private static final int MAX_AGE_YEAR = Calendar.getInstance().get(Calendar.YEAR) - 18;

    private static Iterable<String> setYears() {
        ArrayList<String> years = new ArrayList<>();
        years.add(YEAR_HOLDER);
        for (int i= MAX_AGE_YEAR; i >=1900; i--) {
            years.add(String.valueOf(i));
        }
        return years;
    }

    public static final Set<String> YEAR_OPTIONS =  ImmutableSet.<String>builder().addAll( setYears())
            .build();

    //Step 2 fields
    public static final String PHONE_NUMBER_HOLDER = "612 34 56 78";
    public static final String EMAIL_HOLDER = "Correo Electrónico";
    public static final String ADDRESS_HOLDER = "direccion: p. ej. regalado 9";
    public static final String REGION_HOLDER = "Comunidad Autónoma";
    public static final String PROVINCE_HOLDER = "Población";
    public static final String POST_CODE_HOLDER = "Codigo Postal";

    //Step 3 fields
    public static final String USERNAME_HOLDER = "Usuario";
    public static final String PASSWORD_HOLDER = "Contraseña";
    public static final String PROMOTIONAL_CODE_LABEL = "Tienes un código promocional? (Opcional)";
    public static final String PROMOTIONAL_CODE_HOLDER = "Código promocional (Opcional)";
    public static final String TERMS_CONDITIONS_TEXT =
            "Acepto los Términos y Condiciones y los Política de Privacidad ." +
                    " También confirmo que soy mayor de 18 años aquí (donde puedo darme de baja de todo aquello que no quiero recibir)," +
                    " incluido el uso de cookies y confirmo no estar afectado por ninguna causa de prohibición subjetiva.";

    public static final String CREATE_ACCOUNTSIT_FORM_TITLE = "INTRODUCEȚI DETALIILE DUMNEAVOASTRĂ";

    //deposit form expected data
    public static final String DEPOSIT_FORM_TITLE = "INTRODUCEȚI DETALIILE DUMNEAVOASTRĂ";
    public static final String SUCCESFULL_DEPOSIT_LABEL = "Succes";


}
