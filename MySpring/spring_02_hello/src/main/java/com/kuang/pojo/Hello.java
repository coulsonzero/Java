package com.kuang.pojo;

/**
 * @author coulson
 * @version 2021-07-18 14:42
 */
public class Hello {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Hello"+name);
    }
    @Override
    public String toString() {
        return "Hello" +
                "name=" + name + '\'' + '}';
    }
}
