package adstraction;

abstract class Car{
	String color;
	int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public abstract void work();
	
	public abstract void disp();
}

class Sedan extends Car{
	
	public Sedan(String color, int speed) {
		super(color, speed);
	}

	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}

	@Override
	public void disp() {
		System.out.println("세단은 " + color + " 색이고 " + speed + " 의 속도를 낼 수 있습니다. ");
	}
}

class Truck extends Car{
	public Truck(String color, int speed) {
		super(color, speed);
	}

	@Override
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}

	@Override
	public void disp() {
		System.out.println("트럭은 " + color + " 색이고 " + speed + " 의 속도를 낼 수 있습니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Sedan sedan = new Sedan("검정", 300);
		sedan.disp();
		sedan.work();
		System.out.println();
		Truck truck = new Truck("파랑", 100);
		truck.disp();
		truck.work();
	}
}
