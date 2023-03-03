package com.qfedu.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public class Customer {
    private String identity;
    private String custname;
    private Integer sex;
    private String address;
    private String phone;
    private String career;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;



    public Customer() {
    }

    public Customer(String identity, String custname, Integer sex, String address, String phone, String career, Date createtime) {
        this.identity = identity;
        this.custname = custname;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.career = career;
        this.createtime = createtime;
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
     * @return custname
     */
    public String getCustname() {
        return custname;
    }

    /**
     * 设置
     * @param custname
     */
    public void setCustname(String custname) {
        this.custname = custname;
    }

    /**
     * 获取
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return career
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置
     * @param career
     */
    public void setCareer(String career) {
        this.career = career;
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
        return "Customer{identity = " + identity + ", custname = " + custname + ", sex = " + sex + ", address = " + address + ", phone = " + phone + ", career = " + career + ", createtime = " + createtime + "}";
    }
}
