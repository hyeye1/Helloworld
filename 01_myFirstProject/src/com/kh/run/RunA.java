package com.kh.run;

// ���� (import)
import com.kh.first.A_MethodPrinter ;

public class RunA { // ���ุ�� ����ϴ� ����� Ŭ����
	
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����!");
		
		// ���� ���� �޼ҵ带 ȣ�����ָ� ��! ( �޼ҵ��(); )
		// helloPrint(); --> �⺻������ ���� �� Ŭ�������� ���� �޼ҵ带 ã�� ������ 
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����ϰ��� �Ѵٸ� 
		
		// 1) ������ �޼ҵ尡 �����ִ� Ŭ������ ���� "����(new)"
		// [ǥ����] Ŭ������ �뺯���̸� = new Ŭ������();
		//A_MethodPrinter a = new A_MethodPrinter();
		// ���� ����--> ���� ��Ű�� ������ �ش� Ŭ������ ã�⶧����
		
		// �ذ���1. �ش� Ŭ������ � ��Ű���� �����ִ��� Ǯ Ŭ������(��Ű�������̸�)�� �ۼ�
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// �ذ���2. �׳� Ŭ�������� ������ �����ϵ� ��, �� Ŭ������ � ��Ű���� �����ִ��� "����"
		A_MethodPrinter a = new A_MethodPrinter();
		
		
		// 2) ���� �� �޼ҵ� ���� (ȣ��)
		// [ǥ����] �뺯���̸�.�����Ҹ޼ҵ��();
		a.helloPrint();
		a.seeYouPrint();
		a.goodByePrint();
		
	}

}
