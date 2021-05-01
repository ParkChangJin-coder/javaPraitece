package String;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		//String 메소드
		
		String str1 = "Hello World!";
		
		//CharAt : 해당 위치의 문자 하나를 char형으로 변환
		System.out.println("charAt : " + str1.charAt(0));
		
		//isEmpty : 해당 변수가 비어 있으면 true 아니면 false
		System.out.println("isEmpty : " + str1.isEmpty());
		
		//length : 문자열의 길이
		System.out.println("length : " + str1.length());
		
		//toCharArray : 문자열을 한 글자씩 char 배열로 반환
		char[] array = str1.toCharArray();
		System.out.println("toCharArray : " + Arrays.toString(array));
		//Arrays 클래스는 배열을 다룰 수 있게 해주는 클래스
		
		//replace : 문자열을 교체해준다.
		System.out.println("replace : " + str1.replace("Hello","Hi"));
		
		//replaceAll : 문자열을 교체해준다. replace와 같지만 정규식 사용 가능
		System.out.println("replaceAll : " + str1.replaceAll("World", "java"));
	}
}
