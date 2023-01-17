package ex연산자;

import java.util.Scanner;

public class Ex09삼항연산자예제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String res = num % 2 ==0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(num + "는(은) " + res);
		
		
	}

}
