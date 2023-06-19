package for문;

public class Ex03for문예제 {
	public static void main(String[] args) {
		
		// 96 ~ 53까지 출력
		
		for (int i = 96; i > 52; i--) {
			System.out.print(i + " ");			
		}
		
		// 줄바꿈
		System.out.println();
		
		// 21 ~ 57 까지 중 홀수만 출력
		for (int i = 21; i < 58; i += 2) {
			System.out.print(i + " ");			
		}
	
		// 줄바꿈
		System.out.println();
		
		// 판단
		for (int i = 21; i < 58; i++) {
			if (i%2 == 1) {
				System.out.print(i + " ");							
			}
		}
		
		
		
	}
}
