package ex03;

import java.util.Random;
import java.util.Scanner;

public class Ex02랜덤수합게임 {
	public static void main(String[] args) {
//		랜덤 정수 두개로 두개의 합 구하여 맞는지 틀린지 구하기
//		다섯번 틀리면 게임오버
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		
		int cnt = 0;
		while (cnt < 5) {
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int num = sc.nextInt();
			if (num1 + num2 == num) {
				System.out.println("Success!");
			} else {
				System.out.println("Fail...");
				cnt++;
			}
		}System.out.println("GAME OVER!");
	}

}
