package com.czxy.house.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="h_contract")
public class Contract {
	@Id
	private Integer conid;//图片id
	private Integer hid;//房源id
	private Integer uid;//用户id
	private String cphoto;//合同图片
	public Integer getConid() {
		return conid;
	}
	public void setConid(Integer conid) {
		this.conid = conid;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getCphoto() {
		return cphoto;
	}
	public void setCphoto(String cphoto) {
		this.cphoto = cphoto;
	}
	public Contract(Integer conid, Integer hid, Integer uid, String cphoto) {
		super();
		this.conid = conid;
		this.hid = hid;
		this.uid = uid;
		this.cphoto = cphoto;
	}
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contract [conid=" + conid + ", hid=" + hid + ", uid=" + uid + ", cphoto=" + cphoto + "]";
	}
	
}