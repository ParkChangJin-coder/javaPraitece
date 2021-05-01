package wrapper;

public class Ex04 {
	public static void main(String[] args) {
		
		Integer ivalue1 = Integer.valueOf(10);
		Integer ivalue2 = Integer.valueOf(10);
		//valueOf (wrapper 클래스의 생성자를 대신하는 메소드)
		//반환값이 wrapper 클래스 타입이다.
		//똑같은 값을 가지고 valueOf 메소드를 호출하면
		//같은 객체에 대한 참조값이 리턴된다
		
		if(ivalue1 == ivalue2) {
			System.out.println("ivalue1 and ivalue2 is equal");
		}else {
			System.out.println("ivalue1 and ivalue2 is not equal");
		}
	}
}
