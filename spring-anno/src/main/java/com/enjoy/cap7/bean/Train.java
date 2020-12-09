package com.enjoy.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train  implements  InitializingBean,DisposableBean{
    public Train() {
        System.out.println("进入到train的构造方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("train 销毁了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("train 初始化");
    }
}
