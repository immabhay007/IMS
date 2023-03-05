package com.project.IMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RMI //Raw_Material_Inspection
{
	    @Id
	    @GeneratedValue
	    private int Sr_no;
	    private double Size;
	    private int Quantity;
	    private String Name;
	    private String Inspector;
	    private String Supplier;
	    private String Date;
	    private String Status;
	    
	    
		public double getSize() {
			return Size;
		}
		public void setSize(Long size) {
			Size = size;
		}
		public int getQuantity() {
			return Quantity;
		}
		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getInspector() {
			return Inspector;
		}
		public void setInspector(String inspector) {
			Inspector = inspector;
		}
		public String getSupplier() {
			return Supplier;
		}
		public void setSupplier(String supplier) {
			Supplier = supplier;
		}
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}    
	    	    
}
