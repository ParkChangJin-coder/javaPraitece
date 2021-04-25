package inheritance;

class Sedan{
	String color;//필드
	public Sedan() { //부모 기본 생성자
		System.out.println("Sedan 클래스 생성자 호출(매개변수 없음)");
	}
	
	public Sedan(String str) { //부모 (매개변수) 생성자
		System.out.println("Sedan 클래스 생성자 호출(매개변수 있음 : )" + str);
	}
}

class Sonata extends Sedan{
	public Sonata(String str) {
		//super(); 부모 클래스 기본생성자가 호출이 된다.
		super(str); 
		//부모 생성자가 매개변수를 가지고 있을 경우 부모 생성자의 매개 변수를 명시해 주면 
		//명시된 부모 생성자가 호출이 된다.
		System.out.println("소나타 생성자 호출 : " + str);
	}
	
	void setColor(String color) {
		this.color = color;
		//super.color 로 부모필드에 접근해야 하지만
		//필드를 물려 받았기 때문에 this.color로 부모 필드 접근 가능하다.
	}
	void colorPrint() {
		System.out.println("소나타 색상은 : " + this.color);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("소나타 객체 생성");
		sonata.setColor("검정");
		sonata.colorPrint();
	}

}
