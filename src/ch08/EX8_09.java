package ch08;

public class EX8_09 {

	public static void main(String[] args) throws Exception{
		method1();	//같은 클래스내의 static멤버이므로 샛체생성없이 호출 가능
					// 예외 받음>try-catch문없음>비정상 종료>예외를 JVM에 넘김(처리못함)
	}	//main메서드의 끝

	static void method1() throws Exception {
		method2();		//예외 받음>try-catch문없음>자신을 호출한 main메서드에 넘김
	}	//method1의 끝
	
	static void method2() throws Exception {
		throw new Exception();	//예외 발생 ->자신을 호출한 method1에 넘김
	}	//method2의 끝
}

