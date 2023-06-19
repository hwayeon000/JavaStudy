package ex연산자;

import java.util.Scanner;

public class Ex03사술예제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 더하기 : " + (num1 + num2));
		System.out.println("두 수의 빼기 : " + (num1 - num2));
		System.out.println("두 수의 곱하기 : " + (num1 * num2));
		System.out.println("두 수의 나누기(몫) : " + ((float)num1 / num2));
		
		// int / int = int
		// int / double = double
		// double / double = double
		// System.out.println(5/0);
		// + / 0 은 불가능 (오류 발생)
		
		
		// 두 개의 정수값을 입력받아 연산 결과값 출력하기
		// 입력 도구 -> 출력문, 입력
		// 나누기의 결과값은 소수점까지 출력..
		
		
		// println과 print의 차이
		// ln --> 출력문 실행 후 자동 개행(엔터)를 하겠다는 의미
	}

}
