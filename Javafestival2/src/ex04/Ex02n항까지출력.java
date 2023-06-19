package ex04;

import java.util.Scanner;

public class Ex02n항까지출력 {
	public static void main(String[] args) {
//		정수 n을 입력받아
//		1, 2, 4, 7, 11 과 같은 수열의
//		n번째 항까지 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		int res = 1;

		for (int i = 0; i < num; i++) {
			res += i;
			System.out.print(res + " ");
		}
		
	}

}
