package com.example.OrderService.controller;



import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/create")
    public String createOrder() {

        RestTemplate restTemplate = new RestTemplate();

        String paymentResponse =
                restTemplate.postForObject(
                        "http://localhost:8081/payment/process",
                        null,
                        String.class);

        return "Order Created. " + paymentResponse;
    }
}