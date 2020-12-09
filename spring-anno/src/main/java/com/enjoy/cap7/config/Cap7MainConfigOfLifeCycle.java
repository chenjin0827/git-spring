package com.enjoy.cap7.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * bean的生命周期
 * 创建---初始化---销毁
 */
@Configuration
@ComponentScan("com.enjoy.cap7.bean")
public class Cap7MainConfigOfLifeCycle {
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person.......");
        return new Person("cap7---james", 20);
    }

    /**
     * 可以通过@Bean指定初始化和销毁方法
     * 单实例: 当容器关闭的时候,会调用destroy消耗 即app.close()
     * 多实例容器不负责销毁，由自己控制
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike bike() {
        return new Bike();
    }

}
