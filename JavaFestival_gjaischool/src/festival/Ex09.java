package festival;

public class Ex09 {
	public static void main(String[] args) {
		
//		1-2+3-4+…+99-100 를 계산하여
//		답을 출력하시오.
		
		int res = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				res -= i;
				System.out.print(-i + " ");
			} else {
				res += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("결과 : " + res);
		
	}

}
