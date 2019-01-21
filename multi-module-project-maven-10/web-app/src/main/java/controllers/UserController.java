package controllers;

import com.maciej.converters.UserMapper;
import entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {

    public User getUser(UserCommand userCommand) {
        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}
