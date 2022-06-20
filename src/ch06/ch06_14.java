package ch06;


public class ch06_14 {

	static {
		System.out.println("static { 클래스 초기화 블럭 }");
	}
	
	{
		System.out.println("{ 인스턴스 초기화 블럭  } ");
	}
	
	public ch06_14() {
		System.out.println("생성자");
		System.out.println();
	}
	
	//-----------------------------------------
	
	public static void main(String[] args) {
		System.out.println("ch06_14 객체생성1");
		ch06_14 bt = new ch06_14();
		
		System.out.println("ch06_14 객체생성2");
		ch06_14 bt2 = new ch06_14();
	}
}

//static { 클래스 초기화 블럭 }
//ch06_14 객체생성1
//{ 인스턴스 초기화 블럭  } 
//생성자
//
//ch06_14 객체생성2
//{ 인스턴스 초기화 블럭  } 
//생성자
