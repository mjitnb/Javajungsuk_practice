package ch09;

class Ex09_01 {
public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
		System.out.println("v1과 v2는 같습니다.");		// Value클래스에 서 equals()를 오버라이딩 해줘야 같다고 출력됨		
		else 
			System.out.println("v1과 v2는 다릅니다.");	//그냥 해서는 결과false. 다릅니다가 출력됨

	}
}


class Value {
	int value;

	public Value(int value) {
		this.value = value;
	}
	
	@Override	// Value의 조상인 Object의 equals를 오버라이딩해서
				//주소가 아닌 value를 비교
	public boolean equals(Object obj) {
		
		
		//참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
		if(!(obj instanceof Value)) return false;
		
		Value v = (Value)obj;	//obj를 Value로 형변환
		
		return this.value==v.value;	
		//이 클래스의 value와 obj의 밸류를 비교해야하는데,
		// obj에는 밸류라는 iv값이 없다 ->형변환 해줘야 함
		//obj.value   -> v.value
//		return this==obj;	//기존 형태. 주소비교. 서로다른 객체는 항상 거짓
	}						//근데 나는 서로다른 객체여도 값이 같으면 참이라고 하고싶으면 오버라이딩
	
}

//v1과 v2는 같습니다.

