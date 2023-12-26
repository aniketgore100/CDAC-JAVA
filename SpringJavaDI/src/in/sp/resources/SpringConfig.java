package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address createAddObj() {
		Address ad = new Address();
		ad.setHouseNo(100);
		ad.setCity("mumbai");
		ad.setPincode(43222);
		return ad;
		
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("aniket");
		std.setRollno(45);
		std.setAddress(createAddObj());
		return std;
		
	}
}
