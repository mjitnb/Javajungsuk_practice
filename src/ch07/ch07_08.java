package ch07;


// 조상
class Product1 {
	int price;		//제품가격
	int bonusPoint;	//포인트
	
	//생성자
	Product1(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 포인트는 제품 가격의 10%
	}
}


//제품 클래스
class Tv1 extends Product1 {
	
	// 생성자
	Tv1() {
		// 조상 클래스의 생성자를 호출한다.
		super(100);		//Tv의 가격을 100만원으로 한다.
	}
	
	//Object클래스의 toString()을 오버라이딩 한다.
	public String toString() { return "Tv";}
}

class Computer1 extends Product1 {
	public Computer1() {
		super(200);
	}
	public String toString() { return "Computer"; }
}


//고객
class Buyer1 {	

	int money = 1000;		// 소유금액
	int bounusPoint = 0;	// 보유 포인트 점수
	

	//메서드의 매개변수에 다형성을 적용 (조상 타입의 참조변수를 매개변수로 사용)
	// 하나의 메서드로 간단히 처리 가능
	void buy(Product1 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;		
			/*
			!!! 리턴문 : 현재실행중인 메서드를 종료하고 호출한 메서드로 되돌아감.
			이거 안쓰면 잔액부족 메세지 출력 후 !!*계속해서*!아래 내용까지 수행 된 후 다 끝나야 돌아감
			잔액이 -뜨고 차감됨   => 리턴문 써야 함!!!!!!!! 
			*/
		}
		money = money- p.price;
		bounusPoint = bounusPoint + p.bonusPoint;
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	}
}

public class ch07_08 {
	public static void main(String[] args) {
	
		Buyer1 b = new Buyer1();
		
//		Tv t = new Tv();	//이 두줄을
//		b.buy(t);			//아래와 같이 줄일 수 있음
		b.buy(new Tv1());
		b.buy(new Computer1());
		
		System.out.println("> 현재 남은 돈은 "+ b.money+"만원 입니다.");
		System.out.println("> 현재 보유 포인트는 " + b.bounusPoint+"점 입니다.");
	}
}

/*
Tv을/를 구입하셨습니다.
Computer을/를 구입하셨습니다.
> 현재 남은 돈은 700만원 입니다.
> 현재 보유 포인트는 30점 입니다.
*/
