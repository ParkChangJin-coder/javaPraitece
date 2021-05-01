package wrapper;

public class Ex05 {
	public static void main(String[] args) {
		//문자열을 기본형으로 바꿀 때
		//parseInt : 문자열을 기본형으로
		//valueOf : 문자열을 wrapper 클래스로
		//JDK 1.5부터 자동 박싱, 언박싱이 지원되어
		//반환 값이 기본형일 때와 wrapper 클래스일 떄의 차이가 없다.
		String str = "100";
		
		Integer ivalue1 = Integer.valueOf(str);
		System.out.println(ivalue1);
		
		
		int ivalue2 = Integer.parseInt(str);
		System.out.println(ivalue2);
	}
}
