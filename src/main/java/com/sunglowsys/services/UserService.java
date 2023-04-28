package com.sunglowsys.services;

import com.sunglowsys.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAll();
    void deleteUser(Integer userId);
}
