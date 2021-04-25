package inheritance;

class Car {
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재 속도 (Car클래스) : " + this.speed);
	}
}

//Car Class 를 상속받은 Genesis 클래스를 작성
//upSpeed메소드를 재정의
//속도는 최고속도 150

class Genesis extends Car{
	
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 150) {
			this.speed = 150;
		}		
		System.out.println("현재 속도 (Genesis 클래스) : " + this.speed);
	}
}

//Car 클래스를 상속받은 Porter 클래스 생성
//upSpeed 메소드 재ㅓㅇ의
//최고속도 100

class Porter extends Car{
	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		if(this.speed > 100) {
			this.speed = 100;
		}
		System.out.println("현재 속도 (Porter 클래스) : " + this.speed);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Car car = new Car();
		Genesis genesis = new Genesis();
		Porter porter = new Porter();
		
		car.upSpeed(200);
		genesis.upSpeed(200);
		porter.upSpeed(200);
		
		
	}
	
	

}
