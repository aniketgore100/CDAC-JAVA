package javaConfigClassPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import studentClassPackage.Student;

@Configuration
public class StudentConfigClass {
	
	@Bean
	public Student StdId() {
		Student std = new Student();
		std.setName("sanket");
		std.setAge(21);
		std.setStream("Computer Science");
		return std;
	}
}
