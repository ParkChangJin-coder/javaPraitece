package loop2;

import java.util.Scanner; //scan.close()!!

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//커피숍 주문 프로그램 간단하게 만들어 보기
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
	do {
		
		System.out.println("\n May I take you're order?");
		System.out.println("(1)Americano (2)caffeLatte (3)Capuccino (4)Stop Order");
		
		menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("#아메리카노 주문 하셨습니다.");
			break;
		case 2:
			System.out.println("카페라떼 주문 하셨습니다.");
			break;
		case 3:
			System.out.println("카푸치노 주문 하셨습니다.");
			break;
		case 4:
			System.out.println("감사합니다 안녕!!");
			break;
			
		default:
			System.out.println("you've got wrong order!");
		}
	}while(menu != 4);		
		scan.close();

	}

}
