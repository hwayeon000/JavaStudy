package ex04;

import java.util.Scanner;

public class Ex05인덱스수만큼별찍기 {
	public static void main(String[] args) {
//		사용자에게 입력받아 배열의
//		인덱스의 수 만큼 별을 출력해보세요.

		Scanner sc = new Scanner(System.in);
//		int[] arr = {9, 4, 5, 2, 1};
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
	}
}
