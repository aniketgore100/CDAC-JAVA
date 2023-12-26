package toDo;

public class Fruits {
	private String name, color;
	static int FruitsCount;
	private static int totalFruitsCount;
	
	public Fruits(String name, String color) {
		this.name = name;
		this.color = color;
		FruitsCount++;
		totalFruitsCount++;
	}
	
	public Fruits() {
		name = "mango";
		color = "yellow";
		FruitsCount++;
		totalFruitsCount++;
	}
	
	public String getName() {
		System.out.println(totalFruitsCount);
		System.out.println(name);
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		System.out.println(color);
	}
	public static int getTotalFruitsCount() {
		return totalFruitsCount;
	}
}
