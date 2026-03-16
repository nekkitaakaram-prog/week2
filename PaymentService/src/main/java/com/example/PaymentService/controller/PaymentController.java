package com.example.PaymentService.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/process")
    public String processPayment() {
        return "Payment Successful";
    }
}