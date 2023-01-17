package 이차원배열;

public class Ex03이차원배열예제 {
	public static void main(String[] args) {

		
		
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i * 5) + (j + 1) + 20;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length -1; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr.length -1; j >= 0; j--) {
//				arr[j][i] = (i * 5) + (j + 1) + 20;
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}

		
	}

}
