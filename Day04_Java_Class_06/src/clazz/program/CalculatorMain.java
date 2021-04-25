package clazz.program;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println("계산기를 실행합니까?");
		System.out.println("(1) YES (2) NO");
		int calcConst = scan.nextInt();
		
		if (calcConst == 1) {
			Calculator myCal = new Calculator();
			while(true) {
				System.out.println("(1) 더하기 (2) 빼기 (3) 곱하기 (4)나누기 (5) 전원끄기" );
				int choice = scan.nextInt();
				if (choice == 5) {
					myCal.powerOff();
				}else if(choice < 1 || choice > 5){
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				System.out.println("첫번째 수 입력 : ");
				int x = scan.nextInt();
				
				System.out.println("두번째 수 입력 : ");
				int y = scan.nextInt();
				
				switch (choice) {
				case 1:
					myCal.add(x, y);
					int result1 = myCal.getResult1();
					System.out.println(result1);
					break;
					
				case 2:
					myCal.sub(x, y);
					int result2 = myCal.getResult1();
					System.out.println(result2);
					break;
				
				case 3:
					myCal.mul(x, y);
					int result3 = myCal.getResult1();
					System.out.println(result3);
					break;
					
				case 4:
					myCal.div(x, y);
					float result4 = myCal.getResult2();
					System.out.println(result4);
					break;
					
				case 5 :
					myCal.powerOff();
					
					
				default:
					System.out.println("잘못 입력 하셨습니다.");
					continue;
				}
			}
		}
		scan.close();

	}

}
