package exception;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//system.out.println();
		//컴파일 에러
		//javac.exe 컴파일러
		//자바 컴파일러는 번역(구문체크)
		
		//System.out.println(args[0]);
		//실행 에러 실행 중 발생
		try {
		System.out.println(args[0]);
			//에러가 발생할 가능성이 있는 문장을 넣는다
		}catch(Exception e) {
			//예외처리를 위한 문장을 넣는다
			System.out.println("예외 발생...!");
		}finally {
			System.out.println("항상 수행!");
			//try catch 문의 마지막에 위치해야 한다.
		}
	}

}
