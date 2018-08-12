package com.sda.adapter.application;

import com.sda.adapter.infrastructure.BitcointPaymentAdapter;
import com.sda.adapter.infrastructure.BitcointService;
import com.sda.adapter.domain.PaymentService;
import com.sda.adapter.infrastructure.PaypalPaymentAdapter;
import com.sda.adapter.infrastructure.PaypalService;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        BitcointPaymentAdapter bitcointPaymentAdapter = new BitcointPaymentAdapter(new BitcointService(), bitcointServiceFacade);

        PaypalPaymentAdapter paypalPaymentAdapter = new PaypalPaymentAdapter(new PaypalService());

        PaymentService paymentService = new PaymentService(
                Arrays.asList(bitcointPaymentAdapter,paypalPaymentAdapter)
        );

        paymentService.requestPayment(10);
        paymentService.requestPayment(100);
        paymentService.requestPayment(140);

    }

}
