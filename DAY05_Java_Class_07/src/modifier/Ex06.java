package modifier;

public class Ex06 {
	static {
		System.out.println("static 블록");
	}
	{
		System.out.println("인스턴스 블록");
	}
	
	public Ex06(){
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		
		Ex06 ex1 = new Ex06();
		System.out.println("-------------------");
		Ex06 ex2 = new Ex06();
		
		System.out.println("메인 메소드 끝");
	}
}
