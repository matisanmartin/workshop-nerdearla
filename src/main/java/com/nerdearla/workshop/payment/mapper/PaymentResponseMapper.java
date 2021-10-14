package com.nerdearla.workshop.payment.mapper;

import com.nerdearla.workshop.payment.model.PaymentResponse;
import com.nerdearla.workshop.payment.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentResponseMapper {

    public PaymentResponse map(Payment payment) {
        return new PaymentResponse(payment.getPaymentId());
    }
}