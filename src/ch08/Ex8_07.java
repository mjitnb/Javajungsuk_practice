package ch08;

public class Ex8_07 {

	public static void main(String[] args) {
		
//		throw new Exception();	//Exception�� ���Ƿ� �߻���Ű��.
	
		try {	//ExceptionŬ������ �� �ڼ��� �ݵ�� ����ó���� ������Ѵ�. (�ʼ�)
		throw new Exception();
		} catch (Exception e){}	//catch�� ����ó��
		
		
		
		throw new RuntimeException();
		//RuntimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �ȴ�.(����)
		// ����ó�� ���ص� �� �ȴ�x -> �ܼ��� �����Ϸ� �������� �ǰ� �ȵǰ� ���ϴ� ��. �̰� ��.
	}

}
