package method;

public class Ex02 {
	
	public static void name() {
		System.out.println("I am Optimus Prime!");
	}
	

	public static void Hello() {
		int i = 0;
		while(i < 5) {
		System.out.println("Hello!");
		i++;
		if(i==3) {
			return;//return 값이 없는 void 메소드 에서
				   //return을 쓰면 강제 종료			
				}
			}
		}
	
	public static void main(String[] args) {
		name();
		Hello();
	}
	

}
