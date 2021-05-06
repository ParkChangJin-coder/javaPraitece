package io;

import java.io.File;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File file1 = new File("C:\\aaa\\aaa.txt");
		//파일이 없어도 상관 없다.
		
		//File file2 = new File("C:\\aaa", "aaa.txt");
		//이런식으로도 나타낼 수 있다.
		
		File file3 = new File("C:\\aaa");
		//폴더까지만 만들 수도 있다.
		
		File file4 = new File(file3, "aaa.txt");
		//파일 경로에 객체를 넣어서 만들 수 있다.
		
		//윈도우 폴더구별자  : \\
		//리눅스 폴더 구별자 : /
		//윈도우 패스구별자 : ;
		//리눅스 패스구별자 : :
		
		File dir = new File("C:" + File.separator + "aaa");
		//File.separator : 폴더 구별자
		File file = new File(dir, "aaa.txt");
		
		
	}

}
