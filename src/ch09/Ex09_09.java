package ch09;
import java.util.StringJoiner;

class Ex09_09 {
	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");	//문자열을 ','를 구분자로 나눠서 배열에 저장
		
//		String str = String.join("-",  arr);	//배열의 문자열을 -로 구분햇 결합
//		System.out.println(str);				//dog-cat-bear
		
		System.out.println(String.join("-", arr));	//한줄로 줄인 코드

		
		//StringJoiner클래스를 사용한 것
		StringJoiner sj = new StringJoiner("/","[","]");

		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
