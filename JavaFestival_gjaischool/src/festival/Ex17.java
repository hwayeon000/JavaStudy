package festival;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
//		8자리 정수를 입력받아 반복문을 활용하여
//		입력받은 정수의 합을 구하여 출력하는
//		프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >>");
		int num = sc.nextInt();

		int res = 0;
		while (num > 0) {
			res += num%10;
			num /= 10;
		}
	
		System.out.println(res);
		
	}

}
