package io;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		if(file.createNewFile()) {
			//createNewFile()은 파일이 없으면 파일을 생성후 True 반환
			//파일이 있으면 False 반환
			System.out.println("aaa.txt 파일을 생성중");
		}else {
			System.out.println("aaa.txt 파일은 이미 존재합니다.");
		}
		
		File imsi = File.createTempFile("Java", ".dat", dir);
		//임시 파일 생성
		//임시 파일은 앞에 이름을 알려주고 중간에 임의의 숫자가 들어간다
		//뒤에 이름을 알려준다(확장자)
		imsi.deleteOnExit();
		//프로그램이 끝날 때 삭제된다.
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		//5초간 잠재운다.
		
		file.delete();
		//바로 삭제 aaa
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
	}
}
