package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "pensu.jpg");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "pensu_copy.jpg");
		
		byte[] buffer = new byte[1024];
		
		while(true) {
			//데이터는 buffer에 들어간다.
			//몇개나 새로운 데이터를 읽었는지 count
			int count = fis.read(buffer);
			
			if(count == -1) {
				break;
			}
			
			//a b c d e
			//f g h i j
			//k l m
			//한 바이트씩 받던 것을 1024 바이트 한꺼번에 받는다.
			
			fos.write(buffer, 0, count);			
		}

	}

}
