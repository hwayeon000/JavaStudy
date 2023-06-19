package 메서드;

import java.util.Scanner;

public class Ex07메서드예제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		// 기능 or 결과값(데이터 타입이 있는)
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과확인 : " + result);
		
		
	}
	
	public static int getAbsoluteValue(int num1, int num2) {	
		return (num1 > num2) ? num1-num2 : num2-num1;
	}
	
}
