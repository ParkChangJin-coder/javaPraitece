package wrapper;

public class Ex02 {
	public static void main(String[] args) {
	 Integer obj = new Integer(10); 
	 
	 int sum = obj + 20; //자동 언박싱
	 System.out.println(sum);
	 
	 printDouble(new Double(123.45));
	 printDouble(123.45); //자동 박싱
	}
	
	static void printDouble(double obj){
		System.out.println(obj);
	}
}
