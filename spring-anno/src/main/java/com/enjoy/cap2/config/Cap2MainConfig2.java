package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ComponentScan 指定要扫描的包
 * excludeFilters=Filter[]指定扫描的时候按照什么规则排除哪些组件
 * includeFilters=Filter[]指定扫描的时候只需要包含哪些组件
 * FilterType.ANNOTATION：按照注解
 * FilterType.ASSIGNABLE_TYPE：按照给定的类型；比如按BookService类型
 * FilterType.ASPECTJ：使用ASPECTJ表达式
 * FilterType.REGEX：使用正则指定
 * FilterType.CUSTOM：使用自定义规则，自已写类，实现TypeFilter接口
 */
@Configuration//告诉spring这是一个配置类
@ComponentScan(value = {"com.enjoy.cap2"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes ={Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
},useDefaultFilters = true)//默认是true，扫描所有组件，要改成false，使用自定义扫描范围
public class Cap2MainConfig2 {
    @Bean
    public Person person() {
        return new Person("cap2-jiangying", 20);
    }
}
