package ex06;

public class Ex03cal메소드 {
	public static void main(String[] args) {
		/* num1, num2, op (+, -, *, /) 를 매개변수로
		받아 num1과 num2를 op에 맞게 연산한
		결과값을 반환해주는 cal 메소드 만들기 */
		int num1 = 50;
		int num2 = 15;
		char op ='-';
		System.out.println(cal(num1, num2, op));
		
		num1 = 50;
		num2 = 15;
		op = '*';
		System.out.println(cal(num1, num2, op));		
		
	}
	
	public static int cal(int a, int b, char op) {
		
		if (op == '+') {
			return a + b;
		} else if (op == '-') {
			return a - b;
		} else if (op == '*') {
			return a * b;
		} else if (op == '/') {
			return a / b;
		} else {
			return 0 ;
		}
		
	}

}
