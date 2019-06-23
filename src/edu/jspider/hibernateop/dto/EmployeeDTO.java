package edu.jspider.hibernateop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//tells hib that object of this class will get mapped to a table.
@Table(name="employee_table")// specify which table the entity is mapped to.
public class EmployeeDTO implements Serializable	//Learn About seralization
{
	@Id
	@Column(name="emp_id")
	private int empid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="salary")
	private double salary;
	
	
	public EmployeeDTO()
	{
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empid=" + empid + ", name=" + name + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	

}
