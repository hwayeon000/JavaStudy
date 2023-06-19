package ex04;

import java.util.Scanner;

public class Ex07이차원배열출력 {
	public static void main(String[] args) {
//		정수 N을 입력받아 N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오
//		1	2	3	4	5	
//		10	9	8	7	6	
//		11	12	13	14	15	
//		20	19	18	17	16	
//		21	22	23	24	25
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 >>");
		int num = sc.nextInt();
		
		int[][] arr = new int[num][num];
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i%2==0) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print(arr[i][arr.length-1-j] + "\t");
				}
			}System.out.println();
		}
		
		
		
		
		
	}


}
