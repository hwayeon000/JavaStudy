package ex05;

public class Ex03이차원배열회전 {
	public static void main(String[] args) {
//		2차원 배열을 왼쪽으로 90도 회전하여 출력하시오

		int[][] arr = new int[5][5];
		
		int cnt = 1;
		// 값 넣으며 원본 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		
		System.out.println();

		// 90도 회전
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + "\t");
			}System.out.println();
		}
		
	}
}
