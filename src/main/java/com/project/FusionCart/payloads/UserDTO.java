package com.project.FusionCart.payloads;

import com.project.FusionCart.entity.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO {
    private Long userId;
    private String email;
    private String psw;
    private String userName;
    private String phone;
    private LocalDate dateOfBirth;
    private Set<Role> roles = new HashSet<>();
    private AddressDTO address;
    private CartDTO cart;

    public UserDTO(Long userId, String email, String psw, String userName, String phone, LocalDate dateOfBirth, Set<Role> roles, AddressDTO address, CartDTO cart) {
        this.userId = userId;
        this.email = email;
        this.psw = psw;
        this.userName = userName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.roles = roles;
        this.address = address;
        this.cart = cart;
    }

    public UserDTO() {
    }
}
