package wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int a = 5; //기본타입 선언
		Integer b = new Integer(a);
		// 기본타입의 값을 포장객체로 만든다.(박싱)
		
		Integer c = 5;//자동 박싱
		
		int d = c.intValue(); 
		//박싱된 포장 객체에서 다시 기본타입의 값을 얻는다.(언박싱)
		
		int f = c; //자동 언박싱
		
		
	}

}
