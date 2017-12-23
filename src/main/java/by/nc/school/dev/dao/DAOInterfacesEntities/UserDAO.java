package by.nc.school.dev.dao.DAOInterfacesEntities;

import by.nc.school.dev.beans.User;
import by.nc.school.dev.exceptions.UserException;

import java.util.List;

public interface UserDAO {
    public boolean addUser(User user) throws UserException;
    //public boolean deleteUser();
    public List<User> getListUsers() throws UserException;
    public User getUserById(int id) throws UserException;
    public User findUserByUsername(String username) throws UserException;
    public boolean updateUser(User user) throws UserException;
}
