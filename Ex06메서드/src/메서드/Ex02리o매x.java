package 메서드;

public class Ex02리o매x {
	public static void main(String[] args) {
		// 리턴타입 있고 매개변수 있는
		// add라는 매서드 만들기
		add(1,2); // 출력 기능 없음 그냥 값만 받아옴
		System.out.println(add(1,2));
		
		
	}
	
	// 숫자 두개를 더한 결과값을 돌려주는 메서드
	public static int add(int a, int b) {
		return a + b;
	}
	

}
