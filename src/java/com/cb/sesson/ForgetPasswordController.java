package com.cb.sesson;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class ForgetPasswordController {

    public static class Mailer {

        public static boolean send(String from, String password, String to, String sub, String msg) {
            
            boolean success = false;
            //Get properties object    
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            //get Session   
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, password);
                }
            });
            //compose message    
            try {
                MimeMessage message = new MimeMessage(session);
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject(sub);
//                message.setText(msg);
                message.setContent(msg, "text/html");
                //send message  
                Transport.send(message);
                success = true;
                System.out.println("message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
            
            return success;
        }
    }
}
