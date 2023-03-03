package com.qfedu.sys.utils;
/*
* 在layui中展示数据，需要用到该对象
* */
public class DataGridView {
    private Integer code = 0;
    private  String msg = "";
    private  Long count;
    private  Object data;


    public DataGridView() {
    }

    public DataGridView(Object data) {
        this.data = data;
    }

    public DataGridView(Long count, Object data) {
        this.count = count;
        this.data = data;
    }

    public DataGridView(Integer code, String msg, Long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取
     * @return count
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 获取
     * @return data
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    public String toString() {
        return "DateGridView{code = " + code + ", msg = " + msg + ", count = " + count + ", data = " + data + "}";
    }
}
