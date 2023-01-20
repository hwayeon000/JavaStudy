package ex08;

import java.util.Scanner;

public class Ex04알파벳빈도 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 >> ");
		String str = sc.nextLine();
		
//		System.out.println("1" + str);
		str = str.replace(" ", "");
//		System.out.println("2" + str);
		str = str.toLowerCase();
//		System.out.println("3" + str);
		char[] chr = str.toCharArray();
		int[] res = new int[26];
		
		System.out.println(str);
		
		int f = 97;
		
		for (int i = 0; i < chr.length; i++) {
			res[(int)chr[i] - f] += 1;
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println((char)f + " : " + res[i]);
			f++;
		}
		

	}

}
