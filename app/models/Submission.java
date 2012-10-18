package models;

import java.util.*;

@Entity
class Submission extends Model {
	@OneToOne 
	public User author;
	@OneToOne
	public Assignement task;
}