package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{
    private static int PEOPLE_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++PEOPLE_COUNT, "Anna", "Ivnova", "mail@google.com"));
        users.add(new User(++PEOPLE_COUNT, "Nikolai", "Ivanov", "mail@yandex.ru"));
        users.add(new User(++PEOPLE_COUNT, "Olga", "Petrova", "mail@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Elena", "Sidorova", "mail@yahhoo.com"));

    }



    @Override
    public List<User> showAllUsers() {
        return users;
    }

    @Override
    public User showUser(Integer id){
        return users.stream().filter(person ->person.getId() == id).findAny().orElse(null);
    }

    @Override
    public void createUser(User user) {
        user.setId(++PEOPLE_COUNT);
        users.add(user);

    }

    @Override
    public void updateUser(Integer id, User updatedUser) {
        User userToBeUpdated = showUser(id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setLastName(updatedUser.getLastName());
        userToBeUpdated.seteMail(updatedUser.geteMail());
    }

    @Override
    public void deleteUser(Integer id){
        users.removeIf(p -> p.getId() == id);
    }
}
