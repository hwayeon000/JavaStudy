package ex01정렬;

import java.util.Arrays;

public class Ex02선택정렬 {
	public static void main(String[] args) {
		
		// 선택정렬 (selection sort)
		// : 가장 큰수 / 가장 작은수를 찾아서 
		// 원하는 위치에 해당하는 값을 옮겨 정렬하는 것
		
		// 최대 치환 횟수가 1번
		// 시간이 절반 감소됨
		
		int[] arr = {70, 7, 89, 13, 24};
		// 내림차순 정렬
		// {98, 7,0 2,4 13, 7}
		
//		int temp = 0; //치환
//		int maxIndex = 0; //가장 큰 수가 가지고 있는 인덱스의 값
		
//		// Cycle 1
//		// 기준인덱스 [0]
//		// 가장 큰 수를 찾아 [0]에 있는 값과 자리 바꾸기
//		if (arr[0]>arr[maxIndex]) {
//			maxIndex = 0;
//		}
//		// 2
//		if (arr[1]>arr[maxIndex]) {
//			maxIndex = 1;
//		}
//		// ... 4
//		if (arr[4]>arr[maxIndex]) {
//			maxIndex = 4;
//		}
//		
//		// Cycle 1~4 ---> 반복문으로 만들기
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]>arr[maxIndex]) {
//				maxIndex = i;
//			}
//		}
//		
//		// maxIndex : 가장 큰 수의 인덱스 값
//		// 기준 index값에 있는 데이터화 maxIndex에 있는 데이터 자리 바꾸기
//		// : 치환
//		// [0]  [maxIndex] 자리 바꾸기
//		temp = arr[maxIndex];
//		arr[maxIndex] = arr[0];
//		arr[0] = temp;
//		
//		
//		
//		// Cycle 2
//		// Cycle 1~4 ---> 반복문으로 만들기
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i]>arr[maxIndex]) {
//				maxIndex = i;
//			}
//		}
//		
//		// maxIndex : 가장 큰 수의 인덱스 값
//		// 기준 index값에 있는 데이터화 maxIndex에 있는 데이터 자리 바꾸기
//		// : 치환
//		// [0]  [maxIndex] 자리 바꾸기
//		temp = arr[maxIndex];
//		arr[maxIndex] = arr[1];
//		arr[1] = temp;
//		
//		
//		// Cycle 3
//		// Cycle 4
//		
//
//		// Cycle 1~4 ---> 반복문으로 만들기
//		for (int j = 0; j < arr.length-1; j++) {
//			for (int i = j; i < arr.length; i++) {
//				// i ---> 1 2 3 4 ---> 4번 반복 ---> 4번 비교
//				if (arr[i]>arr[maxIndex]) {
//					maxIndex = i;
//					// arr[i]에 있는 값이 maxIndex에 잇는 값보다 더 크면
//					// 인덱스 i를 maxIndex에 저장
//				}
//			}
//			// 치환
//			temp = arr[maxIndex];
//			arr[maxIndex] = arr[j];
//			arr[j] = temp;
//		}

		//----------------수업--------------------------
//		for(int j = 0; j < arr.length - 1; j++) {  // <= 3
//			for (int i = j; i < arr.length; i++) { // <= 4
//				if (arr[i]>arr[maxIndex]) {
//					maxIndex = i;
//					// arr[i]에 있는 값이 maxIndex에 잇는 값보다 더 크면
//					// 인덱스 i를 maxIndex에 저장
//				}
//			}
//			// 치환
//			temp = arr[maxIndex];
//			arr[maxIndex] = arr[j];
//			arr[j] = temp;
//		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if (arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					
					// 치환
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp; // i를 j로 변경
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 정렬 후 결과 출력
		}


		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
