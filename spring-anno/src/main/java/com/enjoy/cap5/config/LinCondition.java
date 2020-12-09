package com.enjoy.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinCondition implements Condition {
    /**
     * @param context  判断条件可以使用的上下文
     * @param metadata 注解的信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        获取到IOC容器正在使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//获取当前环境变量（包括我们系统是win还是linux）
        Environment environment = context.getEnvironment();
        String os_name = environment.getProperty("os.name");
        if (os_name.contains("linux")) {
            return true;
        }
        return false;
    }
}
