package 배열;

import java.util.Scanner;

public class Ex08배열별찍기 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
		int[] arr = new int[5];
		// 입력부
		// 1번째 숫자를 입력하세요 >> 열번 반복
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 별의 개수 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
