package com.project.IMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class JD 
{
	@Id
	@GeneratedValue
	private int JobId;
	private String JobName;
	private String JobMaterial;
	private String DeliveryDate;
	private String Status;
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public String getJobMaterial() {
		return JobMaterial;
	}
	public void setJobMaterial(String jobMaterial) {
		JobMaterial = jobMaterial;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
	
}
