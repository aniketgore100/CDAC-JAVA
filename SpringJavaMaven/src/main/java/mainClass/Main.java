package mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javaConfigClassPackage.StudentConfigClass;
import studentClassPackage.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		
		
		Student std = (Student) context.getBean("StdId");
		
		
		std.display();
	}

}
