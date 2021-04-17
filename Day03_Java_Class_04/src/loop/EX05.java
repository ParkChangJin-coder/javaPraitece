package loop;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i = 501; i<= 1000; i++) {
			sum += sum + i;
		}
		
		System.out.printf("%d\n", sum);

	}

}
