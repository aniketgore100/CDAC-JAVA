package di;

public class Student {
	
	private String name;
	private int rollnp;
	private Address address;
	
	public Student(String name, int rollNo, Address address) {
		this.rollnp = rollNo;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnp=" + rollnp + ", address=" + address + "]";
	}
	
	public void display() {
		System.out.println("name : " + name);
		System.out.println("rollnp : " + rollnp);
		System.out.println("address : " + address);
	}
	
}
