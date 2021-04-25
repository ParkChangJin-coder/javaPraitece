package clazz.constructor;

class Car2{
	String company = "기아자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	Car2(){}
	
	//생성자 오버로딩
	Car2(String model){ //this : 현재 객체
		this(model, null); //.model = model;
	}
	
	Car2(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 0);
	}
	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 car1 = new Car2(); //객체 생성시 생성자(메소드의 한 종류)
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("아반떼");
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("아반떼2", "검정");
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("아반떼3", "빨강", 250);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		

	}

}
