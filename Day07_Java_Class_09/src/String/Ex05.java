package String;

public class Ex05 {

	public static void main(String[] args) {
		//startsWith : 문자열이 지정한 문자로 시작하는지 판단 후
		//같으면 true, 아니면 false (대소 구별)
		String str1 = "apple";
		System.out.println("startsWith : " + str1.startsWith("a"));
		
		//endWith : 문자열이 마지막에 지정한 문자가 있는지 판단 후
		//있으면 true 없으면 false (대소문자 구별)
		System.out.println("endsWith : " + str1.endsWith("e"));
		
		
		//equals : 두개의 String 에 값만을 비교하여
		//같으면 Treu, 아니면 false
		
		String str2 = "java";
		String str3 = "java";
		System.out.println("equals : " + str2.equals(str3));
		
	}
}
