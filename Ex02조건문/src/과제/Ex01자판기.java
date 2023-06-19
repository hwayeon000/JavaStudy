package 과제;

import java.util.Scanner;

public class Ex01자판기 {
	public static void main(String[] args) {
		
		// 쌤 풀이
		
		Scanner sc = new Scanner(System.in);
		
		// 1단계 : 금액을 입력하고 메뉴를 고른 뒤 잔돈을 출력하기
		// 2단계 : 입력한 금액이 선택한 메뉴의 가격보다 부족하면 돈이 부족하다는 문장 출력

		System.out.print("금액을 입력하세요 >> ");
		int inputMoney = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("[1]아우터(700원) [2]이구동성(1000원) [3]에그몽(500원) >> ");
		int menu = sc.nextInt();
		
//		초기화의 필요성..
//		int price;
//		이렇게 선언하면 오류, price의 값이 없을 수 있기 때문에 오류 발생..
		int price = 0;
		
		if (menu == 1) {
			price = 700;
		} else if (menu == 2) {	
			price = 1000;
		} else if (menu == 3) {	
			price = 500;	
		} else {
			System.out.println("메뉴를 확인하세요.");
		}
		
		int change = inputMoney;
		if (inputMoney < price) {
			System.out.println("돈이 부족합니다.");
		} else {
			change = inputMoney - price;
		}
		
		int cheon = change/1000;
		int obeak = (change%1000)/500;
		int beak = (change%500)/100;
		
		if (cheon != 0) {
			System.out.print("천원 : " + cheon + "개");
		}
		if (obeak != 0) {
			System.out.print(" 오백원 : " + obeak + "개");
		}
		if (beak != 0) {
			System.out.print(" 백원 : " + beak + "개");
		}

		
	}

}
