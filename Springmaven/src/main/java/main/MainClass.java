package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Student;
public class MainClass {
	public static void main(String[] args) {
		String path  = "/Config/ApllicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Student std = (Student) context.getBean("StdId");
		std.display();
	}
}
