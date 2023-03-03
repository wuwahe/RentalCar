package com.qfedu.sys.domain;

public class Menu {
    private Integer id;
    private Integer pid;
    private String title;
    private String href;
    private Integer spread;
    private String target;
    private String icon;
    private Integer available;


    public Menu() {
    }

    public Menu(Integer id, Integer pid, String title, String href, Integer spread, String target, String icon, Integer available) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.href = href;
        this.spread = spread;
        this.target = target;
        this.icon = icon;
        this.available = available;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return href
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置
     * @param href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取
     * @return spread
     */
    public Integer getSpread() {
        return spread;
    }

    /**
     * 设置
     * @param spread
     */
    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    /**
     * 获取
     * @return target
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * 获取
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取
     * @return available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * 设置
     * @param available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String toString() {
        return "Menu{id = " + id + ", pid = " + pid + ", title = " + title + ", href = " + href + ", spread = " + spread + ", target = " + target + ", icon = " + icon + ", available = " + available + "}";
    }
}
