package 이차원배열;

public class Ex01이차원배열 {
	public static void main(String[] args) {
		
		// 1. 이차원배열
		// : 1차원 배열 안에 1차원 배열이 들어가 있는 것
		
		// 이차원 배열 선언
		// 자료형[][] 배열명 = new 자료형[(행)크기][(열)크기];
		int[][] arr = new int[5][5];
		// 5 * 5의 크기를 가진 이차원 배열 선언
		
//		System.out.println(arr);
//		System.out.println(arr[0]);
		// 개의 방이 들어가 있는 주소
		
		
		// arr.length --> arr에 들어가 있는 1차원 배열의 크기 (행)
		// arr[i].length --> 1차원 배열에 들어가 있는 1차원 배열의 크기 (열)
		
		int cnt = 1;
		// 배열에 데이터 값 저장 및 확인하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = cnt;
				arr[i][j] = (i * 5) + (j + 1);
				System.out.print(arr[i][j] + "\t");
				cnt++;
			}
			System.out.println();
		}
		
		// arr 배열에 1~25 숫자 넣고 출력해서 확인해보기
		
		
		
		
		
	}

}
