package 과제;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int choice = sc.nextInt();

		int res = 0;
		int charge = 0;

		switch (choice) {
		case 1:
			res = 700;
			break;
		case 2:
			res = 1000;
			break;
		case 3:
			res = 500;
			break;
		default: 
			res = 0;
			System.out.println("메뉴를 확인하새오..");
		}
		
		
		if (money >= res) {
			charge = money - res;

			int cheon = charge/1000;
			int obeak = (charge%1000)/500;
			int beak = (charge%500)/100;
			
			if (cheon != 0) {
				System.out.print("천원 : " + cheon + "개");
			}
			if (obeak != 0) {
				System.out.print(" 오백원 : " + obeak + "개");
			}
			if (beak != 0) {
				System.out.print(" 백원 : " + beak + "개");
			}else {
				System.out.println("잔돈 : "+ charge + "원");
			}
			
			
		} else {
			System.out.println("금액을 확인해 주세요!");
			System.out.println(money);
		}
		
		
		

		
		
//		if (charge == 0) {
//			System.out.println("잔돈 " + charge + "원");
//		}else {
//			System.out.println("천원 : " + cheon + "개, 오백원 : "+ obeak + "개, 백원 : " + beak + "개");
//		}
		

	}
}
