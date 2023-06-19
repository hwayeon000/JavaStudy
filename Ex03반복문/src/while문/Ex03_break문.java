package while문;

import java.util.Scanner;

public class Ex03_break문 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수입력 : ");
			int num = sc.nextInt();
			
			if (num >= 10) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
				
	}
}
