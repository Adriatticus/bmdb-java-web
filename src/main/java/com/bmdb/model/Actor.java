package com.bmdb.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity

public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String FirstName;
	private String LastName;
	private String Gender;
	private LocalDate Birthdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public LocalDate getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		Birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender
				+ ", Birthdate=" + Birthdate + "]";
	}
	
	
	
}
