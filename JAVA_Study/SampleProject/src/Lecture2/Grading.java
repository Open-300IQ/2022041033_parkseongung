package Lecture2;
import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); 
		if(score >= 90)
			System.out.print("학년을 입력하세요(1~4): ");
		    int year = scanner.nextInt();
			if(year == 4)
				if(score >= 95)
					grade = 'A';
				else
					grade = 'B'; // 90점 이상이면 학년을 물어보고 4학년이라면 95점 이상이어야 A를 받음 - 중첩문 적용
			else if(year != 4)
				grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60) 
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	}
}