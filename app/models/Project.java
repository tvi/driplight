package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Project extends Model {
 
    public String name;
    public String password;
    public String fullname;
    public boolean isAdmin;
    /*
    public Project(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }*/
 
}