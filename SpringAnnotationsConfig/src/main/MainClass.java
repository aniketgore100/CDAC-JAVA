package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.*;
import javaConfig.SpringconfigFile;
public class MainClass {

	public static void main(String[] args) {
		String path = "/annnotationConfig/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(path);
//		Student std = (Student) context.getBean("student");
//		std.display();
		
		//Using javaConfig with annotations 
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringconfigFile.class);
		Student std = (Student) context.getBean("student");
		std.display();
	}

}
