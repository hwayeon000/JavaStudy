package 배열;

import java.util.Scanner;

public class Ex06배열예제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int[] arr = new int[5];
		// 입력부
		// 1번째 숫자를 입력하세요 >> 열번 반복
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		// 가장 작은 값과 큰 값을 담을 공간
		int minNum = arr[0];
		int maxNum = arr[0];
		int total = 0;
//		String a = "";
		
		for (int i = 0; i < arr.length; i++) {
			// 최소값 조건식
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
			// 최대값 조건식
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
			total += arr[i];
//			a += arr[i] + " "; 
			sb.append(arr[i] + " ");
		}
		
		// 값 출력
//		System.out.println("입력된 점수 : " + a);
		System.out.println("입력된 점수 : " + sb.toString());
		System.out.println("최고 점수 : " + maxNum);
		System.out.println("최저 점수 : " + minNum);
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + (double)total/arr.length);
		
		
		
	}

}
