package com.capgemini.carshop.orders;


public class MailSender implements Sender {

    public void sendMessage() {
        System.out.println("Oto mail z potwierdzeniem zakupu");
    }
}
