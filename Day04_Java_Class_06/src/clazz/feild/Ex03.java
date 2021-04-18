package clazz.feild;

class Car2{
	String color;
	int speed;
	
	void upSpeed(int speed) {
		this.speed += speed;
		//매개 번수와 필더의 이름이 동일하기 때문에
		//this.필드 는 this라는 참조 변수로 필드를 사용한다.
		
	}
	
	void downSpeed(int speed) {
		this.speed -= speed;
	}
	
	String getColor() { //get : 가져오다 반대 set : 저장하다
		return color; //String color 필드를 리턴한다
	}
	
	int getSpeed() {
		return speed;//
	}
}

public class Ex03 {
	
	public static void main(String[] args) {
	
	Car2 myCar = new Car2();
	myCar.color = "빨강";
	myCar.speed = 0;
	
	myCar.upSpeed(30);
	
	System.out.println("color : " + myCar.color);
	}
}
