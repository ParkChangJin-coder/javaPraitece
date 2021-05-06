package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		//파일 복사
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "pensu.jpg");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "Copy.jpg");
		
		while(true) {
			int data = fis.read();
			if(data == -1) {
				break;
			}//이런 방식은 속도가 느리다
			
			fos.write(data);
		}
		fos.close();
		fis.close();
		
	}

}
