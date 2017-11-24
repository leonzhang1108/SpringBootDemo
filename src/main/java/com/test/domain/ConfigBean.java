package com.test.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Author: jianliangzhang
 * Date: 2017/11/23
 * Time: 14:35
 */
@ConfigurationProperties(prefix = "com.test")
public class ConfigBean {
    private String name;
    private String want;
    private String wish;
    public String getName() {
        return name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }
}
