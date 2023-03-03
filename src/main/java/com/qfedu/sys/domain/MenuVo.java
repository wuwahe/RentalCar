package com.qfedu.sys.domain;

public class MenuVo extends Menu{
    private Integer page;
    private Integer limit;

    public MenuVo() {
    }

    public MenuVo(Integer page, Integer limit) {
        this.page = page;
        this.limit = limit;
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

    public String toString() {
        return "MenuVo{page = " + page + ", limit = " + limit + "}";
    }
}
