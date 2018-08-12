package com.sda.adapter.infrastructure;

public class PaypalService {

    public void logIntoPaypal() {
        System.out.println("Logging into paypal");
    }

    public void depositTPaypalAccount(int amount) {
        System.out.println("Deposit some money");
    }

    public void requestPayment(String from, String to, int amount) {
        System.out.println("Requesting payment");
    }



}
