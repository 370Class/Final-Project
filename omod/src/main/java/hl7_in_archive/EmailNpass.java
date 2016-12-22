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
@Table(name="emailNpass")
public class EmailNpass {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    private int id;
    private String email_name;
    private String password;
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getEmail_name() {
      return email_name;
   }
   public void setEmail_name(String email_name) {
      this.email_name = email_name;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
        
}
   

   
