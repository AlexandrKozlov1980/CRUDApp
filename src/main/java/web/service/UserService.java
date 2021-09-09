package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

    public User showUser(Integer id);

    public void createUser(User user);

    public List<User> deleteUser(Integer id);

    public void updateUser(Integer id, User updatedUser);
}
