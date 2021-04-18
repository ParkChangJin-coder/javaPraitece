package clazz.feild;

class Car4{
	private int speed; //필드에 바로 접근할 수 없다.

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			this.speed = 60; //void에 return을 쓰면 종료된다.
		}else {
		this.speed = speed;
		}
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Car4 car = new Car4();
		
		car.setSpeed(300);
		//car.getSpeed();
		System.out.println("Speed : " + car.getSpeed());
		
	}

}
