package 이차원배열;

public class Ex05이차원배열예제 {
	public static void main(String[] args) {
		
		
		int[][] arr = new int[5][5];
		
		int num = 21;
		for (int i = arr.length - 1; i >= 0; i--) {
			// i = 0인 동안 j = 0 1 2 3 4의 값을 가짐
			for (int j = arr.length -1; j >= 0; j--) {
		            System.out.print("("+j+","+i+")");
				arr[j][i] = num;
				num++;
			}System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		
		
		
	}

}
