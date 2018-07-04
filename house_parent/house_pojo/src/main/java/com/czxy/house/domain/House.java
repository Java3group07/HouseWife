package com.czxy.house.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="h_house")
public class House {
	@Id
    private Integer hid;				//房源id

    private String image;				//房屋图片

    private Integer money;				//租金

    private String specification;		//房屋户型(三室一厅...)

    private String model;				//房屋面积

    private String genre;				//房屋类型(住宅...)

    private String orie;				//朝向

    private String lnum;				//楼层

    private String fitment;				//装修情况(普装,精装,未装修)

    private Integer situation;			//现状(0空闲、1已出租)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date indate;				//可入住时间和可看房时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date constime;				//建造年代

    private String traffic;				//交通信息

    private String remark;				//房源描述

    private String address;				//小区地址

    private Integer state;				//租房类型(0整租,1,合租,2,短租,3写字楼)

    private String housename;			//房屋姓名
    
    private Integer hotnum;				//房屋热度
    
    private Landlord landlord;			//房东
    
    private Integer uid;				//用户ID
    
    private Order orders;				//订单
    
    
    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre == null ? null : genre.trim();
    }

    public String getOrie() {
        return orie;
    }

    public void setOrie(String orie) {
        this.orie = orie == null ? null : orie.trim();
    }

    public String getLnum() {
        return lnum;
    }

    public void setLnum(String lnum) {
        this.lnum = lnum == null ? null : lnum.trim();
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment == null ? null : fitment.trim();
    }

    public Integer getSituation() {
        return situation;
    }

    public void setSituation(Integer situation) {
        this.situation = situation;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getConstime() {
        return constime;
    }

    public void setConstime(Date constime) {
        this.constime = constime;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public Integer getHotnum() {
		return hotnum;
	}

	public void setHotnum(Integer hotnum) {
		this.hotnum = hotnum;
	}
	public Landlord getLandlord() {
		return landlord;
	}
	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}
	
	
}