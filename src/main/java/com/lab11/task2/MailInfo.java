package com.lab11.task2;
import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;

    public String create() {
        return mailCode.create(client);
    }
}