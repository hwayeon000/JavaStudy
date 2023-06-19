package ex01정렬;

import java.util.Arrays;

public class Ex01버블정렬정리 {
	public static void main(String[] args) {
		

		int[] arr = { 45, 7, 12, 82, 25 };
		// 오름차순 ---> 버블정렬
		// [7, 12, 25, 48, 82] ---> Arrays.toString();

		// step 1 ) [0] [1]이 비교 ---> [1]에 더 큰 수
		
		int temp = 0;
		
		// 1 Cycle
//		if (arr[0] > arr[1]) {
//			// 만약 0에 있는 값이 1에 있는 값보다 크면
//			// 서로 자리바꿈 == 치환
//			temp = arr[1]; // 7
//			arr[1] = arr[0]; // [45, 45, 12, 82, 25]
//			arr[0] = temp; // [7, 45, 12,82, 25]
//		}
//		// step 2 ) [1] [2] 비교
//		if (arr[1] > arr[2]) {
//			temp = arr[2]; // 12
//			arr[2] = arr[1]; // [7, 12, 45, 82, 25]
//			arr[1] = temp;
//		}
//		// step 3 ) [2] [3] 비교
//		if (arr[2] > arr[3]) {
//			temp = arr[3];
//			arr[3] = arr[2];
//			arr[2] = temp;
//		}
//
//		// step 4 ) [3] [4] 비교
//		if (arr[3] > arr[4]) {
//			temp = arr[4];
//			arr[4] = arr[3];
//			arr[3] = temp;
//		}

//		for (int i = 0; i <= 3; i++) {
//			// i : 0, 1, 2, 3 ---> 4번
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}
//
//		// Cycle2
//		for (int i = 0; i <= 2; i++) {
//			// i : 0, 1, 2, 3 ---> 4번
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}
//		
//		// Cycle3
//		for (int i = 0; i <= 1; i++) {
//			// i : 0, 1, 2, 3 ---> 4번
//			if (arr[i] > arr[i + 1]) {
//				temp = arr[i + 1];
//				arr[i + 1] = arr[i];
//				arr[i] = temp;
//			}
//		}

		// Cycle4

		// 분명 반복되는 패턴 찾을 수 있다
		// 정렬 후 : [7 12 25 45 82]
		
		for (int j = 0; j < arr.length; j++) {
			
			for (int i = 0; i < arr.length -1 -j; i++) {
				// i : 0, 1, 2, 3 ---> 4번
				if (arr[i] > arr[i + 1]) {
					// 만약 0에 있는 값이 1에 있는 값보다 크면
					// 서로 자리 바꿈 == 치환
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
			
		}
		
		
		
		
		for (int j = 0; j < arr.length; j++) {
			
			for (int i = 0; i < arr.length -1 -j; i++) {
				// i : 0, 1, 2, 3 ---> 4번
				if (arr[i] > arr[i + 1]) {
					// 만약 0에 있는 값이 1에 있는 값보다 크면
					// 서로 자리 바꿈 == 치환
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
			
		}

		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
