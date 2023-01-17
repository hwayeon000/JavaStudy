package 이차원배열;

public class Ex06이차원배열예제 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = num;
					num++;
				}
			}else {					
				for (int j = arr.length - 1; j >=0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		
		
		// 이차원 배열
		// : 1차원 배열 안에 1차원 배열이 들어가있는 구조
		int[][] arr1 = new int [3][4];
		
		
		// 자료형[][] 배열명 = new 자료형[배열 크기][배열 크기];
		// [행][열]
		// 행 ---> 배열이 들어갈 수 있는 주소값
		// 열 ---> 실제 데이터가 들어가는 곳
		
		// 접근하는 방법
		System.out.println(arr1); // 1차원 배열 두개가 들어가 있는 주소값
		System.out.println(arr1[1]);  // 1차원 배열이 들어가 있는 주소값 
		System.out.println(arr1[1][2]);  // 실제 데이터를 접근할 수 있는 방법
		
		
	}

}
