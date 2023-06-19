package ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03이진수를십진수로 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이진수 입력 : ");
//		String str = sc.next();

		String str = "01001101";
		
		char[] arr = str.toCharArray();
		
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			if (arr[i]=='1') {
				for (int j = 0; j < arr.length-1-i; j++) {
					cnt *= 2;
				}
				res += cnt;
			}
		}
		System.out.println(res);
		
		
//		for (int i = 0; i < 8; i++) {
//			int cnt = 1;
//			if (str.charAt(i)=='1') {
//				for (int j = 0; j < 8-1-i; j++) {
//					cnt *= 2;
//				}
//				res += cnt;
//			}
//		}
//		System.out.println(res);

	}

}
