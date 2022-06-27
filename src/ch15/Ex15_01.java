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
//		data = input.read()	//**read()를 호출한 반환값을 변수 data에 저장한다(괄호먼저)
//		data != -1	//data에 저장된 값이 -1이 아닌지 비교한다.
		
		outSrc = output.toByteArray();	//스트림의 내용을 byte배열로 반환한다.
		
		System.out.println("Inputn Score : "+ Arrays.toString(inSrc));
		System.out.println("Output Source : "+Arrays.toString(outSrc));
		
		
				
		
	}

}
