package ex06;

public class Ex04제곱값반환 {
	public static void main(String[] args) {
		/* 2개의 정수 base, n을 받아 base의 n제곱 만큼
  		값을 반환하는 powerN() 메소드 */
		
		int base = 10;
		int n = 2;
		int res = powerN(base, n);
		
		System.out.println(res);
	}
	
	public static int powerN(int a, int b) {
		int res = 1;
		for (int i = 1; i <= b; i++) {
			res = res * a;
		}
		return res;
	}

}
