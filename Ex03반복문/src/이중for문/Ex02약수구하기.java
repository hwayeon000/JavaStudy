package 이중for문;

public class Ex02약수구하기 {
	public static void main(String[] args) {
		
		// 2~30까지의 약수 구하기
			
		for (int i = 2; i < 31; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					System.out.print(j + " ");					
				}
			}
			System.out.println();
		}
		
		
		
	}

}
