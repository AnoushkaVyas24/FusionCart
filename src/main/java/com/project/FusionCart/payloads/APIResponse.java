package com.project.FusionCart.payloads;

import lombok.Data;

@Data
public class APIResponse {
    private String message;
    private boolean status;

    public APIResponse() {
    }

    public APIResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }
}
