package ch08;

import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]); {	//���� �߻� ����, �ش� catch������ ��
											//args[0] :  main(String[] args)�� args�� ������ ��
											//run configuration���� �Է� ����
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage()+"�ٽ� �Է����ֽñ�ٶ��ϴ�.");
		}
	}	//main�޼����� ��
	

	static File createFile(String fileName) throws Exception {
		
		if (fileName==null || fileName.equals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");	//���� �߻�, 
											// �ڽ��� ȣ���� main�޼���, File f = createFile(args[0]);�� ��
		
		File f = new File(fileName);	//FileŬ������ ��ü�� �����.
		// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		f.createNewFile();
		return f;	//������ ��ü�� ������ ��ȯ�Ѵ�.
	}	//createFile�޼����� ��
	
	
}	//Ŭ���� ��
