package com.enjoy;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap5.config.Cap5MainConfig;
import com.enjoy.cap6.config.Cap6MainConfig;

public class Cap6Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
        System.out.println("IOC容器创建完成........");
        Object bean1 = app.getBean("jamesFactoryBean");
        Object bean2 = app.getBean("jamesFactoryBean");//取Money
        System.out.println("bean的类型=" + bean1.getClass());
        System.out.println(bean1 == bean2);//使用isSingleton默认为true
        Object bean = app.getBean("&jamesFactoryBean");//id前面加个&获取工厂bean本身对象
        System.out.println("bean==="+bean);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
