package for문;

public class Ex04for문예제 {
	public static void main(String[] args) {
		
		// 5. 1 ~ 100 중 3의 배수만 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 6. 1 ~ 100 중 3과 5의 배수만 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
