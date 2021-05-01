package API;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(System.currentTimeMillis());
		//종자값(seed)을 설정하여 난수를 발생
		//기본적으로 System.currentTimeMillis()로 해서 
		//종자값을 주면 종자값이 다르게 발생
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45));
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		System.out.println(r.nextBoolean());

		
		byte[] by = new byte[3];
		r.nextBytes(by);
		
		for(byte b : by) {
			System.out.println(b);
		}
	}

}
