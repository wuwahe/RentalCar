package com.qfedu.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Rent {

    private String rentid;
    private Double price;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone =
            "GMT+8")
    private Date begindate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone =
            "GMT+8")
    private Date returndate;
    private Integer rentflag;
    private String identity;
    private String carnumber;
    private String opername;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone =
            "GMT+8")
    private Date createtime;


    public Rent() {
    }

    public Rent(String rentid, Double price, Date begindate, Date returndate, Integer rentflag, String identity, String carnumber, String opername, Date createtime) {
        this.rentid = rentid;
        this.price = price;
        this.begindate = begindate;
        this.returndate = returndate;
        this.rentflag = rentflag;
        this.identity = identity;
        this.carnumber = carnumber;
        this.opername = opername;
        this.createtime = createtime;
    }

    /**
     * 获取
     * @return rentid
     */
    public String getRentid() {
        return rentid;
    }

    /**
     * 设置
     * @param rentid
     */
    public void setRentid(String rentid) {
        this.rentid = rentid;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return begindate
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * 设置
     * @param begindate
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
     * 获取
     * @return returndate
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * 设置
     * @param returndate
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    /**
     * 获取
     * @return rentflag
     */
    public Integer getRentflag() {
        return rentflag;
    }

    /**
     * 设置
     * @param rentflag
     */
    public void setRentflag(Integer rentflag) {
        this.rentflag = rentflag;
    }

    /**
     * 获取
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 获取
     * @return carnumber
     */
    public String getCarnumber() {
        return carnumber;
    }

    /**
     * 设置
     * @param carnumber
     */
    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    /**
     * 获取
     * @return opername
     */
    public String getOpername() {
        return opername;
    }

    /**
     * 设置
     * @param opername
     */
    public void setOpername(String opername) {
        this.opername = opername;
    }

    /**
     * 获取
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String toString() {
        return "Rent{rentid = " + rentid + ", price = " + price + ", begindate = " + begindate + ", returndate = " + returndate + ", rentflag = " + rentflag + ", identity = " + identity + ", carnumber = " + carnumber + ", opername = " + opername + ", createtime = " + createtime + "}";
    }
}
