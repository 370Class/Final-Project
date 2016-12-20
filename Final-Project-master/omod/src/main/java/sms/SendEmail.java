package sms;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

	
    private static String USER_NAME = "kamf.gp@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "Pass!2word"; // GMail password
    private Properties props;
    private String body= "This is a test";
    public SendEmail(String rec)
    {
    	props = System.getProperties();
    	String host = "smtp.gmail.com";
    	 props.put("mail.smtp.starttls.enable", "true");
         props.put("mail.smtp.host", host);
         props.put("mail.smtp.user", USER_NAME);
         props.put("mail.smtp.password", PASSWORD);
         props.put("mail.smtp.port", "587");
         props.put("mail.smtp.auth", "true");
         Session session = Session.getDefaultInstance(props);
         MimeMessage message = new MimeMessage(session);
         try {
 			message.setFrom(new InternetAddress(USER_NAME));
 			InternetAddress toAddress= new InternetAddress(rec);
            message.addRecipients(Message.RecipientType.TO, rec);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, USER_NAME, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
 			
    }
}
