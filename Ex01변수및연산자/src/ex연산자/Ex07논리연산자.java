package ex연산자;

public class Ex07논리연산자 {
	public static void main(String[] args) {
				
		System.out.println((2<3)||(4>5));
		// 논리 연산자에 사용되는 피연산자(항)은
		// 결과값으로 true/false 값을 가지고 있어야 한다.
		
		// 1) ! (NOT) : 부정 연산자
		// ! (피연산자)
		// !true ==> false
		// !false ==> true
		
		// 2) && : AND 연산자
		// 두 개의 항이 모두 true이면 결과값으로 true를 돌려주는 연산자
		// true && false ==> false
		// true && true ==> true
		
		// 3) || : OR 연산자
		// 두 개의 항 중에서 하나라도 true이면 결과값으로 true를 돌려주는 연산자
		// true || false ==> true
		// false || false ==> false
		
		// 논리연산자의 결과값은 boolean (true/false)
		
		
	}

}
