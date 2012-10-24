package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Team extends Model {
 
	public String name;
    @ManyToMany
    public List<User> admins;
    @ManyToMany
    public List<User> members;
    
    
    public Team(String name, User creator) {
    	this.name = name;
    	this.admins.add(creator);
    }
 
}