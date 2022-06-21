package ch09;

class Ex09_01 {
public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
		System.out.println("v1�� v2�� �����ϴ�.");		// ValueŬ������ �� equals()�� �������̵� ����� ���ٰ� ��µ�		
		else 
			System.out.println("v1�� v2�� �ٸ��ϴ�.");	//�׳� �ؼ��� ���false. �ٸ��ϴٰ� ��µ�

	}
}


class Value {
	int value;

	public Value(int value) {
		this.value = value;
	}
	
	@Override	// Value�� ������ Object�� equals�� �������̵��ؼ�
				//�ּҰ� �ƴ� value�� ��
	public boolean equals(Object obj) {
		
		
		//���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���
		if(!(obj instanceof Value)) return false;
		
		Value v = (Value)obj;	//obj�� Value�� ����ȯ
		
		return this.value==v.value;	
		//�� Ŭ������ value�� obj�� ����� ���ؾ��ϴµ�,
		// obj���� ������ iv���� ���� ->����ȯ ����� ��
		//obj.value   -> v.value
//		return this==obj;	//���� ����. �ּҺ�. ���δٸ� ��ü�� �׻� ����
	}						//�ٵ� ���� ���δٸ� ��ü���� ���� ������ ���̶�� �ϰ������ �������̵�
	
}

//v1�� v2�� �����ϴ�.

