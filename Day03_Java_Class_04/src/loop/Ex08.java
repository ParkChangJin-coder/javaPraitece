package loop;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이중 for문
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단 시작");
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
		}

	}

}
