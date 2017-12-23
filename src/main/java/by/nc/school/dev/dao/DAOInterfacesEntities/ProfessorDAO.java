package by.nc.school.dev.dao.DAOInterfacesEntities;

import by.nc.school.dev.beans.Professor;

public interface ProfessorDAO {
    public int addProfessor();
    //public boolean deleteProfessor();
    public Professor findProfessor();
    public boolean editProfessor();
    public boolean showProfessorProfile();
}
