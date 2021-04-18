package clazz.constructor;

class Car3{
	String company = "KIAAAAA!";
	String model;
	private String color;
	private int Speed;
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0 || speed >200) {
			this.Speed = 50;
		}else {
		Speed = speed;
		}
	}
		
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car3 car = new Car3();
		
		System.out.println("company : " + car.company);
		
		car.setSpeed(150);
		System.out.println("SPEED : " + car.getSpeed());
		car.setColor("빨강");
		System.out.println("color : " + car.getColor());

	}

}
