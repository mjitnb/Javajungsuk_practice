package ch08;

public class Ex8_12 {

	public static void main(String[] args) {
		
		try {
			method1();	//4.���� �޾Ƽ�
		}catch (Exception e) {	//5. ó��
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	} //main �޼��� ��

	
	static void method1() throws Exception {	//���ܼ���>main���� ���� �ѱ�
		try {
			throw new Exception();	//1. ���ܹ߻�
		} catch (Exception e) {		//2.ó��
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;	//	3. �ٽ� ���ܸ� �߻���Ų��.
		}
	}	//method1 ��
	
	
}	//���ܸ� 2�� ó����


// method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.
// main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.
