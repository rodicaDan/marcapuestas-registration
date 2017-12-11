package com.marcapuestas.registration.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rodicad on 26/09/2017.
 */
public class StringUtils {
    private static final int MAX_AGE_YEAR = Calendar.getInstance().get(Calendar.YEAR) - 18;
    private static final int MIN_AGE_YEAR = 1900;
    private static final int MAX_NAME_LENGTH = 40;
    private static final int MIN_NAME_LENGTH = 2;


    private static final int MAX_USERNAME_LENGTH = 16;
    private static final int MIN_USERNAME_LENGTH = 6;

    private static final int MAX_PWD_LENGTH = 20;
    private static final int MIN_PWD_LENGTH = 8;
    private static final List<Character> DNI_CHARS = Arrays.asList('T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E') ;


    public static String generateRandomString (int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String generateRandomNumberAsString (int count) {
        return RandomStringUtils.randomNumeric(count);
    }

    public static String generateRandomNIFNumber() {
        String number =  RandomStringUtils.randomNumeric(8);
        int charIndex =  Integer.valueOf(number) % 23;
        return number + DNI_CHARS.get(charIndex);
    }

    public static String generateRandomNIENumber() {
        return generateRandomDNILetter() + RandomStringUtils.randomNumeric(7) + generateRandomDNILetter();
    }

    public static String generateRandomCIFNumber() {
        return generateRandomDNILetter() + RandomStringUtils.randomNumeric(8) ;
    }

    public static String generateRandomName() {
        return RandomStringUtils.randomAlphabetic(new Random().nextInt((MAX_NAME_LENGTH - MIN_NAME_LENGTH)+1)+MIN_NAME_LENGTH);
    }

    public static String generateRandomUsername() {
       return RandomStringUtils.randomAlphabetic(new Random().nextInt((MAX_USERNAME_LENGTH - MIN_USERNAME_LENGTH)+1)+MIN_USERNAME_LENGTH);
    }

    public static String generateRandomPassword() {
        String password = RandomStringUtils.randomAlphabetic(new Random().nextInt((MAX_PWD_LENGTH - MIN_PWD_LENGTH)+1)+MIN_PWD_LENGTH-1)+RandomStringUtils.randomNumeric(1);
        Pattern p = Pattern.compile("\\p{L}");
        Matcher m = p.matcher(password);
        if (m.find()) {
            password = password.replace(m.group(), m.group().toUpperCase());
            System.out.println("Created password: "+password);
        }
        return password;


    }
    private static Character generateRandomDNILetter() {
        return DNI_CHARS.get(new Random().nextInt(DNI_CHARS.size()));
    }

    public static String generateRandomMonth(){
        return String.format("%02d",new Random().nextInt(12));
    }

    public static String generateRandomDayOfMonth(){
        return String.format("%02d",new Random().nextInt(28));
    }

    public static String generateRandomBirthYear(){
        return String.valueOf(new Random().nextInt((MAX_AGE_YEAR - MIN_AGE_YEAR)+1)+MIN_AGE_YEAR);
    }


}
