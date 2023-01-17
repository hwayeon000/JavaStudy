package while문;

import java.util.Scanner;

public class Ex06while문연습 {
	public static void main(String[] args) {
		
		// 0부터 100까지의 숫자를 입력받는다.
		// 단, 볌위를 벗어나는 숫자를 입력할 시 이전까지 입력 된 숫자의
		// 합계와 평균을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		float cnt = 0;
		int total = 0;
		int num = 0;
		
//		while (num >= 0 && num < 101) {
//			total += num;
//			cnt++;
//			System.out.println("숫자를 입력하세요.");
//			num = sc.nextInt();
//		}
//		// 101 일 때에 +1 이므로 빼줌
//		cnt--;

		
//		do {
//			total += num;
//			System.out.println("숫자를 입력하세요.");
//			num = sc.nextInt();
//			cnt++;
//		} while (num >= 0 && num < 101);
//		// 101 일 때에 +1 이므로 빼줌
//		cnt--;
		
		
		while (true) {
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			if (num < 0 || num > 100) {
				break;
			}
			total += num;
			cnt++;		
		}
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + total/cnt);
		
		
		
//		내가 입력한 글자가 “조자연” 문자열이 맞는지
//		맞으면 출력문으로 맞습니다!, 아니면 아닙니다!
		
		String name = "조자연";
		name.equals("조자연");
		// name == "조자연" X
		// name 이라는 문자열 값이 "조자연"이라는 문자열이 맞나요?
		// --> true or false
		if (name.equals("조자연")) {
			System.out.println("맞습니다!");
		} else {
			System.out.println("아닙니다!");
		}
		
		
		
	}
}
