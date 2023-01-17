package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("음식을 주문헤주세요.");
		System.out.print("1.국밥 2.돈까스 3.짜장면 4.쭈꾸미 >> ");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("꼬소~한 돼지국밥!!");
		} else if (choice == 2) {
			System.out.println("아~주 바삭한 돈까스!");
		}else if (choice == 3) {
			System.out.println("기름기가 좔좔 흐르는 짜장면!");
		}else if (choice == 4) {
			System.out.println("쭈꾸미!");
		}else {
			System.out.println("다른데로 가주세요..╯︿╰");
		}
		
		
		// 참고 스위치문
		switch (choice) {
			case 1: {
				System.out.println("꼬소~한 돼지국밥!!");
				break;
			}case 2: {
				System.out.println("돈까스!");
				break;
			}case 3: {
				System.out.println("짜장면");
				break;
			}case 4: {
				System.out.println("쭈꾸미!!");
				break;
			}default: {
				System.out.println("다른데로 가주세요..╯︿╰");
				break;
			}
		}
		
		
		
	}

}
