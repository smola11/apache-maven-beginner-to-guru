package controllers;

import entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {

    public User getUser(UserCommand userCommand) {
        return new User();
    }
}
