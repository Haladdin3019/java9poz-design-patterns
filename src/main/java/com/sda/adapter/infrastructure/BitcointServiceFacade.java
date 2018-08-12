package com.sda.adapter.infrastructure;

public class BitcointServiceFacade {

    private BitcointService bitcointService;

    public void requestPayment(String from, String to, int amount) {

        bitcointService.logInStock();
        bitcointService.buyBitcoins(amount);
        bitcointService.transferTo(from, to, 10000);

    }

}
