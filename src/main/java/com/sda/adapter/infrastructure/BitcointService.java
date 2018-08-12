package com.sda.adapter.infrastructure;

public class BitcointService {

    public void logInStock () {
        System.out.println("Loggin into stock");
    }

    public void transferMoneyToStock(int moneyInUSD) {
        System.out.println("Transferring money to stock");
    }

    public void buyBitcoins(int moneyInUSD){
        System.out.println("Buying some BTC");
    }

    public void transferTo(String from, String to, int amount){
        System.out.println("Transferring");
    }

}
