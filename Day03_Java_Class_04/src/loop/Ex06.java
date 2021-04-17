package loop;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문으로 사용해서 숫자를 5번 입력 받고
		// 입력 받을 때 마다 더해지는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("input five numer :");
			num = scan.nextInt();
			sum += num;
		}
		scan.close();
		System.out.printf("result : %d\n", sum);

	}

}
