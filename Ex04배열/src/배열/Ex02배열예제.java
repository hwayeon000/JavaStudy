package 배열;

public class Ex02배열예제 {
	public static void main(String[] args) {
		
		// 1차원 정수형 배열 선언 후 임의값으로 초기화
		// 값은 {3, 9, 72, 71, 13, 8, 16}
		// 배열의 값 중 홀수값이 몇개인지 출력하는 프로그램
		
		// int 자료형을 가진 arr묘 배열 생성
		// 크기 7 (선언하면 고정되는 값 : 아래쪽에서 바꿀 수 없음)
		int[] array = {3, 9, 72, 71, 13, 8, 16};
		
		int cnt = 0;
		String a = ""; 
		for (int i = 0; i < array.length; i++) {
			if (array[i]% 2 != 0) {
				cnt++;
				a += array[i] + " ";
			}
		}
		
		System.out.println("array에 들어있는 홀수는 " + a + "이며, 총 " + cnt + "개 입니다.");
		

		System.out.println();
		System.out.println("쌤꺼");
		
		// 개수가 저장 될 공간
		int cnt1 = 0;
		// 홀수임을 판단하는 순간 +1
		System.out.print("array에 들어있는 홀수는 ");
		for (int i = 0; i < array.length; i++) {
			if (array[i]% 2 == 1) {
				cnt1++;
				System.out.print(array[i] + " ");
			}
		}
		// cnt1 : 배열에 들어가 있는 홀수의 개수
		System.out.println("이며, 총 " + cnt1 + "개 입니다.");
		
		
		
		
	}
}
