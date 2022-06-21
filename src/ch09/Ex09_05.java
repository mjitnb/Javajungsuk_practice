package ch09;

import java.util.Objects;

class Card {
	
	//iv
	String kind;
	int number;
	
	//������
	Card() {
		this("SPADE", 1);	// ������ ȣ�� �� �ʱ�ȭ
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.number = num;
	}

	
	//toString() �������̵�
	// ����Ű : alt shift s , s, ������������� �� �����
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
	
	
	// equals() �������̵��� �߰��غ���
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
		// kind�� String�ϴϱ� ==�����ڰ� �ƴϰ� equals�ΰ� ��������!!!!!!
	}
	
	
	// equal()�������̵��ϸ� �ؽ��ڵ嵵 �ؾ���!!!!
	// ����Ű :  art shift s, h
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	
}


// ����Ŭ����
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
