package com.codewithsumit.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("stripped");
        System.out.println("Amount : "+ amount );
    }
}
