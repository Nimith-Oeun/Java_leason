package mvc.mapper;

import mvc.model.User;
import mvc.model.dto.UserDto;

public class userMapper {
    public static UserDto mapFromUserToUserDto(User user){
        if (user == null) {
            return null;
        }
        return new UserDto( user.getName(), user.getEmail());
    }
}
