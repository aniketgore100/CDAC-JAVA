package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import di.Student;
public class Main {

	public static void main(String[] args) {
		String path = "/Config/apllicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Student std = (Student) context.getBean("StuId1");
		std.display();
	}

}
