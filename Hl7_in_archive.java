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
@Table(name="hl7_in_archive")
public class Hl7_in_archive {

    @Id
    @Column(name="hl7_in_archive_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int hl7_in_archive_id;
    private int hl7_source;
    private String hl7_source_key;
    private String hl7_data;
    private String date_created;
    private int message_state;
    private String uuid;
    private static long count = 1;
    
    public int getHl7_in_archive_id() {
       return hl7_in_archive_id;
    }
    public void setHl7_in_archive_id(int hl7_in_archive_id) {
       this.hl7_in_archive_id = hl7_in_archive_id;
    }
    public int getHl7_source() {
       return hl7_source;
    }
    public void setHl7_source(int hl7_source) {
       this.hl7_source = hl7_source;
    }
    public String getHl7_source_key() {
       return hl7_source_key;
    }
    public void setHl7_source_key(String hl7_source_key) {
       this.hl7_source_key = hl7_source_key;
    }
    public String getHl7_data() {
       return hl7_data;
    }
    public void setHl7_data(String hl7_data) {
       this.hl7_data = hl7_data;
    }
    public String getDate_created() {
       return date_created;
    }
    public void setDate_created(String data_created) {
       this.date_created = data_created;
    }
    public int getMessage_state() {
       return message_state;
    }
    public void setMessage_state(int message_state) {
       this.message_state = message_state;
    }
    public String getUuid() {
       return uuid;
    }
    public void setUuid(String uuid) {
       this.uuid = uuid;
    }
    
    public static long getCount(){
       return count;
    }
    
    public static void setCount(long count){
       Hl7_in_archive.count = count;
    }

        
}
   

   
