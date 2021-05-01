package API;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//Arrays는 배열을 쓰는데 편리한 기능을 제공
		//Math 클래스와 마찬가지로 static 메소드 클래스로 편하게 접근 가능
		//Arrays클래스도 toString 메소드가 있다.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));

	}

}
