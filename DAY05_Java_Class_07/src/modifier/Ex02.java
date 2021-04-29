package modifier;

class Box{
	static int boxID = 0;
	int idNum = 0;
	
	public void increase() {
		boxID++;
		idNum++;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		box1.increase();
		System.out.println("Box1 의 id번호 : " + box1.idNum);
		System.out.println("Box1 ID : " + box2.boxID);
		
		box2.increase();
		System.out.println("Box2의 id번호 : " + box2.idNum);
		System.out.println("Box2 ID : " + box2.boxID);
		
		box3.increase();
		System.out.println("Box3의 id번호 : " + box3.idNum);
		System.out.println("Box3 ID : " + box3.boxID);
		
		//인스턴스 변수는 객체마다 공유되지 않는다
		//static 변수는 모든 객체가 공유된다.
		
	}
	
}
