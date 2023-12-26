package day5;

public class Restaurant {
	private int resId;
	private String name;
	private String cuisine;
	private int bracount;
	
	
	public Restaurant(int resId, String name, String cuisine, int bracount) {
		super();
		this.resId = resId;
		this.name = name;
		this.cuisine = cuisine;
		this.bracount = bracount;
	}


	public int getResId() {
		return resId;
	}


	public void setResId(int resId) {
		this.resId = resId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Restaurant [resId=" + resId + ", name=" + name + ", cuisine=" + cuisine + ", bracount=" + bracount
				+ "]";
	}


	public String getCuisine() {
		return cuisine;
	}


	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}


	public int getBracount() {
		return bracount;
	}


	public void setBracount(int bracount) {
		this.bracount = bracount;
	}
	
	
}
