package ch09;

class Person {

	//iv
	long id; //�ֹι�ȣ
	
	//Object�޼��� �������̵�
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return this.id==((Person)obj).id;	//obj�� ObjectŸ���̹Ƿ� iv���� �����ϱ� ���ؼ��� 
											// PersonŸ������ ����ȯ �ʿ�
		else
			return false;	//Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ䵵 ����.
	}
	
	//������
	public Person(long id) {
		this.id = id;
	}	
}


// ����Ŭ����
class Ex09_02 {
	public static void main(String[] args) {
		Person p1 = new Person(9911000011122L);
		Person p2 = new Person(9911000011122L);
		
		
		if (p1.equals(p2))
			System.out.println("p1�� p2�� ���� ��� �Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ��� �Դϴ�.");		
	}
}