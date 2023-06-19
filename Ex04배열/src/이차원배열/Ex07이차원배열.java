package 이차원배열;

import java.util.Scanner;

public class Ex07이차원배열 {
	public static void main(String[] args) {
		
		int[][] arr = {{4, 5, 4, 1, 2}, {0, 0, 0, 0, 0}, {10, 20, 30, 20, 20}};
		int total = 0;
		// arr[0] -> 정답
		// arr[1] -> 사용자 입력값
		// arr[2] -> 배점
		
		
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < arr[1].length; j++) {
			System.out.print(j + 1 + "번째 답 >>");
			arr[1][j] = sc.nextInt();
			
			if (arr[0][j] == arr[1][j]) {
				arr[1][j] = 1;
			}else {
				arr[1][j] = 0;
			}
		}
		
		for (int i = 0; i < arr[1].length; i++) {
			if (arr[1][i] == 1) {
				System.out.print("O\t");
				total += arr[2][i];
			}else {
				System.out.print("X\t");
			}
		}System.out.println();
		
		System.out.println("총점 : " +  total);
		
		
		
		
		// 1. 입력하는 도구 가져오기
	      
	      // 2. 3행 5열 배열 answer만들기
	      
	      // + 2차원 배열을 선언 및 초기화 하는 방법
	      // ex) int[][] arr = new int[2][3]
	      // -----> int[][] arr = {{1,2,3},{1,2,3}}
	      
	      // 3. 1행은 답으로 초기화 하기
	      // 4. 3행은 배점으로 초기화 하기
	      // 5. 2행은 사용자가 입력한 값으로 초기화또는 재할당 하기
	      // ( 배열에서 입력한 값으로 초기화했던 방법 떠올리기 !!)
	      
	      // 6. 1행과 2행이 일치하는지 판단한다음 x/o출력하기
	      // 7. 만약에 일치한다면(일치해서 실행되는 시점(부분)찾아서)
	      //    총합에 해당 문제의 배점 더해주기
	      // 8. 마지막에 배점 출력하기
	}

}
