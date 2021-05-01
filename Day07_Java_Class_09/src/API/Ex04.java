package API;

public class Ex04 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//클래스 객체 얻기 첫번째 방법
		Class clazz1 = Ex04.class;
		String clazzName = clazz1.getName();
		System.out.println(clazzName);
		
		String clazzName2 = clazz1.getSimpleName();
		System.out.println(clazzName2);
		
		//Class 객체 얻기 두 번째 방법
		Class clazz2 = Class.forName("API.Ex04");
		//ClassNotFountException = 없을 경우에
		//forName("패키지이름.클래스이름")
		System.out.println(clazz2.getName());
		
		//객체로부터 Class 객체 얻기
		Ex04 ex = new Ex04();
		Class clazz3 = ex.getClass();
		System.out.println(clazz3.getSimpleName());
		
	}

}
