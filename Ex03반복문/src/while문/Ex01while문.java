package while문;

import java.util.Scanner;

public class Ex01while문 {
	public static void main(String[] args) {
		
		// while문 구조
//		while (조건식) {
//			// 실행문;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		// while문을 실행시킬 수 있는 조건으로 초기화 해주기
		int num = 0;
		while (num < 10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		
		
		
		
	}

}
