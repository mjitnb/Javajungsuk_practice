package ch06;


class Car1 {
	String color;		//색상
	String gearType;	//변속기 종류
	int door;			//문의 개수
		
	Car1() {}
	
	Car1(String c, String d, int e) {
		this.color = c;
		this.gearType = d;
		this.door = e;
	}
}



public class ch06_12 {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();		//기존. 객체생성 후 참조변수 통해 iv값 일일히 접근&초기화(iv값 변경)
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		Car1 c2 = new Car1("Black", "auto", 2); //생성자 사용. 만들었던 형식에 맞춰 원하는 값 대입만 하면 됨
		
		System.out.println("c1의 coror = "+c1.color+", geatType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2의 coror = "+c2.color+", geatType = "+c2.gearType+", door = "+c2.door);
		
		
	}

}
