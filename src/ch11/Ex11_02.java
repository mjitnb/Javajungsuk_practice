package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList();		//Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		
		while(!st.empty()) {	//비었는지 확인 //비어있지 않으면 계속 꺼냄
			System.out.println(st.pop());	//스택에서 요소 하나를 꺼내서 출력
		}
		
		//-------------------------------
		System.out.println("= Queue =");
		
		while(!q.isEmpty()) {	////비었는지 확인 //비어있지 않으면 계속 꺼냄
			System.out.println(q.poll());	//큐에서 요소 하나를 꺼내서 출력
		}
		
	}

}

//= Stack =
//2
//1
//0
//= Queue =
//0
//1
//2
