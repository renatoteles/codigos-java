package entities;

public class Rent {

	String name;
	String email;
	int numQuarto;
	
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumQuarto() {
		return numQuarto;
	}
	
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public String toString() {
		return name + ", " + email;
	}
	
}
