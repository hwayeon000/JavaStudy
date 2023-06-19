package switch문;

import java.util.Scanner;

public class Ex02switch {
	public static void main(String[] args) {
		
		// num의 값이 1 -> 안녕하세요
		// 2-> 반갑습니다.
		// 3 -> 새해 복 많이받으세요.
		// 그 외 -> 수고하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 골라주세요 >> ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("안녕하세요.");
			break;
		case 2:
			System.out.println("반갑습니다.");
			break;
		case 3:
			System.out.println("새해 복 많이 받으세요.");
			break;
		default:
			System.out.println("수고하셨습니다!");
			break;
		}
		
		
	}

}
