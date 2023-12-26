package mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaConfigClassPackage.StudentConfigClass;
import studentClassPackage.Student;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class<StudentConfigClass> configUnit = StudentConfigClass.class;
		context.register(configUnit);
		context.refresh();
		Student std = (Student) context.getBean("StdId");
		std.display();
	}
	
	
}
