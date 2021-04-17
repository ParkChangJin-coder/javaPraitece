package loop;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 for문으로 *찍기
		//*
		//**
		//***
		//****
		//*****
		
		//조건식을 이용해서
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//초기화식
		for(int i = 5; i > 0; i--) {
			for(int j = i; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
