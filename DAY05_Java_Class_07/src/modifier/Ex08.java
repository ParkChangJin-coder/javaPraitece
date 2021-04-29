package modifier;

public class Ex08 {
	public static void main(String[] args) {
	
		//public 접근 제한자 누구든 접근 가능
		//static 지정예약어, 메모리에 미리 올린ㄷ
		//void 반환형, 반환할 것이 없다고 알려주는 반환형
		//main 메소드명, 시작시 main 메소드를 JVM이 찾는다.
		//String[] args 매개변수 String형태의 배열로 argument값을 처리한다.
		
		for(String ar : args) {
			System.out.println(ar);
		}
		
	}
}
