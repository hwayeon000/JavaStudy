package ex02;

public class Ex01더하기빼기100 {
	public static void main(String[] args) {

//		1-2+3-4+…+99-100를 계산하여답을 출력하시오

		int res = 0;
		for (int i = 1; i < 101; i++) {
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
