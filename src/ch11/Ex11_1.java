package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
	public static void main(String[] args) {
		//기본길이(용량, capacity)가 10이니 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList에는 객체만 저장 가능
		//autoboxing에 의해 기본형이 참조형으로 자동 변환
//		list1.add(5); 	//라고도 쓸 수 있음.(오토박싱으로 자동변환 됨). 하지만 이건 객체배열이니까 객체만 저장 가능
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//list.subList(int from, int to) from<=~<to 사이에 저장된 객체를 일부 뽑아서 새 list 만듦
		// 이 서브리스트로 만들어진 리스트는 읽기 전용.
		// 그래서 아래와같이 new로 새로운 ArrayList를 만들어줘야 내용 변경 가능
		// 생성자 중에 ArrayList(Collection c) 사용
		System.out.println("적용 : .add  .subList(from,to)  ArrayList(Collection c) 생성자");
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	//1<=x<4
		print(list1, list2);	//그냥 편하게 출력하려고 아래에 메서드 만든 것
		
		
		
		//정렬하는 방법
		//Collection은 인터페이스, Collections는 유틸 클래스
		System.out.println("* Collections.sort(참조변수) ");
		Collections.sort(list1);	//list1과 2를 정렬한다.
		Collections.sort(list2);
		print(list1, list2);
		
		
		//list1이 list2의 모든 요소를 포함하고 있는가? ->true
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	//추가할 위치 지정 & 추가
		print(list1, list2);
		
		
		//.set  변경
		list2.set(3, "AA");	//인덱스 3에 있는걸 ""으로 변경
		print(list1, list2);
		
		
		
		list1.add(0,"1"); 	//0번째 자리에 "문자열" "1을 넣음
		print(list1,list2);	//list1 : [1, 0, 1, 2, 3, 4, 5]  한칸씩 밀려남. 참고. 뒤에는 다 숫자
		//indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index = "+list1.indexOf("1"));	//index = 0
		System.out.println("index = "+list1.indexOf(1));	//index = 2
		System.out.println("index = "+list1.indexOf(new Integer(1)));	//숫자의 경우 원래는 이렇게 써야 함
		
		
		list1.remove(0);	//인덱스(n)의 객체를 지움
		print(list1, list2); 	//list1 : [0, 1, 2, 3, 4, 5]  앞에 "1"이 지워짐
//		** 주의 할 점. **
		list1.remove(1); 	// 인덱스가 1인 객체를 삭제
		list1.remove(new Integer(1));	// 숫자 1을 찾아서 삭제
		print(list1, list2);	//list1 : [0, 2, 3, 4, 5]  인티저1이 지워짐
	
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll (list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list2에 퐇람된 객체들을 삭제한다.
		// 1. get(i)으로 list2에서 하나씩 꺼낸다.
		// 2. cotains()로 꺼낸 객체가 list1에 있는 지 확인
		// 3. remove(i)로 해당 객체를 list2에서 삭제
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);		
	} //main의 끝
	
	

	
//예제에서 컬렉션리스트 프린트 쉽게하는 메서드
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();		
	}
} //class
