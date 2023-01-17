package ex연산자;

import java.util.Scanner;

public class Ex02산술예제1 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
		
		int num = 456;		
		int res = (num/100)*100;
		int res2 = num % 100;
		
		System.out.println(res);
		System.out.println(num-res2);
		
	}

}
