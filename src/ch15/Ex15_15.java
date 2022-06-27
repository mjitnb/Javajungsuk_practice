package ch15;

import java.io.*;

public class Ex15_15 {

	public static void main(String[] args) throws IOException{

// 이미 존재하는 파일을 참조할 때
//		File f = new File("./src/ch15/Ex15_15.java");
		File f = new File("./src/ch15", "Ex15_15.java");
// 기존에 없는 파일을 새로 생성할 때
		File fn = new File("./src/ch15", "NewFile.java");
		f.createNewFile();  //새로운 파일이 생성된다.
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름 : "+f.getName());
		System.out.println("확장자를 제외한 파일 이름 : "+fileName.substring(0,pos));
		System.out.println("확장자 : " + fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일 이름 : "+ f.getPath());
		System.out.println("파일의 절대경로 : "+f.getAbsolutePath());
		System.out.println("파일의 정규경로 : "+f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉토리 : "+f.getParent());
		System.out.println();
		
		
		
	}

}
/*
경로를 제외한 파일 이름 : Ex15_15.java
확장자를 제외한 파일 이름 : Ex15_15
확장자 : java
경로를 포함한 파일 이름 : .\src\ch15\Ex15_15.java
파일의 절대경로 : E:\workspace\Javajungsuk_practice\.\src\ch15\Ex15_15.java
파일의 정규경로 : E:\workspace\Javajungsuk_practice\src\ch15\Ex15_15.java
파일이 속해있는 디렉토리 : .\src\ch15
*/