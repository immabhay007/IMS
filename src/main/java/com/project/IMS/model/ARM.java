package com.project.IMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ARM  //Avialable_Raw_Material
{
	@Id
	@GeneratedValue
	 private int Sr_no;
	 private String Material;
	 private String Type;
	 private String Size;
	 private int Quantity;
	public int getSr_no() {
		return Sr_no;
	}
	public void setSr_no(int sr_no) {
		Sr_no = sr_no;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	 
	 
}
