package di;

public class Student {
	
	private String name;
	private int rollnp;
	private Address address;
	
	
	public void setName(String name) {
		this.name = name;
	} 
	public String getName() {
		return name;
	}
	public int getRollnp() {
		return rollnp;
	}
	public Address getAddress() {
		return address;
	}
	public void setRollnp(int rollnp) {
		this.rollnp = rollnp;
	}
	public void setAddress(Address address) {
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
