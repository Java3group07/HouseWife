package com.czxy.house.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="h_subscribe")
public class Subscribe{
	@Id
	private Integer suid;//-- 预约id
	private Integer uid;//-- 用户id
	private Integer hid;//-- 房源id
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sudate;//-- 看房时间
	private String username;
	private String phone;
	public Integer getSuid() {
		return suid;
	}
	public void setSuid(Integer suid) {
		this.suid = suid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Date getSudate() {
		return sudate;
	}
	public void setSudate(Date sudate) {
		this.sudate = sudate;
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
	public Subscribe(Integer suid, Integer uid, Integer hid, Date sudate, String username, String phone) {
		super();
		this.suid = suid;
		this.uid = uid;
		this.hid = hid;
		this.sudate = sudate;
		this.username = username;
		this.phone = phone;
	}
	public Subscribe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subscribe [suid=" + suid + ", uid=" + uid + ", hid=" + hid + ", sudate=" + sudate + ", username="
				+ username + ", phone=" + phone + "]";
	}
	
}