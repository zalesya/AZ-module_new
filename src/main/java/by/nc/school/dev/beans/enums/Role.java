package by.nc.school.dev.beans.enums;

public enum Role {
    STUDENT, PROFESSOR;

    public static Role getRoleById(int id) {
        for (Role e : values()) {
            if (e.ordinal() == id) {
                return e;
            }
        }
        return null;
    }

    public static Role getRoleByName(String roleName) {
        for (Role e : values()) {
            if (e.name().equals(roleName)) {
                return e;
            }
        }
        return null;
    }
}