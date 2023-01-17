package ex연산자;

public class Ex08삼항연산자 {
	public static void main(String[] args) {
		
		// 삼항 연산자 ===> ? :
		// (조건식) ? 조선식이 true일 때 실행시킬 코드 : 조건식이 false일 때 실행시킬 코드
		// 조건식 : 결과값 boolean으로 돌려줘야 함
		
		// 짝/홀수인지 판단해 주는 삼항 연산자
		int num = 45;
		String res = num % 2 ==0 ? "짝수" : "홀수";
		System.out.println(res);
		
	}

}
