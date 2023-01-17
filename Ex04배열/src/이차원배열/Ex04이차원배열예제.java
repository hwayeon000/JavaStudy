package 이차원배열;

public class Ex04이차원배열예제 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

//		for (int i = arr.length-1; i >= 0; i--) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[j][i] = (i * 5) + (j + 1) + 20;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr.length-1; j >= 0; j--) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		/// 쌤 코드

		// arr.length = 5
		// arr[i].length = 5

		// i랑 j 자리/변하는 형태를 바꿔서
		// (0,4)(1,4)(2,4)(3,4)(4,4)
		// 의 형태로 출력되게 만들어 보자
		//
//	      for(int i = 0; i < arr.length; i++) {
//	         // i = 0인 동안 j = 0 1 2 3 4의 값을 가짐
//	         for(int j = 0; j < arr[i].length; j++) {
//	            System.out.print("("+i+","+j+")");
//	         }System.out.println();
//	      }

		int num = 21;
		for (int i = arr.length - 1; i >= 0; i--) {
			// i = 0인 동안 j = 0 1 2 3 4의 값을 가짐
			for (int j = 0; j < arr.length; j++) {
//		            System.out.print("("+j+","+i+")");
				arr[j][i] = num;
				num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
