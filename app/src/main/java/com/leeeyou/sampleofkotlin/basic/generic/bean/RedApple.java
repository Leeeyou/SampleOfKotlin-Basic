package com.leeeyou.sampleofkotlin.basic.generic.bean;

public class RedApple extends Apple {
    public RedApple(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "我是：" + name;
    }
}
