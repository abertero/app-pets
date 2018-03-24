package com.pets.domain;

import com.pets.enums.PaymentMethod;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class Client extends Person {
    @Enumerated
    private PaymentMethod paymentMethod;

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
