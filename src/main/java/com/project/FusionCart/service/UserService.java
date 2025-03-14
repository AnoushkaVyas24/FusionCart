package com.project.FusionCart.service;

import com.project.FusionCart.entity.User;

public interface UserService {
    UserDTO registeredUser(UserDTO userDTO);
    UserResponse getAllUsers(Integer pageNumber, Integer pageSize, String sortBy,String sortOrder);
    UserDTO getUserById(Long userId);
    UserDTO updateUser(Long userId, UserDTO userDTO);
    String deleteUser(Long userId);
}
