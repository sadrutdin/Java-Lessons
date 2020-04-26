package com.lesson7.service;

import com.lesson7.dto.NewUserDTO;
import com.lesson7.dto.UserDTO;

public interface UserService {
    UserDTO newUser(NewUserDTO user);
}
