package mvc.model.dao;

import mvc.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(long userId);
    public List<User> getAllUsers();
}
