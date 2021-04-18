package method;

public class Ex05 {
	
	//method overloading
	//매개변수 타입, 개수, 순서 중 하나가 달라야 한다.
	
	public static void profile(String name) {
		System.out.println("name : " + name);
	}
	
	public static void profile(String name, int age) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	public static void profile(String name, int age, String phoneNum) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("phoneNum" + phoneNum);
	}
	
	public static void main(String[] args) {
		profile("park");
		profile("Park", 35);
		profile("Park", 35, "0001112222");
	}

}
