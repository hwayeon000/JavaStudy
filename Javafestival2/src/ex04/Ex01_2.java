package ex04;

import java.util.Scanner;

public class Ex01_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();

		binary(num);

	}

	public static void binary(int num) {

		if (num > 0) {
			binary(num / 2);
			System.out.print(num % 2 + " ");
		}
		
	}


}
