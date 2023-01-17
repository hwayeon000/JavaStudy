package ex04;

import java.util.Scanner;

public class Ex01십진수이진수로 {
	public static void main(String[] args) {
//		10진수 정수를 입력받아
//		2진수로 변환해서 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
		
		String res = "";
		int div = 2;
		while (num > 0) {
			if (num%2 == 0) {
				res += 0 + ",";
			}else{
				res += 1 + ",";
			}
			num = num/2;
		}
		System.out.println(res);
		String[] arr = res.split(",");
		System.out.println(arr.length);
		
		for (int i = arr.length -1; i >= 0 ; i--) {
			System.out.print(arr[i] + " ");
		}

		
	}


}
