package ex04;

import java.util.Scanner;

public class Ex01십진수이진수로 {
	public static void main(String[] args) {
//		10진수 정수를 입력받아
//		2진수로 변환해서 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int n = sc.nextInt();
		
		String res = "";
		
		while (n>0) {
			res += n%2;
			n /= 2;
		}
		
		char[] arr = res.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length-i-1] + " ");
		}
		
	}


}
