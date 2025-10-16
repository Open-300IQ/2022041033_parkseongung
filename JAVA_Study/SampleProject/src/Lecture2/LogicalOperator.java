package Lecture2;
public class LogicalOperator {
	public static void main (String[] args) {

		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));

		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0)); // 앞쪽이 이미 true -> 뒤쪽 연산이 의미없기 때문에 warning이 뜸
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}