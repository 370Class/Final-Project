package hl7_in_archive;

import sms.sendsms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HL7Trigger {

  
   //public void Readmysql() throws Exception{
  public static void main (String[] args) throws Exception{
      Configuration cfg = new Configuration();
      cfg.configure("Hibernate.cfg.xml");
      SessionFactory sf = cfg.buildSessionFactory();
      Session s = sf.openSession();
      Session ph = sf.openSession();
      Session pn = sf.openSession();
      int i = 1;
    
     String o = "OBX|";
     String p = "PID|";
     System.out.println("FIRSTB ATTEMPT");
      while(s.load(Hl7_in_archive.class, i) != null){
         System.out.println("SECOND ATTEMPT");
         if(i==Hl7_in_archive.getCount()){
            System.out.println("HL7 IN ARCHIVE TABLE READ " + i);
            Hl7_in_archive hl7 = (Hl7_in_archive) s.load(Hl7_in_archive.class, i);
            String message = hl7.getHl7_data();
            if(message.contains(o)== true){
               BufferedReader reader = new BufferedReader(new StringReader(message)); 
               System.out.println("READ FILE" + reader);
               try {
                  while(reader.readLine()!=null){
                     if(reader.toString().contains(p)== true) break;
                     reader.readLine();
                  }
                  String[] pid = reader.toString().split("|");
                  String pid3 = pid[3];
                  for (int x =0; x<pid.length; x++){
                  System.out.println("PID " + (x+1) + " " + pid[x]);
                  }
                  int q = 1;
                  while(pn.load(Patient_identifier.class, q) != null){
                     System.out.println("PATIENT IDENTIFIER READ " + q);
                     Patient_identifier id = (Patient_identifier) pn.load(Patient_identifier.class, q);
                     if (pid3 == id.getIdentifier()){
                        int piid = id.getPatient_id();
                        int j = 1;
                        while(ph.load(Patient_phone.class, j) != null){
                           System.out.println("PATIENT PHONE READ " + j);
                           Patient_phone phone = (Patient_phone) ph.load(Patient_phone.class, j);
                           if (piid == Integer.parseInt(phone.getPatient_id()) && phone.isReceive_notifications() == true){
                              new sendsms(phone.getPhone_number(), "US");
                              break;
                           }
                           j++;
                        }
                        break;
                     }
                     q++;
                  }
                  ph.close();
                  pn.close();
               } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               } 
            }
            Hl7_in_archive.setCount(i+1);
            break;
         }
         i++;
      }
      s.close();
     
   }


}
