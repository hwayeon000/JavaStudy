package ex05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02오름차순정렬 {
	public static void main(String[] args) {
//		5개의 정수를 입력받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}

		// 배열 출력하여 확인해보기
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if (arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp; // i를 j로 변경
				}
			}
		}
		
		// 정렬 후 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 정렬 후 결과 출력
		}


	}


}
