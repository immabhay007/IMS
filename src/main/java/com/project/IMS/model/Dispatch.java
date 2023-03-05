package com.project.IMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dispatch {
	@Id
	@GeneratedValue
	private int jobId;
	private String jobName;
	private String customer;
	private String commitedDate;
	private String dispatchOn;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCommitedDate() {
		return commitedDate;
	}

	public void setCommitedDate(String commitedDate) {
		this.commitedDate = commitedDate;
	}

	public String getDispatchOn() {
		return dispatchOn;
	}

	public void setDispatchOn(String dispatchOn) {
		this.dispatchOn = dispatchOn;
	}

}

