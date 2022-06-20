package ch07;

//자손
class Car2 {
	
	String color;
	int door;
	
	void drive() {  System.out.println("drive, Brrr~~~~");  }
	void stop() {  System.out.println("stop!!!");  }
}

//조상
class FireEngine extends Car2 {
	void water()  {  System.out.println("water!!!");  }
}


//실행
public class ch07_07 {
	public static void main(String[] args) {
		
		Car2 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();		// water!!!  정상작동
		
		car = fe;		
		//car = (Car)fe; 에서 형변환이 생략됨  
		//자손 -> 조상 Car타입으로 형변환
		//fe의 값(객체주소)를 car에 저장
			car.color = "white";	//fe의 주소가 저장된 car참조변수(타입 Car)를통해 
			car.door = 4;			//변수&메소드 호출 가능
			car.drive();
//			car.water();			// **컴파일 에러!!! Car타입의 참조변수로는 water()를 호출할 수 없다.**
		
			
		fe2 = (FireEngine)car;		// 자손타입 <- 조상타입  형변환 생략 불가
									//참고로 car에는 이미 fe가 가지고있던 FireEngine 객체 주소값이 저장되어있음
		fe2.water();	// water!!!  정상작동
		
	}

}
