package interface1;
//interface
//1. 추상 클래스 보다 훨씬 극단적이고 제한적인ㅇ 성격을 가지고 있다.
//2. 멤버필드와 추상 메서드만 정의할 수 있다.
//3. 상속 받으려면 extends 를 사용하면 안되고
//   implements 를 사용하여야 한다.
//4. 다중 상속이 가능하다.
//5. 추상 메소드는 일반 클래스의 메소드와 같지만 몸통을 가질 수 없다.
//6. 선언은 interface [이름]으로 한다.

interface Animal{
	//public static final int MAX_AGE = 500;이 생략된 형태
	int MAX_AGE = 500;
	//public abstract void sound();가 생략된 형태 
	void sound();
	//1. 모든 멤버 변수는 public static final 이어야 하며 생략될 수 있다.
	//2. 모든 메소드는 public abstract 이어야 하며, 생략될 수 있다.
	//3. 단, static 메소드와 default 메소드는 예외(JDK 1.8버전부터)
	
	public default void defaultMethod() {
		System.out.println("디폴트 메소드 입니다.");
	}
	//default 메소드
	//1. (JDK 1.8이후로) 인터페이스에 추가기능
	//2. 추상메서드가 아니기 때문에 구현하지 않아도 됨
	//3. 메소드 구현부가 있어야 함(body)
	//4. 앞에 키워드 default 로 명시해주어야 한다.
	//5. 접근제어자는 public 생략이 가능함
	//6. 유의 : 접근 제어자(default)가 아니다.
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드 입니다.");
	}
	//static 메소드
	//1. (JDK 1.8 이후로) 인터페이스에 추가기능
	//2. 접근 제어자가 항상 public 이며 생략 가능
}

class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("야옹!!");
	}
}

class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("멍!멍!");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.sound();
		Dog myDog = new Dog();
		myDog.sound();
		System.out.println();
		
		Animal myAnimal = new Cat();//다형성
		//Animal myAnimal = new Animal(); 인터페이스는 객체를 생성할 수 없다.
		myAnimal.sound();
		myAnimal = new Dog();
		myAnimal.sound();
		
		Animal[] myAnimals = new Animal[2]; //객체배열 생성 객체생성(X)
		myAnimals[0] = new Cat();
		myAnimals[1] = new Dog();
		
		for(int i = 0; i < 2; i++) {
			myAnimals[i].sound();
		}
	}

}
