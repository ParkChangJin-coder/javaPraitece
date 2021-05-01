package API;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Exit System?");
			System.out.println("(1) YES (2) NO");
			int choice = scan.nextInt();
			if(choice == 1) {
				System.exit(0);
			}else {
				System.out.println("시스템은 계속 돌아갑니다.");
			}
		}
		
	}

}
