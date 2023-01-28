import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class InputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + "\t");
			}System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("□" + " ");
			}System.out.println();
		}
		
		System.out.println();
//		char[][] res = {{'o', 'x', 'x', 'x','o'}, {'o', 'o', 'o','x','o'}, {'o', 'x', 'o','x','o'}
//		,{'o', 'x', 'x', 'x','o'}, {'o', 'o', 'o', 'o', 'o'}};
		int resCheck = 0;
		int userCheck = 0;
		int[][] res = {{1, 0, 0, 0, 1}, {1, 1, 1, 0, 1}, {1, 0, 1, 0, 1} ,{1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if (res[i][j] == 1) {
					resCheck+=1;
					System.out.printf("%3s","■");
				} else {
					System.out.printf("%3s","□");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		int count = 3;
		int[][] user = new int[5][5];
//		
//		while (count>0) {
//			System.out.println("현재 목굼 : " + count);
//			userCheck = 0;
//			for (int i = 0; i < user.length; i++) {
//				for (int j = 0; j < user.length; j++) {
//					if (user[i][j] == 1) {
//						System.out.print("■" + " ");
//					} else if(user[i][j] == 3) {
//						System.out.print("X" + " ");
//					} else {
//						System.out.print("□" + " ");
//					}
//				}System.out.println();
//			}
//			
//			System.out.print("선택을 원하면 1번, X를 원하면 2번 선택 >>");
//			int oxSelect = sc.nextInt();
//			if (oxSelect == 1) {
//				System.out.print("숫자 선택 >>");
//				int num = sc.nextInt();
//				
//				if (res[(num-1)/5][(num-1)%5] == 1) {
//					user[(num-1)/5][(num-1)%5] = 1;
//					userCheck+=1;
//				} else {
//					count--;
//				}
//			}else if (oxSelect == 2) {
//				System.out.print("숫자 선택 >>");
//				int num = sc.nextInt();
//				
//				if (res[(num-1)/5][(num-1)%5] == 0) {
//					user[(num-1)/5][(num-1)%5] = 3;
//				} else {
//					System.out.println("숫자를 확인하세요.");
//					continue;
//				}
//			}
//			
//			
//			if (userCheck == resCheck) {
//				System.out.println("정답");
//				break;
//			}
//			
//		} // while문 종료
//		
		
		
		String a = "12";
		String[] re = a.split("");
		System.out.println(re[0] + ", " + re[1]);
		

		 long startTime = System.currentTimeMillis() / 60000;

		    // 측정할 코드
		    for (int j = 0; j < 100000; j++){
//		        System.out.println("");
		    }

		    long endTime = System.currentTimeMillis() / 60000;

		    long durationTimeSec = endTime - startTime;
		    System.out.println(endTime);
		
		
		// 최대 힌트 칸 개수 num/2
		
//		System.out.println("■ x x x □");
//		System.out.println("■ ■ ■ x ■");
//		System.out.println("■ x x x □");
//		System.out.println("■ ■ ■ x ■");
//		System.out.println("■ ■ ■ x ■");
		
		
	}
	
	

}
