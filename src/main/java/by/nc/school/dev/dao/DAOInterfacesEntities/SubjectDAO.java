package by.nc.school.dev.dao.DAOInterfacesEntities;

import by.nc.school.dev.beans.Subject;

public interface SubjectDAO {
    public int addSubject();
    public Subject findSubject();
    public boolean editSubject();
    public double getFinalMarkSubject();
}
