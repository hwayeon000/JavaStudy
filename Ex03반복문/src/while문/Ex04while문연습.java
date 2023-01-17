package while문;

import java.util.Scanner;

public class Ex04while문연습 {
	public static void main(String[] args) {
		
		// 사용자가 입력한 값이 짝수가 나오기 전까지 계속 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while (num % 2 != 0) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
		
		
		// num은 짝수인 상황이나 do_while문으로 무조건 한번 실행이므로 상관없음
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		} while (num % 2 != 0);
		System.out.println("종료되었습니다.");
		
		
		// num은 짝수인 상황이나 while(true)문으로 무조건 실행이므로 상관없음
		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		
	}

}
