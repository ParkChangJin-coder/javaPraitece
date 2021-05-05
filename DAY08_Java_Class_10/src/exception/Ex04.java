package exception;

class MyException extends Exception{
	private String message;
	
	public MyException(String str) {
		super(str);
		System.out.println("MyException에서 예외처리");
	}
	
	@Override
	public String getMessage() {
		message = super.getMessage() + "나의 예외처리";
		return message;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("Ex03 class : ");
		}catch(MyException e) { //MyException 클래스에서 예외처리
			System.out.println(e.getMessage());
		}
	}

}
