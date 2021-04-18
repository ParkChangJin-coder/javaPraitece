package method;

import java.util.Scanner;

public class Ex06 {
	
	//사칙연산 메소드 하나씩 만들어 봅시다
	public static void powerOn() {
		System.out.println("power On!!");		
	}
	
	public static void powerOff() {
		System.out.println("power Off!!");
		System.exit(0);
		//프로그램 강제 종료
		//정상 종료 : 0
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int substract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static float divide(float x, float y) {
		return x / y;
	}
	
	public static void output(int result) {
		System.out.println(result);
	}
	
	public static void output(double result) {
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("power On?? : (1) YES (2) NO");
		int power = scan.nextInt();
		if(power == 1) {
			powerOn();
		}else if(power == 2) {
			powerOff();
		}else{
			System.out.println("you got the Wrong num!");
			System.out.println("Program shut down");
			System.exit(0);
		}
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("(1) ADD (2) SUBSTRACT (3) MULTIFLY (4) DIVIDE (5) POWER OFF");
			
			int choice = scan.nextInt();
			if(choice == 5) {
				powerOff();
			}
			
			switch(choice) {
			case 1:
				System.out.println("input First Num : ");
				int x1 = scan.nextInt();
				System.out.println("input Second Num : ");
				int y1 = scan.nextInt();
				int result1 =  add(x1, y1);
				output(result1);
				break;
				
			case 2:
				System.out.println("input First Num : ");
				int x2 = scan.nextInt();
				System.out.println("input Second Num : ");
				int y2 = scan.nextInt();
				int result2 =  substract(x2, y2);
				output(result2);
				break;
				
			case 3:
				System.out.println("input First Num : ");
				int x3 = scan.nextInt();
				System.out.println("input Second Num : ");
				int y3 = scan.nextInt();
				int result3 =  multiply(x3, y3);
				output(result3);
				break;
			case 4:
				System.out.println("input First Num : ");
				int x4 = scan.nextInt();
				System.out.println("input Second Num : ");
				int y4 = scan.nextInt();
				float result4 =  divide(x4, y4);
				output(result4);
				break;
			default:
				System.out.println("You've Got the Wrong Num!!");
				continue;
			}
		}
		scan.close();
	}

}
