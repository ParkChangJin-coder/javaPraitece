package pack01;

public class constructor {
	
	public constructor() {
		System.out.println("public 생성자");
	}
	
	protected constructor() {
		System.out.println("protected 생성자");
	}
	
	constructor(int a, int b){
		System.out.println("default 생성자");
	}
	
	private constructor(int a, int b, int c) {
		System.out.println("private 생성자");
	}
	
	public static void main(String[] args) {
		constructor ex1 = new constructor();
		constructor ex2 = new constructor();
		constructor ex3 = new constructor(1,2);
		constructor ex4 = new constructor(1,2,3);
		
	}

}
