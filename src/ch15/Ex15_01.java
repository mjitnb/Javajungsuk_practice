package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_01 {

	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		
		int data = 0;
		
		while((data = input.read())!=-1) {
			output.write(data);	//void write(in b)
		}
		
//		(data = input.read())!=-1
//		data = input.read()	//**read()�� ȣ���� ��ȯ���� ���� data�� �����Ѵ�(��ȣ����)
//		data != -1	//data�� ����� ���� -1�� �ƴ��� ���Ѵ�.
		
		outSrc = output.toByteArray();	//��Ʈ���� ������ byte�迭�� ��ȯ�Ѵ�.
		
		System.out.println("Inputn Score : "+ Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
		
				
		
	}

}
