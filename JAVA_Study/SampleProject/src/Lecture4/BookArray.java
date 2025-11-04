package Lecture4;

import java.util.Scanner;

class subBook{
	String title, author;
	public subBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		subBook[] subBook = new subBook[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < subBook.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			subBook[i] = new subBook(title, author);
		}
		
		for(int i = 0; i < subBook.length; i++)
			System.out.print("(" + subBook[i].title + ", " + subBook[i].author + ")");
		
		scanner.close();
	}
}
