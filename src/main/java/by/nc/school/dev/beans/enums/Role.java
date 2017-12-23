package by.nc.school.dev.beans.enums;

/**
 * @author Admin
 * @version 1.0
 */

public enum Role {
    STUDENT, PROFESSOR;

    Role() {

    }

    public static Role getRoleById(int id) {
        for (Role e : values()) {
            if (e.ordinal() == id) {
                return e;
            }
        }
        return null;
    }
}