package di;

public class Address {
	private int flatNo;
	private String Area;
	private int pincode;
	
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public void setArea(String area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
