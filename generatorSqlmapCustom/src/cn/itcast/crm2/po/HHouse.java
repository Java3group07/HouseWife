package cn.itcast.crm2.po;

import java.util.Date;

public class HHouse {
    private Integer hid;

    private String image;

    private Integer money;

    private String specification;

    private String model;

    private String genre;

    private String orie;

    private String lnum;

    private String fitment;

    private Integer situation;

    private Date indate;

    private Date constime;

    private String traffic;

    private String remark;

    private String address;

    private Integer state;

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
}