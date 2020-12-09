package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * 可以指定动物的类型，方便后面的创建
 */
public class JamesFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
