package com.farseer.pattern.hamburg;

/**
 * Created by zhaosc on 16/4/12.
 * 汉堡
 */
public class Hamburg {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("准备...");
    }

    /**
     *
     */
    public void make() {
        System.out.println("制作...");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println("打包...");
    }
}
