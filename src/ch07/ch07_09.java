package ch07;


// 조상
class Product {
	int price;		//제품가격
	int bonusPoint;	//포인트
	
	//생성자
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 포인트는 제품 가격의 10%	
	}
	
	Product() {}	//기본생성자
}

class Tv extends Product {
	Tv() { super(100);	}
	public String toString() { return "Tv";}
}
class Computer extends Product {
	Computer() { super(200);	}
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50);	}
	public String toString() { return "Audio";}
}




//고객
class Buyer {	

	int money = 1000;	
	int bounusPoint = 0;	
	Product[] cart = new Product[10];	// 구입한 제품을 저장하기위한 배열
	int i = 0;		//Product배열에 사용될 카운터

	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;		
		}
		
		money = money- p.price;
		bounusPoint = bounusPoint + p.bonusPoint;
		
		cart[i++] = p;	//제품을 Product[] cart에 저장한다.
		System.out.println(p+ "을/를 구입하셨습니다.");
		//문자열과 참조변수를 덧셈연산하면, 참조변수에 toString메서드가 호출되어 문자열을 얻어서 결합한다.
	}
	
	void summery () {	//구매한 물품에대한 정보를 용약해서 보여준다.
		int sum = 0;	//구입한 물품의 가격 합계
		String itemList = "";	// 구입하 물품 목록
	
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
//			itemList += cart[i] + ", ";
			itemList += (i==0)? ""+cart[i] : ", "+cart[i];
			
			
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class ch07_09 {
	public static void main(String[] args) {
	
		Buyer b = new Buyer();
		

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summery();

	}
}
/*
Tv을/를 구입하셨습니다.
Computer을/를 구입하셨습니다.
Audio을/를 구입하셨습니다.
구입하신 물품의 총 금액은 350만원 입니다.
구입하신 제품은 Tv, Computer, Audio입니다.
*/