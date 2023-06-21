package festival;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
//		소인수 분해를 해주는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >>");
		int num = sc.nextInt();
		
		System.out.print(num + " = ");
		int div = 2;
		while (true) {
			if (num % div == 0) {
				System.out.print(div);
				num /= div;
				if(num == 1) {
					break;
				}
				System.out.print("*");
			}else {
				div++;
			}
		}
		
		
		
	}

}
