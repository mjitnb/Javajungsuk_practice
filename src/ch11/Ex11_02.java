package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList();		//Queue�������̽��� ����ü�� LinkedList�� ���
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		
		while(!st.empty()) {	//������� Ȯ�� //������� ������ ��� ����
			System.out.println(st.pop());	//���ÿ��� ��� �ϳ��� ������ ���
		}
		
		//-------------------------------
		System.out.println("= Queue =");
		
		while(!q.isEmpty()) {	////������� Ȯ�� //������� ������ ��� ����
			System.out.println(q.poll());	//ť���� ��� �ϳ��� ������ ���
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
