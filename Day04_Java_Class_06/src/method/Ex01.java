package method;

public class Ex01 {
	
	public static void method01() {
		System.out.println("void형 메소드는 돌려줄 값이 없습니다.");
		System.out.println("없다니까");
	}
	
	public static int method02() {
		int b = 100;
		System.out.println("return 타입은 int형인 메서드");
		return b;
	}
	
	public static void main(String[] args) {
		method01();//void형 메소드 호출
		
		int a;
		
		a = method02();//int형 메소드 호출
		               //method02 에서 돌려준 100 값을 a에 넣는다
		System.out.println("method02 에서 돌려준 값은 " + a);
	}

}
