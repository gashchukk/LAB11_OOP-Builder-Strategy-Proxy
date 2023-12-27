package com.lab11.task2;


import java.util.ArrayList;
import java.util.List;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class MailBox {
    private List<MailInfo> info;

    public MailBox(){
        info = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        info.add(mailInfo);
    }

    public void removeMailInfo(MailInfo mailInfo) {
        info.remove(mailInfo);
    }

    public void sendAll()  {
        for (MailInfo email: info){
            try {
                MailSender.sendMail(email);
            } catch (MailjetSocketTimeoutException | MailjetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}