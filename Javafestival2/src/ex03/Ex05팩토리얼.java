package ex03;

import java.util.Scanner;

public class Ex05팩토리얼 {
	public static void main(String[] args) {
//		1보다 큰 정수(N)를 입력하여 N!값을 구하시오.
//		* 팩토리얼이란 N의 수보다 작거나 같은 모든 양의 정수의 곱
//		ex) 3! = 1 x 2 x 3 => 6
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res *= i;
		}
		System.out.println("출력 : " + res);
		
	}
}
