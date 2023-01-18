package ex08;

import java.util.Scanner;

public class Ex01세자리수곱 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		
		System.out.println((num2%10)*num1);
		System.out.println(((num2/10)%10)*num1);
		System.out.println((num2/100)*num1);
		System.out.println(num2*num1);
		
	}

}
