package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();

    public User showUser(Integer id);

    public void createUser(User user);

    public void updateUser(Integer id, User updatetUser);

    public void deleteUser(Integer id);
}
