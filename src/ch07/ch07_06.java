package ch07;

public class ch07_06 {
	public static void main(String[] args) {


	class Car {}

	class FireEngine extends Car {}

	class Ambulance extends Car {}

	FireEngine f = new FireEngine();

	Car c = (Car) f; // Ok. f가 조상인 Car타입으로 형변환
	FireEngine f2 = (FireEngine) c; // ok. c가 자손인 FireEngine타입으로 형변환(생략불가)
//	Ambulance a = (Ambulance)f;		//에러. 상속관계가 아닌 클래스간의 형변환 불가.

	FireEngine fe = new FireEngine();
	if (fe instanceof FireEngine) {
		System.out.println("This(fe가 참조하는 것) is a FireEngine instance.");
	}
	if (fe instanceof Car) {
		System.out.println("This(fe가 참조하는 것) is a Car instance.");
	}
	if (fe instanceof Object) {
		System.out.println("This(fe가 참조하는 것) is a Object instance.");
	}
	
	
	}
}


//This(fe가 참조하는 것) is a FireEngine instance.
//This(fe가 참조하는 것) is a Car instance.
//This(fe가 참조하는 것) is a Object instance.