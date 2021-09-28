package com.nerdearla.workshop.dto.authorization

data class PaymentAuthorizationRequest(
    val paymentMethodToken: String,
    val paymentMethodSecurityCode: String,
    val holderIdentification: String,
    val establishmentId: String,
    val terminalNumber: String,
    val traceNumber: String,
    val ticketNumber: String,
    val transactionDatetime: String,
)