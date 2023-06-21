package festival;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
		// 프로그램을 작성하시오.
		// 단, 최대단위는 10000원, 최소단위는 100원
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("거스름돈 입력 >>");
		int num = sc.nextInt();
		
		System.out.println("잔돈 반환");
		System.out.println("10000원 : " + (num/10000));
		System.out.println("10000원 : " + ((num%10000)/5000));
		System.out.println("10000원 : " + ((num%5000)/1000));
		System.out.println("10000원 : " + ((num%1000)/500));
		System.out.println("10000원 : " + ((num%500)/100));
		

	
		
	}

}
