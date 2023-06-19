package 이중for문;

import java.util.Scanner;

public class Ex03별찍기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
		int num = 5;

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		System.out.println();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = num; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = num; i > 0; i--) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = num; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}

			for (int j = i; j < num; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
