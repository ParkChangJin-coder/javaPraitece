package array;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언
		int[] intArray1 = {10, 20, 30};
		//실제 값을 알고 있을 때
		//선언과 동시에 배열을 생성하면 new연산자 생략 가능
		System.out.println(intArray1[0]);
		
		int[] intArray2 = null; //실제 값과 길이를 나중에 넣을 때
		intArray2 = new int[] {1, 2, 3};
		System.out.println(intArray2[0]);
		
		int intArray3[] = new int[3]; //지정할 값의 길이만 저정할 때
		intArray3[0] = 4;
		intArray3[1] = 5;
		intArray3[2] = 6;
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[1]);
		System.out.println(intArray3[2]);
		
	}

}
