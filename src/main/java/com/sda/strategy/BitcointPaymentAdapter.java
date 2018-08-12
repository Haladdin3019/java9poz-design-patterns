package com.sda.strategy;

import com.sda.adapter.domain.Payment;
import com.sda.adapter.infrastructure.BitcointService;

public class BitcointPaymentAdapter implements Payment {

    private BitcointService bitcointService;

    public BitcointPaymentAdapter(BitcointService bitcointService) {
        this.bitcointService = bitcointService;
    }

    @Override
    public void pay(int amountInPln) {
        bitcointService.logInStock();
        int moneyInUSD = exchangeFromPlnToUsd(amountInPln);
        bitcointService.transferMoneyToStock(moneyInUSD);
        bitcointService.buyBitcoins(moneyInUSD);
        bitcointService.transferTo("USA","ISRAEL",250000);
    }

    private int exchangeFromPlnToUsd(int amountInPln) {

        return amountInPln /3 ;
    }

}
