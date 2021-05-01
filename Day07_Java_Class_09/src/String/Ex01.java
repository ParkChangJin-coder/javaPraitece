package String;

//자바 API 문서
//https://docs.oracle.com/javase/8/docs/api

public class Ex01 {
	
	public static void main(String[] args) {
		//String 은 class
		//자바에서는 String 클래스를 기본형과 같은 형식으로
		//쓸 수 있도록 해 두었다.
		
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = "Hello";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println();
		
		String str4 = "World!";
		String str5 = new String("World!");
		
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		System.out.println();
	}

}
