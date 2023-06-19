package 메서드;

public class Ex08메서드예제3 {
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op ='-';
		System.out.println(cal(num1, num2, op));
		
		num1 = 50;
		num2 = 15;
		op = '*';
		System.out.println(cal(num1, num2, op));
		
		// cal : 기능x, 데이터 값을 가져오는 메서드
		// 숫자랑 숫자 연산 결과값을 받아오는 중 ---> int : 리턴타입
		// cal(int, int, char) : 매개변수
	}

	public static int cal(int num1, int num2, char op) {
		
		// 받아온 op 연간 결과값이 달라짐
		// '-' num1 - num2
		// '*' num1 * num2
		// 리턴타입 int ---> return
		
		// 판단 ---> 조건식
		return (op == '*') ? num1 * num2 : num1 - num2 ;
	}
	
}
