package com.sda.adapter.infrastructure;

import com.sda.adapter.domain.Payment;

public class BitcointPaymentAdapter implements Payment {

    private BitcointServiceFacade bitcointServiceFacade;
//    private BitcointService bitcointService;

    public BitcointPaymentAdapter(BitcointService bitcointService, BitcointServiceFacade bitcointServiceFacade) {
        this.bitcointServiceFacade = bitcointServiceFacade;
    }

    @Override
    public void pay(int amountInPln) {
        bitcointServiceFacade.requestPayment("USA", "ISRAEL", 20000);
    }

    private int exchangeFromPlnToUsd(int amountInPln) {

        return amountInPln / 3;
    }

}
