package ch08;

public class Ex8_07 {

	public static void main(String[] args) {
		
//		throw new Exception();	//Exception을 고의로 발생시키다.
	
		try {	//Exception클래스와 그 자손은 반드시 예외처리를 해줘야한다. (필수)
		throw new Exception();
		} catch (Exception e){}	//catch로 예외처리
		
		
		
		throw new RuntimeException();
		//RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.(선택)
		// 예외처리 안해도 다 된다x -> 단순히 컴파일러 차원에서 되고 안되고를 말하는 것. 이건 됨.
	}

}
