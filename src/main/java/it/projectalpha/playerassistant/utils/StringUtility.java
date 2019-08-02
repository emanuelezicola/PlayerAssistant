package it.projectalpha.playerassistant.utils;

import java.util.regex.Pattern;

public class StringUtility {

    private Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    public Pattern getEmailPattern() {
        return emailPattern;
    }
}
