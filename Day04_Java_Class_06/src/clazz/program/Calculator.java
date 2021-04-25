package clazz.program;

public class Calculator {
	
	//field
	private int result1;
	private float result2;
	
	public Calculator() {//생성자(초기화 역할)
		powerOn(); //생성자를 생성할 때 메소드 실행
		result1 = 0; //필드 초기화
		result2 = 0;
	}
		
	public int getResult1() {
		return result1;
	}


	public float getResult2() {
		return result2;
	}


	public void powerOn() {
		System.out.println("POWER ON!");
	}
	
	public void powerOff() {
		System.out.println("POWER OFF");
		System.exit(0);
	}
	
	public void add(int x, int y) {
		int result = x + y;
		this.result1 = result; 
	}
	
	public void sub(int x, int y) {
		int result = x - y;
		this.result1 = result;
	}
	
	public void mul(int x , int y) {
		int result = x * y;
		this.result1 = result;
	}
	
	public void div(float x, float y) {
		float result = x / y;
		this.result2 = result;
	}

}
