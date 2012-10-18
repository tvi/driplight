package models;

import java.util;

@Entity

public class Assignement extends Models {
	@OneToOne
	User author;
	@ManyToMany
	list<User> SignedUpUsers;
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