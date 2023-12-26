package di;

public class Address {
	private int flatNo;
	private String Area;
	private int pincode;
	
	public Address(int house, String area, int pincode) {
		this.flatNo = house;
		this.Area  = Area;
		this.pincode = pincode;
		
	}
	
	
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
}
