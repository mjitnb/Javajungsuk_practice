package ch09;

import java.util.Objects;

class Card {
	
	//iv
	String kind;
	int number;
	
	//생성자
	Card() {
		this("SPADE", 1);	// 생성자 호출 및 초기화
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.number = num;
	}

	
	//toString() 오버라이딩
	// 단축키 : alt shift s , s, 멤버변수만선택 후 만들기
	/*
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	*/
	
	@Override
	public String toString() {
		return "kind : "+kind + ", number : "+number;
	}
	
	
	// equals() 오버라이딩도 추가해보기
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
		// kind는 String니니까 ==연산자가 아니고 equals인거 잊지말기!!!!!!
	}
	
	
	// equal()오버라이딩하면 해시코드도 해야함!!!!
	// 단축키 :  art shift s, h
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	
}


// 실행클래스
public class Ex09_05 {
	public static void main(String[] args) {
		
		
		Card c1 = new Card();
		Card c2 = new Card("Heart", 10);
		Card c3 = new Card();

		
		System.out.println(c1.toString());	// kind : SPADE, number : 1
		System.out.println(c2.toString());	// kind : Heart, number : 10
		
		System.out.println(c1.equals(c3));	//true
		System.out.println(c1.hashCode());	//-1842861219
		System.out.println(c3.hashCode());	//-1842861219
	}
	
}
