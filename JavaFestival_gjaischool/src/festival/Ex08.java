package festival;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
//		(세 자리 수) * (세 자리 수)는 다음과 같이 계산된다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >>");
		int num1 = sc.nextInt();
		
		System.out.print("두 번쨰 숫자 입력 >>");
		int num2 = sc.nextInt();
		
		System.out.println(num1 * (num2%10));
		System.out.println(num1 * ((num2%100)/10));
		System.out.println(num1 * (num2/100));
		System.out.println(num1*num2);
		
	}

}
