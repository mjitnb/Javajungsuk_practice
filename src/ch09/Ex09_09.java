package ch09;
import java.util.StringJoiner;

class Ex09_09 {
	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");	//���ڿ��� ','�� �����ڷ� ������ �迭�� ����
		
//		String str = String.join("-",  arr);	//�迭�� ���ڿ��� -�� ������ ����
//		System.out.println(str);				//dog-cat-bear
		
		System.out.println(String.join("-", arr));	//���ٷ� ���� �ڵ�

		
		//StringJoinerŬ������ ����� ��
		StringJoiner sj = new StringJoiner("/","[","]");

		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
