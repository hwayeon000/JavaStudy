package 단순if문;

import java.util.Scanner;

public class Ex02단순if문예제2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 나이 입력받기
		System.out.print("나이 입력 : ");
		int num = sc.nextInt();
		//판단(조건식)
		// 성인인지 아닌지
		if(num > 19) {
			System.out.println("성인입니다.");
		}
		// 중괄호 밖은 무조건 실행되어버림
//		System.out.println("성인이 아닙니다.");
	}

}
