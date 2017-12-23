package by.nc.school.dev.dao.DAOInterfacesEntities;

import by.nc.school.dev.beans.Department;

public interface DepartmentDAO {
    public int addDepartment();
    public Department findDepartment();
    public boolean editDepartment();
    public boolean showableMarks();
}
