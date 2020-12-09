package com.enjoy.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap1.config.MainConfig;

public class MainTest2 {
    public static void main(String args[]) {
        // 扫描MainConfig有注解@Configuration 的方法，并将对象放入容器
        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        //从容器中获取bean 根据类型取出对象
        Person bean = app.getBean(Person.class);
        System.out.println(bean);
        bean=(Person) app.getBean("abcPerson");
        //根据名称取出对象
        System.out.println(bean);
        //取出所有满足Person类型的对象并打印
        String[] namesForBean = app.getBeanNamesForType(Person.class);
        for (String name : namesForBean) {
            System.out.println(name);
        }


    }
}
