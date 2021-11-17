package com.capgemini.carshop.orders;

public class SMSSender implements Sender{

    public void sendMessage() {
        System.out.println("Oto sms z potwierdzeniem zakupu");
    }
}
