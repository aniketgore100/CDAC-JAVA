
public class cms {
	
	private int Cid, fees, duration;
	private String title, provider;
	public static int CourseCount;
	public static int CourseId;
	public int getCid() {
		return Cid;
	}
	
	public void setCid(int cid) {
		Cid = cid;
	}
	
	public int getFees() {
		return fees;
	}
	
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getProvider() {
		
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	
	public cms( int fees, int duration, String title, String provider) {
		CourseId++;
		this.fees = fees;
		this.duration = duration;
		this.title = title;
		this.provider = provider;
		CourseCount++;
	}
	public void dis() {
		System.out.println("Course details are : ");
		System.out.println("Id : " + CourseId);
		System.out.println("Title : " + title);
		System.out.println("fees : " + fees);
		System.out.println("Provider :" + provider);
		System.out.println("duration : " + duration);
		System.out.println("total courses are  : " + CourseCount);
	}
	
}
