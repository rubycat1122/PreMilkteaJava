package com.kh.java.operator;

public class Exam_Triple {
	public static void main(String [] args) {
		// 삼항연산자
		// %2 == 0 -  true  - 짝수입니다
		//         ㄴ false - 홀수입니다
		// 비교연산자의 결과값(true, false)를 사용해야함.
		// 분기처리 -> 삼항연산자
		/*
		 * 항1 == 항2, 항1 > 항2
		 * 항1 ? 항2 : 항3 (부호는 고정.원칙)
		 * 항1: 비교연산자를 통해 true, false 결과값이 나와야 함.
		 * 항2: true일 때의 리터럴
		 * 항3: false일 때의 리터럴
		 * String result = (num1 > num2) ? "참" : "거짓"
		 * 짝홀판별의 경우
		 * 항1: num%2 == 0, num%2 !=0
		 * 항2: "짝수",		"홀수"
		 * 항3: "홀수", 	"짝수"
		 */
		System.out.print("정수 하나 입력: ");
		// int num1 = 3;
		// int num2 = 0;
		// result = (num1 > num2) ? "참" : "거짓";
		
		int num = 2;
//		result = (num%2 == 0) ? "짝수" : "홀수";
		// 삼항연산자의 장점, 제어문-조건문을 간단하게 쓸 수 있음
		// 제어문-조건문보다 간단하기 때문에 오히려 가독성을 해칠 수 있으므로
		// 간결해지면서 가독성을 해치지 않는 경우에만 사용하는 것을 권장.
		
		
	}
}
