package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Submission extends Program {
 
	public Integer timestamp;
    public Submission() {
    }
 
}