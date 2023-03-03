package com.qfedu.bus.vo;

import com.qfedu.bus.domain.Customer;

public class CustomerVo extends Customer {

    //分页参数
    private Integer page;
    private Integer limit;


    //介绍多个客户ID
    private String[] ids;

    public CustomerVo() {
    }

    public CustomerVo(Integer page, Integer limit, String[] ids) {
        this.page = page;
        this.limit = limit;
        this.ids = ids;
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
     * @return ids
     */
    public String[] getIds() {
        return ids;
    }

    /**
     * 设置
     * @param ids
     */
    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public String toString() {
        return "CustomerVo{page = " + page + ", limit = " + limit + ", ids = " + ids + "}";
    }
}
