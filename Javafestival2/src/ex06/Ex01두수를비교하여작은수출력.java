package ex06;

import java.util.Scanner;

public class Ex01두수를비교하여작은수출력 {
	public static void main(String[] args) {
//		N과 X를 입력받는다.
//		N개의 정수를 입력받는다.
//		N개의 숫자 중 X보다 작은 수만 출력 한다
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		System.out.print("X 입력 : ");
		int x = sc.nextInt();
				
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}

		
		System.out.print("결과 >> ");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
