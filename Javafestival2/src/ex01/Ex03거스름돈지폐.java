package ex01;

import java.util.Scanner;

public class Ex03거스름돈지폐 {
	public static void main(String[] args) {
		
//		거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
//		프로그램을 작성하시오.
//		단, 최대단위는 10000원, 최소단위는 100원
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		int man = money/10000;
		int ochen = (money%10000)/5000;
		int chen = (money%5000)/1000;
		int obeak = (money%1000)/500;
		int beak = (money%500)/100;
		
		System.out.println("잔돈 : " + money);
		System.out.println("10000원 : " + man);
		System.out.println("5000원 : " + ochen);
		System.out.println("1000원 : " + chen);
		System.out.println("500원 : " + obeak);
		System.out.println("100원 : " + beak);
		
		
	}

}
