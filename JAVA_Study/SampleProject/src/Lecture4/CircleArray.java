package Lecture4;

class SubCircle {
	int radius;
	
	public SubCircle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray{
	public static void main(String[] args) {
		SubCircle[] c;
		c = new SubCircle[5];
		
		for(int i = 0; i < c.length; i++)
			c[i] = new SubCircle(i);
		
		for(int i = 0; i < c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}
