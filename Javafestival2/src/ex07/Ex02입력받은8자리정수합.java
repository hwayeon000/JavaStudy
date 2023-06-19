package ex07;

import java.util.Scanner;

public class Ex02입력받은8자리정수합 {
	public static void main(String[] args) {
//		8자리 정수를 입력받아 반복문을 활용하여
//		입력받은 정수의 합을 구하여	출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		int res = 0;
		for (int i = 0; i < 8; i++) {
			res += num%10;
			num = num/10;
		}
		System.out.println(res);
		
		
	}


}
