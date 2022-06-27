package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_02 {

	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(tmp,0,tmp.length);	//�о�� �����͸� �迭 tmp�� ��´�.
		output.write(tmp,5,5);	// tmp[5]���� 5���� �����͸� erite�Ѵ�.
		
		outSrc = output.toByteArray();	//��Ʈ���� ������ byte[] outSrc �迭�� ��ȯ�Ѵ�.
		
		System.out.println("Input Stream :"+ Arrays.toString(inSrc));
		System.out.println("tmp : " + Arrays.toString(tmp));
		System.out.println("Output Stream : "+ Arrays.toString(outSrc));
				
		
	}
}
/*
Input Stream :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
tmp : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Output Stream : [5, 6, 7, 8, 9]
*/