package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class JWTAuthRequest {
    private String username;
    private String password;
}
