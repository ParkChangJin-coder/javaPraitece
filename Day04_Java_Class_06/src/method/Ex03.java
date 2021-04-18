package method;

import java.util.Scanner;

public class Ex03 {
	
	//이름과 나이를 입력받아 출력하는 profileprint 메소드를 만들어보자
	public static void profilePrint(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public static void main(String[] args) {
		profilePrint("Park", 34);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("name? : ");
		String name = scan.nextLine();
		
		System.out.println("age? : ");
		int age = scan.nextInt();
		
		profilePrint(name, age);
		
		scan.close();
	}

}
