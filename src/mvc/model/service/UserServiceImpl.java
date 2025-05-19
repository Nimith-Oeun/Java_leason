package mvc.model.service;

import mvc.mapper.userMapper;
import mvc.model.dao.UserDao;
import mvc.model.dao.UserDaoImpl;
import mvc.model.dto.UserDto;

import java.util.List;


public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers()
                .stream()
                .map(userMapper::mapFromUserToUserDto)
                .toList();
    }
}
