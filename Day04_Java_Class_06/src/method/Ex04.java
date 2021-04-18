package method;

public class Ex04 {
	
	public static void powerOn() {
		System.out.println("Power On");
	}
	
	public static int add(int x, int y) {
		return x + y;		
	}
	
	public static void main(String[] args) {
		powerOn();
		int result = add(5, 6);
		System.out.println(result);
	}

}
