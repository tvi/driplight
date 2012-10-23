package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Program extends Model {
 
    public String email;
    public String password;
    public String fullname;
    public boolean isAdmin;
    public User owner;
    
    
    public Program() {
        
    }
 
}