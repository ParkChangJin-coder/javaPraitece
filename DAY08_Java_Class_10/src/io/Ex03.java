package io;

import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		File dir2 = new File("C" + File.separator + "aaa2");
		File file2 = new File(dir, "aaa2.csv");
		
		FileOutputStream fos2 = new FileOutputStream(file2, true);
		String head = "NUM_1";
		byte[] by2 = head.getBytes();
		fos2.write(by2);
		
		
		FileOutputStream fos = new FileOutputStream(file, true);
		//파일이 없으면 만든다.
		//객체생성시 true면 이어쓰기, false면 다시쓰기, 디폴트가 false
		//fos.write(65);
		//fos.write('b');
		String msg = "Hello, Java!";
		
		byte[] by = msg.getBytes();
		fos.write(by, 6, 4);
		
		
		
		fos.close();
		
	}

}
