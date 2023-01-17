package if_else문;

import java.util.Scanner;

public class Ex01ifesle문 {
	public static void main(String[] args) {
		
		// if - else 문
//		if (조건식) {
//			조건식이 true일 경우 실행시킬 코드;
//		} else {
//			조건식이 false일 경우 실행코드;
//		}
//		
		Scanner sc = new Scanner(System.in);
		// 나이 입력받기
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		//판단(조건식)
		// 성인인지 아닌지
		if(age > 19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("청소년입니다.");
		}
		
		
		
		
	}

}
