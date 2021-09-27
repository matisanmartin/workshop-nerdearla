package com.nerdearla.workshop.model

data class Payment(
    val paymentId: String,
    val authorizationId: String,
    val traceNumber: String,
    val qrId: String,
    val paymentMethodId: String,
    val amount: Double,
    val buyerId: String,
    val sellerId: String
)
