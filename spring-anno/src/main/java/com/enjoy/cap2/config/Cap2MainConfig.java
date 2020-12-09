package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ComponentScan(value="com.enjoy.cap2")表示扫描此目录下的包
 */
//@Configuration
//@ComponentScan(value = "com.enjoy.cap2", includeFilters = {@ComponentScan.Filter
//        (type = FilterType.CUSTOM, classes = {JamesTypeFilter.class})}
//        , useDefaultFilters = false)
public class Cap2MainConfig {
//    @Bean
//    /**
//     * person01()方法名默认为bean的ID
//     * 如何改bean 的id值
//     * 1、直接改方法名
//     * 2、直接使用@Bean("cap-james")
//     */
//    public Person person01() {
//        return new Person("cap-james", 22);
//    }
}
