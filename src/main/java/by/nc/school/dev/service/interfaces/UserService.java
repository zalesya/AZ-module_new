package by.nc.school.dev.service.interfaces;

import by.nc.school.dev.beans.User;

import java.util.List;

public interface UserService {
    boolean doLogin(User user);
    boolean checkLoginExist(String login);

    User addUser(User user);
    void deleteUser(long id);
    List<User> getListUsers();
    User getUserById(int id);
    User findUserByUsername(String username);
    User editUser(User user);
}
