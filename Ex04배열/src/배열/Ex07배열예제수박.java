package 배열;

import java.util.Scanner;

public class Ex07배열예제수박 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 수박 게임 srtart ====");
		System.out.print("숫자를 입력해주세요 >>");
		int num = sc.nextInt();
		
		char[] wm = {'수', '박'};

		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				System.out.print(wm[1]);
			}else{				
				System.out.print(wm[0]);
			}
		}
		
	}

}
