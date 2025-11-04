package Lecture5;

class subPoint{
	private int x, y;
	public subPoint() {
		this.x = this.y = 0;
	}
	
	public subPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class subColorPoint extends subPoint{
	private String color;
	public subColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
		subColorPoint cp = new subColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}
