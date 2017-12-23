package by.nc.school.dev.web.util;

public interface SessionAttributes {
    String USER_ID = "user_id";
    String USER_LOGIN = "username";
    String USER_PASSWORD = "password";
    String USER_PASSWORD_REPEAT = "repeatPassword";
    String USER_ROLE = "role";
    String USER_SURNAME = "surname";
    String USER_NAME = "name";
    String USER_EMAIL = "email";
    String USER_TELEPHONE_NUMBER = "telephoneNumber";

    String USER = "user";
    String STUDENT = "student";
    String PROFESSOR = "professor";
    String SUBJECT = "subject";
    String GROUP = "group";
    String DEPARTMENT = "department";
    String FACULTY = "faculty";

    String MARK = "mark";

    String IS_LOGGED_IN = "isLoggedIn";
    String EMPTY_FIELDS = "emptyFields";
    String PASSWORD_ERROR = "passwordError";
    String REGEX_ERROR = "regexError";
    String LOGIN_EXISTS = "loginExists";
    String SUCCESS_ADD_USER = "successAddUser";
    String ALL_USERS = "getAllUsers";
    String SUCCESS_UPDATE = "successUpdate";
}
