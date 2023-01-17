package festival;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//		현재 몸무게와 목표몸무게를 입력 받은 후
//		반복문을 활용하여 주차별 목표 몸무게에
//		도달할때까지 몸무게를 감소시켜
//		목표몸무게에 달성하게 되면
//		프로그램을 종료하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 입력 >>");
		int wg = sc.nextInt();
		System.out.print("목표 몸무게 입력 >>");
		int goalWg = sc.nextInt();
		
		int cnt = 1;
		while (wg > goalWg) {
			System.out.print("감량 몸무게 입력 >>");
			int loss = sc.nextInt();
			wg -= loss;
			if (wg <= goalWg) {
				System.out.println(cnt + "주차 다이어트 성공!");
			}
			cnt++;
		}
		
		
		
		
		
	}

}
