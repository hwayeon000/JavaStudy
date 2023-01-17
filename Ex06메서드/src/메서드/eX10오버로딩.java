package 메서드;

public class eX10오버로딩 {
	public static void main(String[] args) {
		
		// 오버로딩 (overloading) : 중복정의
		// : 매개변수의 형태가 다르면 메서드는 같은 이름으로 사용 할 수 있음
		// 매개변수의 형태란 --> 갯수, 데이터 타입
		sum(2,3);
		sum(5,6,4);
		
		// 더한 결과값을 돌려주는 기능은 같음
		// 같은 이름 -> 매개변수의 갯수나 데이터 타입 변경
		
		
	}
	
	// 숫자 두개를 더해주는 sum
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	// 숫자 세개 더하는 sum
	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
