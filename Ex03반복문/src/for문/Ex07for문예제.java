package for문;

import java.util.Scanner;

public class Ex07for문예제 {
	public static void main(String[] args) {
		
		// 입력받은 정수의 약수를 구하시오
		// 약수 : 자기자신을 나누어 떨어지게 하는 수
		// 약수의 특징 : 자기자신보다 큰 수는 없다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		
		
		// 완전수 구하기
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			cnt = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					cnt += j;
				}
			}
			if (cnt == i) {
				System.out.println(i);
			}
			
		}
		
		
		

		
	}

}
