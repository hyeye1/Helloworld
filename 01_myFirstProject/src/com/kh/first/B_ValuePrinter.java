package com.kh.first;

public class B_ValuePrinter { // 실제클래스명(패키지까지 포함) : com.kh.first.B_ValuePrinter
	
	
	// 기능1 : 자바에서 취급하는 값들을 출력하는 기능
	public void printValue() {
		
		// 1. 논리값(true/false) => 따옴표 없이
		System.out.println(true);
		System.out.println(false);
		
		// 2. 숫자값 (정수값/실수값) => 따옴표 없이
		System.out.println(10);
		System.out.println(12.14);
		
		// 산술연산 한 결과도 출력 
		System.out.println(1235+124);
		
		// 3. 문자값 (한글자)-> 홑따옴표 이용
		System.out.println('a');
		System.out.println('바');
		// System.out.println('바다');
		
		// 4. 문자열(여러글자)값 => 쌍따옴표 이용
		System.out.println("바다");
		System.out.println("안녕하세요");
		
		// 	문자열과 그 외의 값들의 덧셈연산!
		System.out.println("하이"+'a');
		System.out.println("반갑습니다"+123);
		System.out.println("다시만나요"+1+2);
		// -> 연산에는 순서가 있다. 이미 "다시만나요"와 "1"이 문자열로 더해졌기에, 2또한 문자열로 더해진다. 3을 원한다면 괄호로 묶기
				
	}
	
	// 기능2. 문자열과 숫자간의 덧셈연산한 결과 출력가능
	public void sumStringNumber( ) {
		
		System.out.println(9+9);  //18
		System.out.println(9+"9");  //99
		System.out.println("9"+9);  //99
		System.out.println("9"+"9"); //99
		
		System.out.println(9+9+9);  //27
		System.out.println(9 + 9 + "9"); // 괄호로 묶여있지 않기때문에 맨앞에 숫자끼리18 + "9" = 189
		System.out.println(9 + "9" + 9); // 999
		System.out.println("9" + 9 + 9);  // 999 
		System.out.println("9" + (9 + 9)); // 918
		
		// 연산되는 순서를 생각해라!
		
		
	}


	
	
	
	
}
