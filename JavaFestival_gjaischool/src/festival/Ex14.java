package festival;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
//		1부터 입력받은 수 까지의
//		약수를 모두 구하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >>");
		int num1 = sc.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			System.out.print(i + " : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}System.out.println();
		}
		
		
	}

}
