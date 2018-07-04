package com.czxy.house.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "h_landlord")
public class Landlord {

	@Id
	private Integer lrid;
	private Integer hid;
	private String username;
	private String phone;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="onhire_date")
	private Date onhireDate;
	private String type;
	private String address;

	private String housetype;
	private Integer rent;
     
	private House house;

	public Integer getLrid() {
		return lrid;
	}

	public void setLrid(Integer lrid) {
		this.lrid = lrid;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getOnhireDate() {
		return onhireDate;
	}

	public void setOnhireDate(Date onhireDate) {
		this.onhireDate = onhireDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHousetype() {
		return housetype;
	}

	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}

	public Integer getRent() {
		return rent;
	}

	public void setRent(Integer rent) {
		this.rent = rent;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
