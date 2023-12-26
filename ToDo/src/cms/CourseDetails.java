package cms;

public class CourseDetails {
	private int ID, Duration, Fees;
	private String title, provider;
	static int TotalCourse;
	public int getID() {
		
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getDuration() {
		
		return Duration;
	}
	
	public void setDuration(int duration) {
		Duration = duration;
	}
	
	public int getFees() {
		
		return Fees;
	}
	
	public void setFees(int fees) {
		Fees = fees;
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
	
	public CourseDetails(int ID, int Duration, int Fees,  String title, String provider) {
		TotalCourse++;
		this.ID = ID;
		this.Duration = Duration;
		this.Fees = Fees;
		this.title = title;
		this.provider = provider;
	}
	
	public void display() {
		System.out.println("TotalCourse : " +  TotalCourse);
		System.out.println("ID : " +  ID);
		System.out.println("duration  : " + Duration);
		System.out.println("Fees  : " + Fees);
		System.out.println("title  : " + title);
		System.out.println("provider  : " + provider);
	}
	
}
