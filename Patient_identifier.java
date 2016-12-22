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
@Table(name="patient_identifier")
public class Patient_identifier {

    @Id
    @Column(name="patient_identifier_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    private int patient_identifier_id;
    private int patient_id;
    private String identifier;
    
   public String getIdentifier() {
      return identifier;
   }
   public void setIdentifier(String identifier) {
      this.identifier = identifier;
   }
   public int getPatient_identifier_id() {
      return patient_identifier_id;
   }
   public void setPatient_identifier_id(int patient_identifier_id) {
      this.patient_identifier_id = patient_identifier_id;
   }
   public int getPatient_id() {
      return patient_id;
   }
   public void setPatient_id(int patient_id) {
      this.patient_id = patient_id;
   }
    
    
}
   

   
