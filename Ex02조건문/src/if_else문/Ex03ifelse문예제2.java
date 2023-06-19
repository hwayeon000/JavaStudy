package if_else문;

import java.util.Scanner;

public class Ex03ifelse문예제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 11) {
			System.out.println(num * 10000 + "원 입니다.");
		}else {
			System.out.println((int)((num*10000)*0.9) + "원 입니다.");
		}
	
		
	}
	
}
