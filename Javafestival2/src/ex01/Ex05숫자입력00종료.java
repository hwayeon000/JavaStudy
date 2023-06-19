package ex01;

import java.util.Scanner;

public class Ex05숫자입력00종료 {
	public static void main(String[] args) {
		
//		다음과 같은 프로그램을 작성하시오.
//		• A,B 숫자를 입력 받는다.
//		• A-B를 출력한다.
//		• A와 B가 모두 0을 입력 받으면 프로그램이 종료된다
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 1;
		
		while (num1 != 0 || num2 != 0) {
			System.out.print("A 입력 >>");
			num1 = sc.nextInt();
			System.out.print("B 입력 >>");
			num2 = sc.nextInt();
			
//			if (num1 == 0 && num2 == 0) {
//				break;
//			}
			System.out.println(num1-num2);
		}
		
	}

}
