package festival;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//		정수를 입력받아
//		입력받은 수까지의 총합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >>");
		int num = sc.nextInt();
		
		int res = 0;
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + res + "입니다.");
		
	}

}
