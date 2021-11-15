import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EmailSender {
    public static void sendMail(String recipient, String Text, String subJEct) throws Exception {
    System.out.println("Email sent in progress . . .");

    Properties properties = new Properties();

    //EZ AMUGY BLACK MAGIC
    //mail.smtp.auth
    //mail.smtp.starttls.enable
    //mail.smtp.host - smtp.gmail.com
    //mail.smtp.port - 587

    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");

    String myAccaountEmail = "your Email adress";
    String password = "******";

    Session session = Session.getInstance(properties, new Authenticator() {

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(myAccaountEmail, password);
        }
    });

    Message message = prepareMeassage(session, myAccaountEmail, recipient, Text, subJEct );

    Transport.send(message);

    System.out.println("Email sent . . .");
}
    private static Message prepareMeassage(Session session, String myAccaountEmail, String recepient,String subJect, String Text){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccaountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(subJect);
            message.setText(Text);
            return message;
        }
        catch (Exception ex){
            Logger.getLogger(EmailSend.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
