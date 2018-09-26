package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    @Autowired
    @Qualifier("serviceMailSender")
    private JavaMailSender javaMailSender;

    public void sendEmail(String target){

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(target);
        mail.setFrom("peacetestmsg@gmail.com");
        mail.setSubject("Welcome to My Store!!");
        mail.setText("Welcome to My Store --- from my store admin: peace");

        javaMailSender.send(mail);
    }
}
