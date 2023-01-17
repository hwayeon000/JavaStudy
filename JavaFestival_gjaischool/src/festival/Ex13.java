package festival;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
//		두 정수를 입력받아 최대공약수&최소공배수를
//		출력하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력 >>");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >>");
		int num2 = sc.nextInt();
		
		int min;
		int max;
		
		int i = 1;
		while (true) {
			if (i * num1 % num2 == 0) {
				min = i * num1;
				break;
			}
			i++;
		}
		max = num1 * num2 / min;
		
		System.out.println("최대공약수:" + max);
		System.out.println("최소공배수:" + min);
		
		
		
		
	}
}
