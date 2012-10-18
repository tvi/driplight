package models;

import java.util.*;

@Entity
class Program extends Submission {
	public String FileName;
	
	public Program(String Filename) {
		this.Filename = Filename;
	}
}