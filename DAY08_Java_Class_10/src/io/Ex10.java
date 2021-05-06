package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex10 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "ccc.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		SungJuk sj = (SungJuk)ois.readObject();
		System.out.println("이름 : " + sj.name);
		System.out.println("국어점수 : " + sj.kor);
		System.out.println("영어점수 : " + sj.eng);
		
		ois.close();
		bis.close();
		fis.close();
	}

}
