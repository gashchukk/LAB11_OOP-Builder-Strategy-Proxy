package com.lab11.task2;

public class GiftMail implements MailCode{
    public String create(Client client) {
        return "Congratulations! here is coupon for $10 for any product in our store";
    }
}