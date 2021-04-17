package array;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 길이를 알아봅시다
		int[] intArray = new int[5];
		intArray[0] = 100; 
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
		for(int i = 0; i <=4; i++) {
		System.out.println(intArray[i]); //i = 제어변수
		}
		System.out.println("배열의 길이 : " + intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + ".length");
		}
	}

}
