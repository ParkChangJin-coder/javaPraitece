package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력 받은 수를 작은 수 부터 나열
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d 번째 숫자", i+1);
			num[i] = scan.nextInt();
		}
		
		int temp = 0; //작은 숫자 나열
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i]>num[j]) {
					temp =  num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		System.out.println(num[i]);
		}
	scan.close();
	}
}
