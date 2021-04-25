package poly;

class Car{
	//field
	Tire tire = new Tire();
}

class Tire{
	public String tireName;
	
	public Tire() {
		tireName = "정품 타이어"; //필드 초기화
	}

	public String getTireName() {
		return tireName;
	}
}

class HankookTire extends Tire{
	
	public HankookTire() {
		tireName = "한국 타이어";
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Car car = new Car();
		String tireName = car.tire.getTireName();
		System.out.println(tireName);
		
		car.tire = new HankookTire();
		String tireName1 = car.tire.getTireName();
		System.out.println(tireName1);
	}
}
