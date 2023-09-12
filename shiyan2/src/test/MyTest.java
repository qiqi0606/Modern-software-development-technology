package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotation.ConfigAnnotation;
import controller.TestController;

public class MyTest {
	public static void main(String[] args) {
		//��ʼ��Spring����ApplicationContext
		AnnotationConfigApplicationContext appCon = 
				new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		TestController tc = appCon.getBean(TestController.class);
		tc.printController();
		appCon.close();
	}

}
