package com.qfedu.sys.domain;

public class UserVo extends User{
    /*
    * 分页的参数
    * */
   private Integer page;
   private Integer limit;
   private String code;

    //接受多个角色ID
    private Integer[] ids;


    public UserVo() {
    }

    public UserVo(Integer page, Integer limit, String code, Integer[] ids) {
        this.page = page;
        this.limit = limit;
        this.code = code;
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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取
     * @return ids
     */
    public Integer[] getIds() {
        return ids;
    }

    /**
     * 设置
     * @param ids
     */
    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public String toString() {
        return "UserVo{page = " + page + ", limit = " + limit + ", code = " + code + ", ids = " + ids + "}";
    }
}
