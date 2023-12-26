package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Student {
	
	@Value("aniket")
	private String name;
	
	@Value("52")
	private int rollno;
	
	@Value("56.0f")
	private float marks;
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("name : " + name);
		System.out.println("rollno : " + rollno);
		System.out.println("marks : " + marks);
	}
}
