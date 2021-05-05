package exception;

public class Ex03 {
	
	public void call(int j) throws ArrayIndexOutOfBoundsException {
		//throws는 호출한 곳에서 예외처리
		int[] i = {1,2,3};
		System.out.println("call value : " + i[j]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex03 ex03 = new Ex03();
		try {
		ex03.call(4); //call 메소드 호출
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("크기에 맞는 값을 입력해랏");
			e.printStackTrace();
			
		}finally {
			System.out.println("해당 문장은 무조건 수행");
		}
	}

}
