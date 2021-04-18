package clazz.feild;

class Car3{
	String color;
	private int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class Ex04 {
	
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		
		myCar.color = "빨강";
		
		myCar.setSpeed(200);
		
		System.out.println("color : " + myCar.color +  "Speed : " + myCar.getSpeed());
	}

}
