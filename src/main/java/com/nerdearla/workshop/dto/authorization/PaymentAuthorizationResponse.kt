package com.nerdearla.workshop.dto.authorization

class PaymentAuthorizationResponse(
    val id: String,
    val traceNumber: String,
    val status: String,
    val timestamp: String? = null
)