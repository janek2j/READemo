package model;
/**
 * 
 */

/**
 * @author Janek
 *
 */
public class Owner implements Customer {
	public String name;
	private  String id;
	
	public Owner() {
		name = "FirstName SecondName";
		id = "owner id";
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
