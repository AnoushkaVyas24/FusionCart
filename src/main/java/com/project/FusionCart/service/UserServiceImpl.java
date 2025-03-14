package com.project.FusionCart.service;

import com.project.FusionCart.entity.User;
import com.project.FusionCart.repository.AddressRepo;
import com.project.FusionCart.repository.RoleRepo;
import com.project.FusionCart.repository.UserRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private CartService cartService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO registeredUser(UserDTO userDTO){
        try{
            User user = modelMapper.map(UserDTO, User.class);
        }
    }

    @Override
    public UserResponse getAllUsers(Integer pageNumber, Integer pageSize)
}
