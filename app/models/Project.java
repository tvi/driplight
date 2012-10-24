package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Project extends Model {
 
	public User creator;
    public String name;
    @OneToMany
    public List<Team> teams;
    
    /*Temporary, need to check*/
    //public String newTeamName;
    
    public Project(User creator, String name, String newTeamName) {
        this.creator = creator;
        this.name = name;
        
        Team defTeam = new Team(newTeamName, creator);
        this.teams.add(defTeam);
    }
    
    public String toString(){
    	return name;
    }
 
}