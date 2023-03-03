package com.qfedu.bus.vo;

import com.qfedu.bus.domain.Rent;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RentVo extends Rent {
    /*
    * 分页参数
    * */
    private Integer page;
    private Integer limit;
    /*
    * 扩展参数，将前台时间提交到后台
    * */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date starTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date entTime;


    public RentVo() {
    }

    public RentVo(Integer page, Integer limit, Date starTime, Date entTime) {
        this.page = page;
        this.limit = limit;
        this.starTime = starTime;
        this.entTime = entTime;
    }

    /**
     * 获取
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * 设置
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 获取
     * @return starTime
     */
    public Date getStarTime() {
        return starTime;
    }

    /**
     * 设置
     * @param starTime
     */
    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    /**
     * 获取
     * @return entTime
     */
    public Date getEntTime() {
        return entTime;
    }

    /**
     * 设置
     * @param entTime
     */
    public void setEntTime(Date entTime) {
        this.entTime = entTime;
    }

    public String toString() {
        return "RentVo{page = " + page + ", limit = " + limit + ", starTime = " + starTime + ", entTime = " + entTime + "}";
    }
}
