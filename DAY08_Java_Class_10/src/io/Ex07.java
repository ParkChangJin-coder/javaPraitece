package io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "bbb.txt");
		
		//FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		int a = 10;
		double b = 10.23;
		String c = "Hello_JAVA";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		dos.close();
		bos.close();
		fos.close();
		

	}

}
