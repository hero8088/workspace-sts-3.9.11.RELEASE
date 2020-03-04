package com.itwill0.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextMain {

	public static void main(String[] args) {
		/*
		 * ApplicationContext[BeanFactory]객체생성
		 *  - Spring Container객체생성
		 */
		System.out.println("-------------Spring Container초기화시작--------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill0/context/0.applicationContext.xml");
		System.out.println("-------------Spring Container초기화끝----------");
		
		ProductService productService1=
				(ProductService)applicationContext.getBean("productService");
		System.out.println("### "+productService1.productList());
		ProductService productService2=
				(ProductService)applicationContext.getBean("productService");
		System.out.println("### "+productService2.productList());
		
		if(productService1==productService2) {
			System.out.println(productService1+"=="+productService2);
		}
	}

}
