package for문;

import java.util.Scanner;

public class Ex05for문예제 {
	public static void main(String[] args) {
		
		// 한 개의 정수 입력받아 정수의 배수 10개를 출력하는 프로그램
		
		// 예시1
		// << 콘솔 >>
		// 정수를 입력하세요 >> 8
		// 8 16 24 32 40 48 56 64 72 80
		
		// 예시2
		// << 콘솔 >>
		// 정수를 입력하세요 >> 8
		// 8 16 24 32 40 48 56 64 72 80
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(num * i + " ");	
		}
		
		
	}

}
