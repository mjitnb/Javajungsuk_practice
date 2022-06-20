package ch06;


class Car {
	
	//멤버변수
	String color;		//색상
	String gearType;	//변속기 종류
	int door;			//문의 개수
		

    //	생성자
	
	Car(String color, String rearType, int door) {  // 생성자a라고 칭하겠음
		this.color = color;							
		this.gearType = rearType;
		this.door = door;			// 객체생성시 컬러,기어,문 3개를 입력하여 초기화하는 형식
	}
	
	
	Car () {						// 생성자 a를 호출(사용)해서 그 틀을 이용. 	
		this("white", "auto", 4);	// 객체생성시 3개의 초기화값이 이미 정해진 형식
	}
	
	Car (String color){				// 생성자 a를 호출(사용)해서 그 틀을 이용. 
		this(color, "auto", 4);  	// 객체생성시 컬러만 입력하여 초기화. 기어,문은 이미 정해진 형식
	} 
	
	
}



public class ch06_13 {

	public static void main(String[] args) {
		
		Car c1 = new Car("blue","auto",2);		
		Car c2 = new Car();		
		Car c3 = new Car("red");		
		
		System.out.println("c1 = "+c1.color+", "+c2.gearType+", "+c1.door);
		System.out.println("c2 = "+c2.color+", "+c2.gearType+", "+c2.door);
		System.out.println("c3 = "+c3.color+", "+c3.gearType+", "+c3.door);
//		c1 = blue, auto, 2
//		c2 = white, auto, 4
//		c3 = red, auto, 4
	}

}
