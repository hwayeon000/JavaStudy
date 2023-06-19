package ex변수;

public class Ex03형변환 {

	public static void main(String[] args) {
		
		// 형변환 (cast)
		
		// 1. 명시적 형변환 ( 강제 형변환 )
		float pie = 3.14f;
		// 큰 데이터 자료형 -> 작은 데이터 자료형 강제 형변환
		// 데이터 손실이 있울 수 있기 때문에 정확히 명시하는 형변환
		
		// 2. 자동 형변환 ( 묵시적 형변환 )
		// 작은 데이터 자료형 -> 큰데이터 자료형 변환
		double pie2 = pie;  // pie: float 자료형을 가진 변수
		
		
		// 상수 ( constant )
		// final 자료형 변수명 = 저장할 값;
		final int birth = 818;
		// birth = 629; -> 에러 발생
		// 재할당 불가
		// 한 번 초기화 해 놓으면 뒷쪽에서 변경 불가능한 변수
		
		
		
		
		
		
	}

}
