package com.demoBlog.App.services;

import com.demoBlog.App.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto registerNewUser(UserDto user);


    UserDto createUser(UserDto user);

    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
