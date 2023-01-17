package ex03;

import java.util.Scanner;

public class Ex03별찍기오른쪽 {
	public static void main(String[] args) {
//		행 개수를 입력받아 삼각형 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-(i+1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}


}
