package com.enjoy.cap1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enjoy.cap1.Person;

//配置类====配置文件
@Configuration
public class MainConfig {
    //给容器中注册一个bean, 类型为返回值的类型,
    /**
     * person01()方法名默认为bean的ID
     * 如何改bean 的id值
     * 1、直接改方法名
     * 2、直接使用@Bean("cap-james")
     */
    @Bean("abcPerson")
    public Person person01(){
        return new Person("james",20);
    }
}
