package ch08;

public class Ex8_12 {

	public static void main(String[] args) {
		
		try {
			method1();	//4.예외 받아서
		}catch (Exception e) {	//5. 처리
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	} //main 메서드 끝

	
	static void method1() throws Exception {	//예외선언>main으로 예외 넘김
		try {
			throw new Exception();	//1. 예외발생
		} catch (Exception e) {		//2.처리
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;	//	3. 다시 예외를 발생시킨다.
		}
	}	//method1 끝
	
	
}	//예외를 2번 처리함


// method1메서드에서 예외가 처리되었습니다.
// main메서드에서 예외가 처리되었습니다.
