package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] kor = new int[5];
		int hap = 0;
		
		for(int i = 0; i < kor.length; i++) {
			
			System.out.println("enter kor score : ");
			kor[i] = scan.nextInt();
			hap += kor[i];
		}

		System.out.println("sum : " + hap);
		System.out.println("average : " + (hap / kor.length));

		scan.close();
	}

}
