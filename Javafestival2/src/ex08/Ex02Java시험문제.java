package ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Java시험문제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		String str = sc.next();
//		String str = "oooxoo";

		char[] arr = str.toCharArray();

		int res = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'o') {
				cnt++;
				res += cnt;
			} else {
				cnt = 0;
			}
		}
		System.out.println(res);

	}

}
