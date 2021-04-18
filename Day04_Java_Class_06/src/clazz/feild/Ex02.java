package clazz.feild;


class Car1{//클래스 : field + method
	
	//필드를 메소드로 접근 할 수 있다.
	String color;
	int speed;
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}
	
	
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar1 = new Car1(); //Car1 클래스에 대한 객체생성
		
		myCar1.color = "빨강";
		myCar1.speed = 0;
		
		Car1 myCar2 = new Car1(); //객체는 여러개 생성할 수 있다.
		myCar2.color = "파랑";
		myCar2.speed = 0;
		
		myCar1.upSpeed(30); //메소드 호출 : 객체이름.메소드(매개값)
		System.out.println("자동차 1의 색상은 : " + myCar1.color);
		System.out.println("자동차 1의 속도는 : " + myCar1.speed);
		
		myCar2.upSpeed(60);
		System.out.println("자동차 2의 색상은 : " + myCar2.color);
		System.out.println("자동차 2의 속도는 : " + myCar2.speed);
		
	}

}
