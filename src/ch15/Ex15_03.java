package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex15_03 {

	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source : "+Arrays.toString(inSrc));
		System.out.println();
		
		try {
//			while(input.available() > 0) {	//기존내용 위에 덮어 씀
//				input.read(temp);
//				output.write(temp);
			/*
					temp : [0, 1, 2, 3]
					Output Source : [0, 1, 2, 3]
					temp : [4, 5, 6, 7]
					Output Source : [0, 1, 2, 3, 4, 5, 6, 7]
					temp : [8, 9, 6, 7]
					Output Source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7]
			*/				
			
			while(input.available() >0) {	//읽어온 만큼(len)만 출력함
				int len = input.read(temp);
				output.write(temp,0,len);
				
				outSrc = output.toByteArray();
				printArrays(temp,outSrc);
			}
		} catch(IOException e) {}		
	}

	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : "+Arrays.toString(temp));
		System.out.println("Output Source : "+ Arrays.toString(outSrc));
	}

}
