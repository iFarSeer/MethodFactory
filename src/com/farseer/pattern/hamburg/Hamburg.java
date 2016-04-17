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
        System.out.println(String.format("准备[%s]...", name));
    }

    /**
     *
     */
    public void make() {
        System.out.println(String.format("制作[%s]...", name));
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(String.format("打包[%s]...", name));
    }
}
