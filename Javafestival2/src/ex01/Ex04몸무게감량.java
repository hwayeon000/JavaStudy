package ex01;

import java.util.Scanner;

public class Ex04몸무게감량 {
	public static void main(String[] args) {
		
//		현재몸무게와 목표몸무게를 각각 입력 받고 
//		주차 별 감량몸무게를 입력 받아 목표 달성 시 
//		축하 메세지를 띄우는 프로그램을 구현하시오.
		
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
		
		
	}

}
