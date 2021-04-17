package loop;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시작값 끝 값, 증가 값 입력 받아 합을 구하는 식을 만들어 보자
		//for and Scanner
		
		Scanner scan = new Scanner(System.in);
		
		int hap = 0;
		int num1, num2, num3;
		
		System.out.println("input start number : ");
		num1 = scan.nextInt();
		System.out.println("input end number : ");
		num2 = scan.nextInt();
		System.out.println("input add number :  ");
		num3 = scan.nextInt();
		
		for(int i = num1; i <= num2; i += num3) {
			hap = hap + i;
		}
		System.out.printf("%d to %d as %d result : %d\n", num1, num2, num3, hap);
		scan.close();
	}

}
