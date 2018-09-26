package com.example.demo.crawler;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class CrawlerRun implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    public EmailService emailService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        /*
        HashSet<String> urls = new HashSet<String>();
        //urls.add("http://www.google.com");
        //urls.add("http://www.baidu.com");
        urls.add("https://www.amazon.com/");
        Crawler c = new Crawler(urls);

        c.start();

        */
        /*
        try {
            emailService.sendEmail("phe004@ucr.edu");
        }catch (MailException e){
            System.out.println(e);
        }
        */

    }
}
