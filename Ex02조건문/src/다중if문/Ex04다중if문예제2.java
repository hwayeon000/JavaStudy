package 다중if문;

import java.util.Scanner;

public class Ex04다중if문예제2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int softDesign = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int softDevelop = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int dataBase = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int programming = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int infoSystem = sc.nextInt();
		
		int total = softDesign + softDevelop + dataBase + programming + infoSystem;
		boolean isCheck = (softDesign >= 8 && softDevelop >= 8 && dataBase >= 8 && programming >= 8 && infoSystem >= 8);
		boolean result = total >= 60 && isCheck;

		String res;		
		
//		if (isCheck) {
//			if (total >= 60) {
//				res = "합격";
//			}else {
//				res = "불합격";
//			}
//		} else {
//			res = "불합격";
//		}
		
		if (result) {
			res = "합격";
		} else {
			res = "불합격";
		}
		
		System.out.println(res + "입니다.");
		
		
		
		
		
	}

}
