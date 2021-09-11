package com.vedant.admin.classes_application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal_info")
public class personalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String email_id;
	
	@Column
	private String mobile;
	
	@Column
	private String gender;
	
	@Column
	private String csp_image;
	
	@Column
	private String dob;
	
	@Column
	private String address;
	
	@Column
	private String koid;
	
	@Column
	private String pan_number;
	
	@Column
	private String pan_image;
	
	@Column
	private String aadhaar;
	
	@Column
	private String aadhaar_image;
	
	@Column
	private int location_id;
	
	

	public personalInfo(int id, String name, String email_id, String mobile, String gender, String csp_image,
			String dob, String address, String koid, String pan_number, String pan_image, String aadhaar,
			String aadhaar_image, int location_id) {
		super();
		this.id = id;
		this.name = name;
		this.email_id = email_id;
		this.mobile = mobile;
		this.gender = gender;
		this.csp_image = csp_image;
		this.dob = dob;
		this.address = address;
		this.koid = koid;
		this.pan_number = pan_number;
		this.pan_image = pan_image;
		this.aadhaar = aadhaar;
		this.aadhaar_image = aadhaar_image;
		this.location_id = location_id;
	}

	public personalInfo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCsp_image() {
		return csp_image;
	}

	public void setCsp_image(String csp_image) {
		this.csp_image = csp_image;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getKoid() {
		return koid;
	}

	public void setKoid(String koid) {
		this.koid = koid;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getPan_image() {
		return pan_image;
	}

	public void setPan_image(String pan_image) {
		this.pan_image = pan_image;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getAadhaar_image() {
		return aadhaar_image;
	}

	public void setAadhaar_image(String aadhaar_image) {
		this.aadhaar_image = aadhaar_image;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	
	
	

}
