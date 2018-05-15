package com.zxz.my.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 引用资源文件
 */
@Component
@ConfigurationProperties(prefix = "com.zxz")//前缀
@PropertySource(value = "classpath:resources.properties")
public class TheResources {
    private String name;
    private Integer age;
    private String  sex;

    public TheResources() {
    }

    public TheResources(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
