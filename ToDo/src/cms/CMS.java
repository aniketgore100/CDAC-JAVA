package cms;

public class CMS {
																																			
	
			public static void PrintArr(CourseDetails[]arr) {
		int n = arr.length;
		int   sum = 0; int avg = 0;
		for(CourseDetails i : arr) {
			
			sum += i.getDuration();
		avg = sum/ n;
		}
		System.out.println(avg);
	}

	public static void main(String[] args) {
		CourseDetails c1 = new CourseDetails(1, 30, 30000, "c++", "cdac");
		CourseDetails c2 = new CourseDetails(2, 40, 40000, "java", "gfg");
		CourseDetails arr[] = {c1, c2};	
		PrintArr(arr);
		
		
		
	}
}
