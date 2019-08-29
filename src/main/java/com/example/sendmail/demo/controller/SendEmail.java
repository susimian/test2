package com.example.sendmail.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmail {
    @Autowired
    JavaMailSender jms;

    @RequestMapping("/sendMail")
    public String sendMail(){
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom("13322737046@163.com");
        //接收者
        mainMessage.setTo("281954081@qq.com");
        //发送的标题
        mainMessage.setSubject("嗨喽");
        //发送的内容
        mainMessage.setText("hello world");
        jms.send(mainMessage);
        System.out.println("sendMail");
        return "sendMail";
    }
}
