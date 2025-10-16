package Lecture3;

import java.util.Scanner;

public class ContinueBreak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		int i = 0;
		while(true) {
			i++;
			int n = scanner.nextInt();
			if(n<=0) 
				continue;
			else 
				sum += n;
			if(i == 5) {
				break;
			}
		}
		System.out.println("양수의 합은 " + sum);
		
		scanner.close();
	}
}