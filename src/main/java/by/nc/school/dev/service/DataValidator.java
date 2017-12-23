package by.nc.school.dev.service;

import java.util.regex.Pattern;

public class DataValidator {
    private static final String LOGIN_PASS_REGEX = "^[A-z0-9]{3,16}$";

    public DataValidator() {
    }

    public static boolean validateRegisterData(String login, String password) {
        return loginValidation(login) && passwordValidation(password);
    }

    private static boolean loginValidation(String login) {
        return Pattern.matches(LOGIN_PASS_REGEX, login);
    }

    public static boolean passwordValidation(String password) {
        return Pattern.matches(LOGIN_PASS_REGEX, password);
    }

    public static boolean checkPass(String enteredPassword, String passwordFromBase) {
        return enteredPassword != null && !enteredPassword.equals("") && passwordFromBase != null &&
                    !passwordFromBase.equals("") && enteredPassword.equals(passwordFromBase);
    }
}
