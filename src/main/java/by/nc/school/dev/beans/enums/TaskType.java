package by.nc.school.dev.beans.enums;

/**
 * @author Admin
 * @version 1.0
 */
public enum TaskType {
    LAB_WORK, CONTROL_WORK, COURSE_PROJECT;

    public static TaskType getById(int id) {
        for (TaskType e : values()) {
            if (e.ordinal() == id) {
                return e;
            }
        }
        return null;
    }
}