package models;

import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class Assignement extends Model {
	User author;
	@ManyToMany
	List<User> SignedUpUsers;
	public String year;
	public String subject;
	public String taskName;
	
	public Assignement(User author, String year, String subject, String taskName) {
		this.author = author;
		this.year = year;
		this.subject = subject;
		this.taskName = taskName;
	}
}