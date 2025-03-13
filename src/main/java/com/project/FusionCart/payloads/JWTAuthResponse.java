package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class JWTAuthResponse {
    private String token;

    private UserDTO user;
}
