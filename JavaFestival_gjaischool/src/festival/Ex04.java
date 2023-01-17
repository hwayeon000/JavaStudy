package festival;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
//		마트 계산대 프로그램입니다. 10,000원짜리
//		추석선물셋트를 구입했을 때 지불해야하는
//		금액을 계산해주는 프로그램을 작성하시오.
//		(단, 11개 이상 구매 시에는 10% 할인이 적용됩니다)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품의 개수 입력 >>");
		int num = sc.nextInt();
		
		if (num < 10) {
			System.out.println("가격은 " + 10000 * num + "원 입니다.");
		} else {
			System.out.println("가격은 " + (int)(10000* 0.9 * num) + "원 입니다.");
		}
		
		
		
		
	}

}
