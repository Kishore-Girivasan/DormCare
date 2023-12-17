package com.example.DormCare.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;


    public void getmail(String toemail){
        String email= toemail;
        String body="The otp is : "+generateOTP();
        String subject="OTP for DormCare";
        sendmail(email, body, subject);
    }

    private String generateOTP() {
        int otpLength = 6;
        String allowedChars = "0123456789";
        Random random = new Random();
        StringBuilder otpBuilder = new StringBuilder(otpLength);
        for (int i = 0; i < otpLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            otpBuilder.append(randomChar);
        }   
        return otpBuilder.toString();
    }

    public void sendmail(String toemail,String subject,String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("kishoregirivasan03@gmail.com");
        message.setTo(toemail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);

        System.out.println("Mail sent");
    }

}
