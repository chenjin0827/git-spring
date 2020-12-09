package com.enjoy.cap7.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
/**
 * 使用JSR250规则定义的(java规范)两个注解来实现初始化和销毁
 */
public class Jeep {
    public Jeep() {
        System.out.println("进入Jeep构造方法===");
    }

    @PostConstruct
    private void init() {
        System.out.println("Jeep初始化===");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Jeep销毁===");
    }
}
