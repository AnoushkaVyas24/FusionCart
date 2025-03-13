package com.project.FusionCart.payloads;

import lombok.Data;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Data
public class PaymentDTO {
    private Long paymentId;
    private String paymentMethod;

    public PaymentDTO() {
    }

    public PaymentDTO(Long paymentId, String paymentMethod) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
    }
}
