package ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03이진수를십진수로 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이진수 입력 : ");
		String str = sc.next();
		String[] arr = str.split("");
		ArrayList<Integer> total = new ArrayList<>();

		int str10 = 0;
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			total.add(num);
			num *= 2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				str10 += total.get(arr.length-i-1);
			}
		}
		System.out.println(str10);
		
		
		
	}

}
