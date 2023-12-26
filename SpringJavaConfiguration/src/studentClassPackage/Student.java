package studentClassPackage;

public class Student {
	private String name, stream;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("name  : " + name );
		System.out.println("age  : " + age );
		System.out.println("stream  : " + stream );
	}
}
