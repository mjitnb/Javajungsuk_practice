package ch15;

import java.io.*;

public class Ex15_15 {

	public static void main(String[] args) throws IOException{

// �̹� �����ϴ� ������ ������ ��
//		File f = new File("./src/ch15/Ex15_15.java");
		File f = new File("./src/ch15", "Ex15_15.java");
// ������ ���� ������ ���� ������ ��
		File fn = new File("./src/ch15", "NewFile.java");
		f.createNewFile();  //���ο� ������ �����ȴ�.
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ ���� �̸� : "+f.getName());
		System.out.println("Ȯ���ڸ� ������ ���� �̸� : "+fileName.substring(0,pos));
		System.out.println("Ȯ���� : " + fileName.substring(pos+1));
		
		System.out.println("��θ� ������ ���� �̸� : "+ f.getPath());
		System.out.println("������ ������ : "+f.getAbsolutePath());
		System.out.println("������ ���԰�� : "+f.getCanonicalPath());
		System.out.println("������ �����ִ� ���丮 : "+f.getParent());
		System.out.println();
		
		
		
	}

}
/*
��θ� ������ ���� �̸� : Ex15_15.java
Ȯ���ڸ� ������ ���� �̸� : Ex15_15
Ȯ���� : java
��θ� ������ ���� �̸� : .\src\ch15\Ex15_15.java
������ ������ : E:\workspace\Javajungsuk_practice\.\src\ch15\Ex15_15.java
������ ���԰�� : E:\workspace\Javajungsuk_practice\src\ch15\Ex15_15.java
������ �����ִ� ���丮 : .\src\ch15
*/