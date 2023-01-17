package switch문;

import java.util.Scanner;

public class Ex03switch문예제 {
	public static void main(String[] args) {
		
		// 점수를 입력받기
		// 점수가 100~80 A
		// 점수 60~70 B
		// 40~50 C, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int num = sc.nextInt();
		String res = "";
		
		
		switch (num/10) {
		case 10, 9, 8:
			res = "A";
			break;
		case 7, 6:
			res = "B";
			break;
		case 5, 4:
			res = "C";
			break;
		default:
			res = "F";
			break;
		}
		System.out.println(res + "학점 입니다.");
		
		
		
		
		
		
	}

}
