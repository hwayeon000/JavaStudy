package ex02;

import java.util.Scanner;

public class Ex04구구단단수 {
	public static void main(String[] args) {
		
//		단 수와 곱해지길 원하는 수 입력

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "단");
		for (int i = 1; i <= num2; i++) {
			System.out.println(num1  + "*" + i + "=" + num1*i);
		}
		
	}

}
