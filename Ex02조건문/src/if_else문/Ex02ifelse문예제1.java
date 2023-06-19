package if_else문;

import java.util.Scanner;

public class Ex02ifelse문예제1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 나이 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		//판단(조건식)
		// 성인인지 아닌지
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
	}

}
