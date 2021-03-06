package com.enjoy;

import com.enjoy.cap2.config.Cap2MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap2.config.Cap2MainConfig;

/**
 * 重要
 * 测试的时候由于都是扫描的com.enjoy.cap2.config
 * 所以Cap2MainConfig和Cap2MainConfig最好是注释掉其中一个，不然会混乱
 */
public class Cap2Test {
	@Test
	public void test01(){
		//声明容器，将Cap2MainConfig的配置类加载到容器中
//		AnnotationConfigApplicationContext app =
//				new AnnotationConfigApplicationContext(Cap2MainConfig.class);
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(Cap2MainConfig2.class);
		//从容器中获取定义的bean名称
		String[] names = app.getBeanDefinitionNames();
		for(String name:names){
			System.out.println("容器中的名字==="+name);
		}
	}
}
