package hl7_in_archive;

import sms.sendsms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HL7Trigger {

  
   public void Readmysql(){
      Configuration cfg = new Configuration();
      cfg.configure("Spring.xml");
      SessionFactory sf = cfg.buildSessionFactory();
      Session s = sf.openSession();
      Session ph = sf.openSession();
     long i = 0;
    
     String o = "OBR|";
     String p = "PID|";
      while(s.load(Hl7_in_archive.class, i) != null){
         if(i==Hl7_in_archive.getCount()){
            Hl7_in_archive hl7 = (Hl7_in_archive) s.load(Hl7_in_archive.class, i);
            String message = hl7.getHl7_data();
            if(message.contains(o)== true){
               BufferedReader reader = new BufferedReader(new StringReader(message));
               try {
                  while(reader.readLine()!=null){
                     if(reader.toString().contains(p)== true) break;
                     reader.readLine();
                  }
                  String[] pid = reader.toString().split("|");
                  String pid3 = pid[2];
                  long j = 0;
                  while(ph.load(Patient_phone.class, j) != null){
                     Patient_phone phone = (Patient_phone) ph.load(Patient_phone.class, j);
                     if (pid3 == phone.getPatient_id()){
                        sendsms(phone.getPhone_number(), "US");
                        ph.close();
                        break;
                     }
                     j++;
                  }
                  ph.close();
               } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               } 
            }
            Hl7_in_archive.setCount(i+1);
         }
         i++;
      }
      s.close();
     
   }


}
