package by.nc.school.dev.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @author Admin
 * @version 1.0
 */
public class Statistics implements Serializable {
	private HashMap<Student, List<Boolean>> mapAttendanceStudents;

	public Statistics(){
	}

	public Statistics(HashMap<Student, List<Boolean>> mapAttendanceStudents) {
		this.mapAttendanceStudents = new HashMap<Student, List<Boolean>>(mapAttendanceStudents);
	}

	public HashMap<Student, List<Boolean>> getMapAttendanceStudents() {
		return mapAttendanceStudents;
	}

	public void setMapAttendanceStudents(HashMap<Student, List<Boolean>> mapAttendanceStudents) {
		this.mapAttendanceStudents = new HashMap<Student, List<Boolean>>(mapAttendanceStudents);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Statistics that = (Statistics) o;

		return getMapAttendanceStudents().equals(that.getMapAttendanceStudents());
	}

	@Override
	public int hashCode() {
		return getMapAttendanceStudents().hashCode();
	}
}