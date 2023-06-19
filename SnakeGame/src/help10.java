
public class help10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		// res도 5를 num으로 수정하기
		int[][] res = new int[num][num];
		int[][] user = new int[num][num];
		String ans = "0000001111,0001110001,0001000011,0001111101,0001000001,0001000111,0111001111,1111001111,1111000110,0110000000";
		res = arrMake(ans, num);
		// num 수정하기
		printQuestion(res, user, num);
		
		
		
	}

	public static int[][] arrMake(String ans, int num) {
		int[][] res = new int[num][num];
		String[] arr = ans.split(",");

		for (int i = 0; i < res.length; i++) {
			String[] arr3 = arr[i].split("");
			for (int j = 0; j < arr.length; j++) {
				res[i][j] = Integer.parseInt(arr3[j]);
//				System.out.print(res[i][j] + " ");
			}
//			System.out.println();
		}
		return res;
	}
	
	
	
	public static void printQuestion(int[][] ans, int[][] user, int numX) {
		// x hint
		String[] hintArrX = getHintArrX(ans, numX);
		// y hint
		String[] hintArrY = getHintArrY(ans, numX);

		int hintZone = (ans.length + 1) / 2;
		int entireZone = (ans.length + 1) / 2 + ans.length;
		int len = (ans.length+1)/2;
		
		for(int i = 0; i < entireZone; i++) {
			for(int j = 0; j < entireZone; j++) {
				if (i < hintZone && j < hintZone) {
					System.out.print("  ");
				} else if(i >= hintZone && j >= hintZone){
					if (user[i-len][j-len] == 1) {
						System.out.print("■" + " ");
					} else if (user[i-len][j-len] == 3) {
						System.out.print("X" + " ");
					} else {
						System.out.print("□" + " ");
					}
					
					
				} else {
					if (i < len) {
						//수정  j-3을 j-len
						String[] a = hintArrY[j-len].split("");
						if (a.length > i ) {
							System.out.print(a[i] + " ");
						}else {
							System.out.print("  ");
						}
					}else {
						String[] a = hintArrX[i-len].split("");
						if (a.length > j ) {
							System.out.print(a[j] + " ");
						}else {
							System.out.print("  ");
						}
					}
					
				}
			} System.out.println();
		}
		
	}

	public static String[] getHintArrX(int[][] ans, int numX) {

		int cntNumX = 0;
//		int numX = 5;
		String[] hintArrX = new String[numX];
		for (int i = 0; i < hintArrX.length; i++) {
			hintArrX[i] = "";
		}
//		String[] hintArrX = { "", "", "", "", "" };
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < hintArrX.length; j++) {
				if (ans[i][j] == 1) {
					cntNumX++;
					if (j == numX - 1 && ans[i][numX - 1] == 1) {
						hintArrX[i] += cntNumX;
					}
				} else if (ans[i][j] == 0) {
					if (cntNumX != 0) {
						hintArrX[i] += cntNumX;
					}
					cntNumX = 0;
				}

			}
			cntNumX = 0;
		}

		return hintArrX;
	}

	public static String[] getHintArrY(int[][] ans, int numY) {
		
		int cntNumY = 0;
//		int numY = 5;
		String[] hintArrY = new String[numY];
		for (int i = 0; i < hintArrY.length; i++) {
			hintArrY[i] = "";
		}
//		String[] hintArrY = { "", "", "", "", "" };
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < hintArrY.length; j++) {
				if (ans[j][i] == 1) {
					cntNumY++;
					if (j == numY - 1 && ans[j][i] == 1) {
						hintArrY[i] += cntNumY;
					}
				} else if (ans[j][i] == 0) {
					if (cntNumY != 0) {
						hintArrY[i] += cntNumY;
					}
					cntNumY = 0;
				}

			}
			cntNumY = 0;
		}
		
		return hintArrY;
	
	
	}
}
