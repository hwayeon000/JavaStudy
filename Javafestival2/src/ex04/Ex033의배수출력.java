package ex04;

import java.util.Scanner;

public class Ex033의배수출력 {
	public static void main(String[] args) {
//		숫자를 입력 받아 3의 배수인 숫자를
//		출력하는 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>>");
			arr[i] = sc.nextInt();
			if (arr[i]%3==0) {
				res += arr[i] + " ";
			}
		}
		
		System.out.println("3의 배수 : " + res);
		
	}

}
