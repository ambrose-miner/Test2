package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
@Scope("prototype")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // adds auto_increment feature to class product
	@Column(name = "employeeid") // makes redefines column name in MySQL 
	//*don't want auto generated two word column names
	private int employeeId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	private String department;
	@Column(name = "jobtitle")
	private String jobTitle;
	@Column(name = "timeincompany")
	private int timeInCompany;
	@Column(name = "payrate")
	private int payRate;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getTimeInCompany() {
		return timeInCompany;
	}
	public void setTimeInCompany(int timeInCompany) {
		this.timeInCompany = timeInCompany;
	}
	public int getPayRate() {
		return payRate;
	}
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

}
