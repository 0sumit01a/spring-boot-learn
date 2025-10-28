package com.codewithsumit.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private String ena;

    @Value("${stripe.timeout}")
    private String timeOut;

    @Value("${stripe.supported-currencies}")
    private String sc;

    @Override
    public void processPayment(double amount){
        System.out.println("url " + apiUrl);
        System.out.println("isEnable " + ena);
        System.out.println("time is out " + timeOut);
        System.out.println("supported currencies " + sc);

        System.out.println("stripped");
        System.out.println("Amount : "+ amount );
    }
}
