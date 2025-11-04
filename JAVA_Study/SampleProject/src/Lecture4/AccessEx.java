package Lecture4;

class Sample{
	public int a;
	private int b; // b가 주석처리되서 warning
	int c;
}

public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
//		aClass.b = 10;  이거 b가 private라서 못씀 오류남
		aClass.c = 10;
	}
}

