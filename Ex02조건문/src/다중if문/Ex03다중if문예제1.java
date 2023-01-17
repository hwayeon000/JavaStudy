package 다중if문;

import java.util.Scanner;

public class Ex03다중if문예제1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		int totalScore = sc.nextInt();
		String res;
		
		if (totalScore >= 90) {
			res = "A";
		} else if (totalScore >= 80) {
			res = "B";
		} else if (totalScore >= 70) {
			res = "C";
		}else {
			res = "D";
		}

		System.out.println(res + "학점입니다.");
		
		
		
		
		
	}

}
