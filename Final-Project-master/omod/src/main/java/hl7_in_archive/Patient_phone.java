package hl7_in_archive;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="patient_phone")
public class Patient_phone {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //private int id;
    private String patient_id;
    private String phone_provider_name;
    private String phone_number;
    private boolean receive_notifications;
    
   public String getPatient_id() {
      return patient_id;
   }
   public void setPatient_id(String patient_id) {
      this.patient_id = patient_id;
   }
   public String getPhone_provider_name() {
      return phone_provider_name;
   }
   public void setPhone_provider_name(String phone_provider_name) {
      this.phone_provider_name = phone_provider_name;
   }
   public String getPhone_number() {
      return phone_number;
   }
   public void setPhone_number(String phone_number) {
      this.phone_number = phone_number;
   }
   public boolean isReceive_notifications() {
      return receive_notifications;
   }
   public void setReceive_notifications(boolean receive_notifications) {
      this.receive_notifications = receive_notifications;
   }
   
    

        
}
   

   
