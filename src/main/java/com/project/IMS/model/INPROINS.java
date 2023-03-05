package com.project.IMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class INPROINS 
{
	@Id
	@GeneratedValue
	private int job_id;
	private String Operaton;
	private int Employee_ID;
	private String Inspector;
	private String Status;
	private String Date;
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getOperaton() {
		return Operaton;
	}
	public void setOperaton(String operaton) {
		Operaton = operaton;
	}
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getInspector() {
		return Inspector;
	}
	public void setInspector(String inspector) {
		Inspector = inspector;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	
}
