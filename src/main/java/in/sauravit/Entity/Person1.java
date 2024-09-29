package in.sauravit.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person1 {
	@Id
	private Integer id;
	private String name;
	private String Gender;
	private char DOB;
	
	public Person1() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public char getDOB() {
		return DOB;
	}
	public void setDOB(char dOB) {
		DOB = dOB;
	}
	public Person1(Integer id, String name, String gender, char dOB) {
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + ", Gender=" + Gender + ", DOB=" + DOB + "]";
	}
	
	
	

}
