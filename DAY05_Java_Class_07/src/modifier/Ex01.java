package modifier;

public class Ex01 {
	
	static int count1 = 0;
	//메모리상의 정적이다
	//공유되는 전역변수이다
	
	int count2 = 0;
	//인스턴스 변수
	
	public void increase() {
		count1++;
		count2++;
		
		System.out.println("count1 : " + count1);
		System.out.println("count2 : " + count2);
	}
	
	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		ex1.increase();
		System.out.println();
		
		Ex01 ex2 = new Ex01();
		ex2.increase();
		System.out.println();
		
		Ex01 ex3 = new Ex01();
		ex3.increase();
		System.out.println();
		
	}

}
