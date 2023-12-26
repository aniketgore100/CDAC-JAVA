package javaConfigClassPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import studentClassPackage.Student;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
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
