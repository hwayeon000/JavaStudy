package ex01;

import java.util.Scanner;

public class Ex01반올림 {
	public static void main(String[] args) {

//		정수를 입력받아
//		1의 자리에서 반올림 한 결과를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		System.out.println("반올림 수:" + (num+5)/10*10 );
		

	}
}
