package com.vedant.admin.classes_application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class locations{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//Location Information Instance Variables
	@Column
	private String bank;
	
	@Column
	private String bank_code;
	
	@Column
	private String state;
	
	@Column(columnDefinition = "int default 20")
	private int state_code;
	
	@Column
	private String district;
	
	
	@Column
	private String block;
	
	
	@Column
	private String panchayat;
	
	@Column
	private String village;
	
	@Column
	private String linkbranch;
	
	@Column
	private String distance;
	
	
	@Column(columnDefinition = "int default 3")
	private int status_code;
	
	@Column(columnDefinition = "int default 0")
	private int is_temp;

	
	
	//	Parameterized Constructor
	public locations(int id, String bank, String bank_code, String state, int state_code, String district, String block,
			String panchayat, String village, String linkbranch, int status_code, String distance,int is_temp) {
		super();
		this.id = id;
		this.bank = bank;
		this.bank_code = bank_code;
		this.state = state;
		this.state_code = state_code;
		this.district = district;
		this.block = block;
		this.panchayat = panchayat;
		this.village = village;
		this.linkbranch = linkbranch;
		this.status_code = status_code;
		this.distance = distance;
		this.is_temp=is_temp;
	}
	
	
	// Normal Constructor
	public locations() {
		super();
	}
	
	
	
	// Getter And Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public String getBank_code() {
		return bank_code;
	}


	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getState_code() {
		return state_code;
	}


	public void setState_code(int state_code) {
		this.state_code = state_code;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getBlock() {
		return block;
	}


	public void setBlock(String block) {
		this.block = block;
	}


	public String getPanchayat() {
		return panchayat;
	}


	public void setPanchayat(String panchayat) {
		this.panchayat = panchayat;
	}


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public String getLinkbranch() {
		return linkbranch;
	}


	public void setLinkbranch(String linkbranch) {
		this.linkbranch = linkbranch;
	}


	public int getStatus_code() {
		return status_code;
	}


	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}


	public String getDistance() {
		return distance;
	}


	public void setDistance(String distance) {
		this.distance = distance;
	}


	public int getIs_temp() {
		return is_temp;
	}


	public void setIs_temp(int is_temp) {
		this.is_temp = is_temp;
	}
	
	
	
	

	
	
	
	
	

	
	
	
	
		

}
