package com.enjoy.cap4.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 *主要针对单实例bean ，默认在容器启动的时候创建对象
 * 懒加载：容器启动时候不创建对象，仅当第一次使用（即获取bean的时候）才创建并初始化对象
 */
@Configuration
public class Cap4MainConfig {
    @Bean
    @Lazy
    public Person person(){
        System.out.println("给容器中添加person.......");
        return new Person("cap4----james",20);
    }
}
