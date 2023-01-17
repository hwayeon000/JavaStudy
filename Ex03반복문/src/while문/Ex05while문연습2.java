package while문;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05while문연습2 {
	public static void main(String[] args) {
		
		// 다이어트 관리 프로그램
		// 1. 현재 몸무게와 목표 몸무게를 입력받고 주차별 감량 몸무게 입력 받기
		// 2. 목표몸무게를 달성하면 축하한다는 문구를 출력하고 입력을 멈춘다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		int cnt = 1;
		while (goalWeight < weight) {
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			weight = weight - loss;
			cnt++;
		}
		System.out.println(weight + "달성! 축하합니다!");
		
		
//		int res = 0;
//		for (int i = 0; i < 5; i++) {
//			++res;
//			System.out.println(res);
//		}
		

//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
	}
}
