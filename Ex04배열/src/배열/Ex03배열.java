package 배열;

import java.util.Scanner;

public class Ex03배열 {
	public static void main(String[] args) {
		
		// 배열에 입력한 값 저장

		// 입력 도구
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성 (정수를 저장 할 수 있는 크기 5를 가진 배열)
		int[] arr = new int[5];
		
		// 배열에 데이터 입력할 수 있는 코드
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
//		arr[3] = sc.nextInt();
//		arr[4] = sc.nextInt();
		
		// 입력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번 인덱스 값 : ");
			arr[i] = sc.nextInt();
		}
		
		// 출력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		
		
	}

}
