package mvc.model.dao;

import mvc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private List<User> userList = new ArrayList<>(
            List.of(
                    new User(1,"John","john@gmail.com","john123")
            )
    );
    @Override
    public void addUser(User user) {
        userList.add(user);  // Add user to the list
    }

    @Override
    public void updateUser(User user) {
        for (User u : userList) {
            if (u.getId() == user.getId()) {
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setPassword(user.getPassword());
            }
        }
    }

    @Override
    public void deleteUser(long userId) {
        userList.removeIf(e -> e.getId() == userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

}
