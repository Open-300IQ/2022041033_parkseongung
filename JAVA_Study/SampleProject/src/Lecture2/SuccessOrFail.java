package Lecture2;
import java.util.Scanner;

public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		else
			System.out.println("죄송합니다. 탈락입니다."); // 70 이하일때의 경우의 수 추가 if-else문 적용
		
		scanner.close();
	}
}