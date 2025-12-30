package com.firstspringboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Annotations
/*  component - utilities
    service - bussiness logic
    Repository
    Controller
 */
@Component
public class OrderService {

    private PaymentService ppaymentService; 

    // public void setPaymentService(PaymentService paymentService){
    //     this.paymentService = paymentService;
    // }

    
    @Autowired
    public OrderService(PaymentService ppaymentService){
        this.ppaymentService = ppaymentService;
    }

   
    public void placeOrder(){
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}















