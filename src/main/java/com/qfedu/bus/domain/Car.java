package com.qfedu.bus.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Car {
   private String carnumber; //车牌
   private String cartype; //车辆类型
   private String color; //车辆颜色
   private Double price; //车辆价格
   private Double rentprice; //租金
   private Double deposit; //押金
   private Integer isrenting; //是否出租 0未出租 1已出租
   private String description; //描述
   private String carimg; //车辆图片
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
   private Date createtime; //录入时间


    public Car() {
    }

    public Car(String carnumber, String cartype, String color, Double price, Double rentprice, Double deposit, Integer isrenting, String description, String carimg, Date createtime) {
        this.carnumber = carnumber;
        this.cartype = cartype;
        this.color = color;
        this.price = price;
        this.rentprice = rentprice;
        this.deposit = deposit;
        this.isrenting = isrenting;
        this.description = description;
        this.carimg = carimg;
        this.createtime = createtime;
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
     * @return cartype
     */
    public String getCartype() {
        return cartype;
    }

    /**
     * 设置
     * @param cartype
     */
    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return rentprice
     */
    public Double getRentprice() {
        return rentprice;
    }

    /**
     * 设置
     * @param rentprice
     */
    public void setRentprice(Double rentprice) {
        this.rentprice = rentprice;
    }

    /**
     * 获取
     * @return deposit
     */
    public Double getDeposit() {
        return deposit;
    }

    /**
     * 设置
     * @param deposit
     */
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * 获取
     * @return isrenting
     */
    public Integer getIsrenting() {
        return isrenting;
    }

    /**
     * 设置
     * @param isrenting
     */
    public void setIsrenting(Integer isrenting) {
        this.isrenting = isrenting;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return carimg
     */
    public String getCarimg() {
        return carimg;
    }

    /**
     * 设置
     * @param carimg
     */
    public void setCarimg(String carimg) {
        this.carimg = carimg;
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
        return "Car{carnumber = " + carnumber + ", cartype = " + cartype + ", color = " + color + ", price = " + price + ", rentprice = " + rentprice + ", deposit = " + deposit + ", isrenting = " + isrenting + ", description = " + description + ", carimg = " + carimg + ", createtime = " + createtime + "}";
    }
}
