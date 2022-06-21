package ch09;

class Person {

	//iv
	long id; //주민번호
	
	//Object메서드 오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return this.id==((Person)obj).id;	//obj가 Object타입이므로 iv값을 참조하기 위해서는 
											// Person타입으로 형변환 필요
		else
			return false;	//타입이 Person이 아니면 값을 비교할 필요도 없다.
	}
	
	//생성자
	public Person(long id) {
		this.id = id;
	}	
}


// 실행클래스
class Ex09_02 {
	public static void main(String[] args) {
		Person p1 = new Person(9911000011122L);
		Person p2 = new Person(9911000011122L);
		
		
		if (p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람 입니다.");
		else
			System.out.println("p1과 p2는 다른 사람 입니다.");		
	}
}