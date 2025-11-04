package Lecture5;

class subPerson {}
class subStudent extends subPerson {}
class Researcher extends subPerson {}
class Professor extends Researcher {}

public class InstanceOfEx {
	static void print(subPerson p) {
		if(p instanceof subPerson)
			System.out.print("Person ");
		if(p instanceof subStudent)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t");
		print(new subStudent());
		System.out.print("new Researcher() ->\t"); 
		print(new Researcher());
		System.out.print("new Professor() ->\t"); 
		print(new Professor());
	}
}
