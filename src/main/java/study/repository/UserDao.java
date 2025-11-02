package study.repository;

import study.model.User;
import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();

    void updateUser(User user);

    User getUserById(int id);
}
