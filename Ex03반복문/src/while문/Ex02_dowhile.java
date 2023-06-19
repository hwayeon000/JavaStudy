package while문;

import java.util.Scanner;

public class Ex02_dowhile {
	public static void main(String[] args) {
		
//		do {
//			실행문
//		} while (조건식);
		
//		키보드로부터 입력받은 수가 10보다 작을 때만 계속 정수를 입력받으시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		} while (num < 10);
		
		System.out.println("종료되었습니다.");
		
		
		
	}

}
