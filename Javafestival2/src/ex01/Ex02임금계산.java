package ex01;

import java.util.Scanner;

public class Ex02임금계산 {
	public static void main(String[] args) {
		
//		일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
//		시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
//		1.5배의 시급이 책정됩니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		double res = 1;
		if (time < 9) {
			res = time * 5000;
		} else {
			res = (5000*8) + (time-8)*(5000 * 1.5);
		}
		
		System.out.println((int)res);
		
	}

}
