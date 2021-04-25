package pack01;

public class fieldMethodEx {
	
	public String str1 = "public field";
	protected String str2 = "protected field";
	String str3 = "default field";
	private String str4 = "private field";
	
	public void method1() {
		System.out.println("pulic method");
	}
	
	protected void method2() {
		System.out.println("protected method");
	}

	void method3() {
		System.out.println("default method");
	}

	private void method4() {
		System.out.println("private method");
	}
	
	public static void main(String[] args) {
		
		fieldMethodEx ex = new fieldMethodEx();
		
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		System.out.println(ex.str4);
		
		ex.method1();
		ex.method2();
		ex.method3();
		ex.method4();
	}


}
