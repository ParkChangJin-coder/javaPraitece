package array;

import java.util.Scanner; // scan.close();

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열과 for문을 이용해서 3명의 이름을 입력 받고 출력
		Scanner scan = new Scanner(System.in);
		String[] names = new String[3];
		
		for(int i = 0; i < names.length; i++) {
		System.out.printf("input %d name : ", i+1);
		names[i] = scan.nextLine();
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		scan.close();

	}

}
