package com.david.hrpayroll.services;

import com.david.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Bob", 200.00, days);
    }
}

