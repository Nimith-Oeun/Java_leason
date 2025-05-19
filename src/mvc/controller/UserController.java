package mvc.controller;

import mvc.model.dto.UserDto;
import mvc.model.service.UserService;
import mvc.model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();


    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
}
