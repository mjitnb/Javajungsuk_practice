package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
	public static void main(String[] args) {
		//�⺻����(�뷮, capacity)�� 10�̴� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		
		//ArrayList���� ��ü�� ���� ����
		//autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
//		list1.add(5); 	//��� �� �� ����.(����ڽ����� �ڵ���ȯ ��). ������ �̰� ��ü�迭�̴ϱ� ��ü�� ���� ����
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//list.subList(int from, int to) from<=~<to ���̿� ����� ��ü�� �Ϻ� �̾Ƽ� �� list ����
		// �� ���긮��Ʈ�� ������� ����Ʈ�� �б� ����.
		// �׷��� �Ʒ��Ͱ��� new�� ���ο� ArrayList�� �������� ���� ���� ����
		// ������ �߿� ArrayList(Collection c) ���
		System.out.println("���� : .add  .subList(from,to)  ArrayList(Collection c) ������");
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	//1<=x<4
		print(list1, list2);	//�׳� ���ϰ� ����Ϸ��� �Ʒ��� �޼��� ���� ��
		
		
		
		//�����ϴ� ���
		//Collection�� �������̽�, Collections�� ��ƿ Ŭ����
		System.out.println("* Collections.sort(��������) ");
		Collections.sort(list1);	//list1�� 2�� �����Ѵ�.
		Collections.sort(list2);
		print(list1, list2);
		
		
		//list1�� list2�� ��� ��Ҹ� �����ϰ� �ִ°�? ->true
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	//�߰��� ��ġ ���� & �߰�
		print(list1, list2);
		
		
		//.set  ����
		list2.set(3, "AA");	//�ε��� 3�� �ִ°� ""���� ����
		print(list1, list2);
		
		
		
		list1.add(0,"1"); 	//0��° �ڸ��� "���ڿ�" "1�� ����
		print(list1,list2);	//list1 : [1, 0, 1, 2, 3, 4, 5]  ��ĭ�� �з���. ����. �ڿ��� �� ����
		//indexOf()�� ������ ��ü�� ��ġ(�ε���)�� �˷��ش�.
		System.out.println("index = "+list1.indexOf("1"));	//index = 0
		System.out.println("index = "+list1.indexOf(1));	//index = 2
		System.out.println("index = "+list1.indexOf(new Integer(1)));	//������ ��� ������ �̷��� ��� ��
		
		
		list1.remove(0);	//�ε���(n)�� ��ü�� ����
		print(list1, list2); 	//list1 : [0, 1, 2, 3, 4, 5]  �տ� "1"�� ������
//		** ���� �� ��. **
		list1.remove(1); 	// �ε����� 1�� ��ü�� ����
		list1.remove(new Integer(1));	// ���� 1�� ã�Ƽ� ����
		print(list1, list2);	//list1 : [0, 2, 3, 4, 5]  ��Ƽ��1�� ������
	
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll (list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2���� list2�� �l���� ��ü���� �����Ѵ�.
		// 1. get(i)���� list2���� �ϳ��� ������.
		// 2. cotains()�� ���� ��ü�� list1�� �ִ� �� Ȯ��
		// 3. remove(i)�� �ش� ��ü�� list2���� ����
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);		
	} //main�� ��
	
	

	
//�������� �÷��Ǹ���Ʈ ����Ʈ �����ϴ� �޼���
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();		
	}
} //class
