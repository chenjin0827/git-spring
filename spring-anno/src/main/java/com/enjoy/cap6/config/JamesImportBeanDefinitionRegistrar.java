package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    /**
     * importingClassMetadata 当前类的注解信息
     * registry BeanDefinition注册类
     * 把所有需要添加到容器中的bean加入
     * 可以判定容器中是否已有对象存在作为条件，判定是否往容器条件某些新的对象
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean dog = registry.containsBeanDefinition("com.enjoy.cap6.bean.Dog");
        boolean cat = registry.containsBeanDefinition("com.enjoy.cap6.bean.Cat");
        //如果Dog和Cat同时存在于我们IOC容器中,那么创建Pig类, 加入到容器
        //对于我们要注册的bean, 给bean进行封装,
        if (dog && cat) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", beanDefinition);
        }
    }
}
