package com.sda.strategy;

import com.sda.adapter.domain.Payment;
import com.sda.adapter.infrastructure.PaypalService;

public class PaypalPaymentAdapter implements Payment {

    private PaypalService paypalService;

    public PaypalPaymentAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public void pay(int amountInPln) {
        paypalService.logIntoPaypal();
        paypalService.requestPayment("RUSSIA","IRAN",300000);
        paypalService.depositTPaypalAccount(amountInPln);
    }



}
