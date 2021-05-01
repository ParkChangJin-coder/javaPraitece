package wrapper;

public class Ex03 {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		//포장 객체 비교
		//"객체" 비교
		System.out.println(obj1 == obj2);
		System.out.println( "equals : " + obj1.equals(obj2));
		//wrapper 클래스는 Object의 equals 메소드를 재정의 해서 안에있는 값을 비교한다.
		int a1 = 10; 
		int a2 = 10;
		//값을 비교
		System.out.println(a1 == a2);
		
		
	}
}
