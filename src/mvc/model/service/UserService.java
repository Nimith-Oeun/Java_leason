package mvc.model.service;

import mvc.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
}
