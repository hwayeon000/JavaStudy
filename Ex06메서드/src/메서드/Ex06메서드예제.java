package 메서드;

public class Ex06메서드예제 {
	public static void main(String[] args) {
		
		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
	
		// 총 4개의 메서드를 만들어야 함
		// add, sub, mul, div --> 출력하는 기능
		// 기능을 돌려줌 ---> void (기능)
		// 전달인자 숫자 2개 ---> int
		// 메서드 명 == 호출명
		
		
	}
	
	// 메인 밖에서 메서드 만들기
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a - b);
	}
	
	public static void mul(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void div(int a, int b) {
		System.out.println(a / b);
	}

}
