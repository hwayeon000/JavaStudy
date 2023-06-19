package ex변수;

public class Ex01변수개요 {

	public static void main(String[] args) {
		// 주석 : 코드를 설명하기 위해 글자를 적는 것
		// 컴퓨터는 주석안에 작성된 글자는 컴파일하지 않고 무시하고 넘어간다
		
		/* 여러줄의 주석처리
		 * 컴파일 : 사람이 적은 소스코드를 컴퓨터가 이해할 수 있는
		 * 언어로(Bite Code)로 변환하는 작업
		 * Java의 실행과정
		 * Ex01변수개요.java -> Ex01변수개요.class -> JVM -> 실행 */ 
		System.out.println("환상의 나라로 오세요~!! ╰(*°▽°*)╯");
		
		// 변수 -> 데이터를 임시적으로 저장하는 공간
		// 정수를 담을 수 있는 num 변수 만들고 100의 값 담기
		
		//변수의 특징
		// 1. 변수는 동일한 이름의 변수를 여러개 만들 수 없다
		// 2. 변수안에 새로운 데이터가 들어가는 순간 이전의 데이터는 사라짐
		
		int num;  // 정수형 변수 num 선언
		num = 100;  // num 변수 안에 100 담기
		
		int numm = 200;  // 선언 및 초가화 동시 처리

		System.out.println(num);
		num = 50;
		System.out.println(num);

		
		// 치환 문제. 나의 나이와 부모님의 나이를 바꿔주세요.
		int age1 = 20;
		int age2 = 62;
		
		// 변경 코드
		int temp = age1;
		age1 = age2;
		age2 = temp;
		
		System.out.println("나의 나이 : " + age1);
		System.out.println("부모님의 나이 : " + age2);
		
		
		
	}
}
