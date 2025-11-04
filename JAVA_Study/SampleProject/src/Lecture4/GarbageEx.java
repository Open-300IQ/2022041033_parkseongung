package Lecture4;

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e; // 가비지 생성으로 인한 warning
		a = null;
		d = c;
		c = null;
	}
}
