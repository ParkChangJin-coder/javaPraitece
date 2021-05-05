package exception;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.out.println(1/0);
		//1을 0으로 나눌 수 없다. ArithmaticException이 발생
		System.out.println("try 블록!"); //실행 안됨
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticExeption 발생!");
		}catch(Exception e) {
			//Exception은 모든 예외를 처리할 수 있다.
			System.out.println("예외 처리!!");
		}
	}

}
