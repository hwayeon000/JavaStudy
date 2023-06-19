package ex06;

public class Ex02isDivide {
	public static void main(String[] args) {
//		두 개의 정수를 매개변수로 받아 앞의 정수가 
//		뒤의 정수로 나누어지는지를 판별하는 메소드 
//		isDivide( ) 를 작성, 나누어지면 true 아니면 false
		int num1 = 10;
		int num2 = 3;
		boolean res = isDivide(num1, num2);
		System.out.println(res);
			
	}
	
	public static boolean isDivide(int a, int b) {
		return a % b == 0;
	}


}
