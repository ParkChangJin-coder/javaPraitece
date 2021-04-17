package loop2;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break
		int a = 0;
		while(a < 10) {
			System.out.println(a);
			if(a == 7) {
				System.out.println("Escaped!");
				break;
			}
			a++;
		}
		
		int b = 0;
		
		while(b < 10) {
			//System.out.println(b);
			b++;
			if(b == 5) {
				continue;
			}
			System.out.println(b);
		}

	}

}
