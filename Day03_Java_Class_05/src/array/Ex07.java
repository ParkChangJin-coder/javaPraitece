package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 3명의 이름, 국어, 영어, 수학 성적을 받고 
		//
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		
		int[] total = new int[3];
		int[] rank = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + "번째 학생의 이름 : ");
			names[i] = scan.nextLine(); 
			
			System.out.println(i+1 + "번째 학생의 국어성적 : ");
			kor[i] = scan.nextInt();
			
			System.out.println(i+1 + "번째 학생의 영어성적 : ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i];
		}
		
		for(int i = 0; i < 3; i++) {
			rank[i] = 1;
			for(int j = i; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s 님의 총점은 %d 점 이고 순위는 %d등 입니다.\n", names[i], total[i], rank[i]);
		}
		scan.close();

	}

}
