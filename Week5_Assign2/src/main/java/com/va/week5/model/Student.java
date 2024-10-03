package com.va.week5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private int studentId;

	@Column()
	private String userName;
	@Column()
	private String password;
	@Column()
	private String firstname;
	@Column()
	private String lastname;
	@Column()
	private String address;
	@Column()
	private String city;
	@Column()
	private String postalCode;
	
	public int getStudentId() {
		return studentId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Student(int studentId, String userName, String password, String firstname, String lastname, String address,
			String city, String postalCode) {
		
		this.studentId = studentId;
		this.userName = userName;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
	}

}
