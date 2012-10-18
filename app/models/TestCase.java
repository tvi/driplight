package models;

import java.util.*;

@Entity
class TextCase extends Submission {
	public String Filename;
	
	public TextCase(String Filename) {
		this.Filename = Filename;
	}
}