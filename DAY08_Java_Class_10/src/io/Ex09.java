package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SungJuk implements Serializable{
	String name = "홍길동";
	transient int kor = 100; //데이터를 보내지 않는다
	int eng = 100;
}

public class Ex09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "ccc.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		SungJuk sj = new SungJuk();
		oos.writeObject(sj);
		
		oos.close();
		bos.close();
		fos.close();

	}

}
