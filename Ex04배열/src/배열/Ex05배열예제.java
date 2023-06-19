package 배열;

import java.util.Scanner;

public class Ex05배열예제 {
	public static void main(String[] args) {
		
		
		// 최대값과 최소값 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 71};

		// 가장 작은 값과 큰 값을 담을 공간
		int minNum = arr[0];
		int maxNum = arr[0];

		// 값들의 인덱스를 담을 공간
		int minIndex = 0;
		int maxIndex = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			// 최소값 조건식
			if (minNum > arr[i]) {
				minNum = arr[i];
				minIndex = i;
			}
			// 최대값 조건식
			if (maxNum < arr[i]) {
				maxNum = arr[i];
				maxIndex = i;
			}
		}
		
		// 값 출력
		System.out.println("최대값 : " + maxNum + ",  인덱스 : " + maxIndex);
		System.out.println("최소값 : " + minNum + ",  인덱스 : " + minIndex);
		
		
	}

}
