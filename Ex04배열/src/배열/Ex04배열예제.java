package 배열;

import java.util.Scanner;

public class Ex04배열예제 {
	public static void main(String[] args) {
		
		// 크기가 10인 배열 arr선언
		// 배열에 Scanner로 입력받은 값을 저장
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		// 입력부
		// 1번째 숫자를 입력하세요 >> 열번 반복
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 숫자를 입력하세요 >>");
			arr[i] = sc.nextInt();
		}
		
		//줄바꿈
		System.out.println();
		
		// 출력부
		// 배열에 들어있는 모든 값 출력
		
		// 가장 큰 값을 담을 공간
		int maxNum = arr[0];
		// 가장 큰 값이 담긴 인덱스를 담을 공간
		int maxIndex = 0;

		System.out.print("배열의 값 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (maxNum < arr[i]) {
				maxNum = arr[i];
				maxIndex = i;
			}
		}
		
		//줄바꿈
		System.out.println();
		
		// 배열에 들어있는 가장 큰 값 출력!
		System.out.println("최대값 : " + maxNum + ", 인덱스 : " + maxIndex);	
		
		
		
	}

}
