package com.kh.first;

public class B_ValuePrinter { // ����Ŭ������(��Ű������ ����) : com.kh.first.B_ValuePrinter
	
	
	// ���1 : �ڹٿ��� ����ϴ� ������ ����ϴ� ���
	public void printValue() {
		
		// 1. ����(true/false) => ����ǥ ����
		System.out.println(true);
		System.out.println(false);
		
		// 2. ���ڰ� (������/�Ǽ���) => ����ǥ ����
		System.out.println(10);
		System.out.println(12.14);
		
		// ������� �� ����� ��� 
		System.out.println(1235+124);
		
		// 3. ���ڰ� (�ѱ���)-> Ȭ����ǥ �̿�
		System.out.println('a');
		System.out.println('��');
		// System.out.println('�ٴ�');
		
		// 4. ���ڿ�(��������)�� => �ֵ���ǥ �̿�
		System.out.println("�ٴ�");
		System.out.println("�ȳ��ϼ���");
		
		// 	���ڿ��� �� ���� ������ ��������!
		System.out.println("����"+'a');
		System.out.println("�ݰ����ϴ�"+123);
		System.out.println("�ٽø�����"+1+2);
		// -> ���꿡�� ������ �ִ�. �̹� "�ٽø�����"�� "1"�� ���ڿ��� �������⿡, 2���� ���ڿ��� ��������. 3�� ���Ѵٸ� ��ȣ�� ����
				
	}
	
	// ���2. ���ڿ��� ���ڰ��� ���������� ��� ��°���
	public void sumStringNumber( ) {
		
		System.out.println(9+9);  //18
		System.out.println(9+"9");  //99
		System.out.println("9"+9);  //99
		System.out.println("9"+"9"); //99
		
		System.out.println(9+9+9);  //27
		System.out.println(9 + 9 + "9"); // ��ȣ�� �������� �ʱ⶧���� �Ǿտ� ���ڳ���18 + "9" = 189
		System.out.println(9 + "9" + 9); // 999
		System.out.println("9" + 9 + 9);  // 999 
		System.out.println("9" + (9 + 9)); // 918
		
		// ����Ǵ� ������ �����ض�!
		
		
	}


	
	
	
	
}
