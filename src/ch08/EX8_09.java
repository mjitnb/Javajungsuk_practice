package ch08;

public class EX8_09 {

	public static void main(String[] args) throws Exception{
		method1();	//���� Ŭ�������� static����̹Ƿ� ��ü�������� ȣ�� ����
					// ���� ����>try-catch������>������ ����>���ܸ� JVM�� �ѱ�(ó������)
	}	//main�޼����� ��

	static void method1() throws Exception {
		method2();		//���� ����>try-catch������>�ڽ��� ȣ���� main�޼��忡 �ѱ�
	}	//method1�� ��
	
	static void method2() throws Exception {
		throw new Exception();	//���� �߻� ->�ڽ��� ȣ���� method1�� �ѱ�
	}	//method2�� ��
}

