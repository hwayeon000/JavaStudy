package festival;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
//		입력받은 수의 약수를 구하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("약수를 구하고 싶은 수 입력 >>");
		int num1 = sc.nextInt();
		
		System.out.print(num1 + "의 약수는 : 1 ");
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
