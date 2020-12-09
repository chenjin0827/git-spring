package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class JamesBeanPostProcessor implements BeanPostProcessor {
    /**
     * postProcessBeforeInitialization():在初始化之前进行后置处理工作(在init-method之前),
     * 什么时候调用:任何初始化方法调用之前(比如在InitializingBean的afterPropertiesSet初始化之前,或自定义init-method调用之前使用)
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization...." + beanName + "---->" + bean);
//        返回的一个对象（传过来的对象），也可包装好再返回
        return bean;
    }

    /**
     * 在初始化后进行后置处理工作
     * 比如在InitializingBean的afterPropertiesSet()之后处理
     * eg执行效果：
     * 顺序1、train 初始化
     * 顺序2、postProcessAfterInitialization....train---->com.enjoy.cap7.bean.Train@37918c79
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization...." + beanName + "---->" + bean);
        return bean;
    }
}
