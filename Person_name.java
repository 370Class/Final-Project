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
@Table(name="person_name")
public class Person_name {

    @Id
    @Column(name="person_name_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    private int person_name_id;
    private int person_id;
    private String given_name;
   public int getPerson_name_id() {
      return person_name_id;
   }
   public void setPerson_name_id(int person_name_id) {
      this.person_name_id = person_name_id;
   }
   public int getPerson_id() {
      return person_id;
   }
   public void setPerson_id(int person_id) {
      this.person_id = person_id;
   }
   public String getGiven_name() {
      return given_name;
   }
   public void setGiven_name(String given_name) {
      this.given_name = given_name;
   }
       
    
}
   

   
