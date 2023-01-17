package ex연산자;

import java.util.Scanner;
// java.util.Scanner -> 경로
// import 작업을 꼭 해줘야 현재 클래스에서 기능을 사용 할 수 있음

public class Ex00입력도구 {
	public static void main(String[] args) {
		
		// 입력하는 도구 가져오는 방법
		// ctrl + shift + o -> 자동 import
		
		// System.out ---> Console창에 보여주는 것
		// System.in ---> Console창에 입력하는 것
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력할 수 있는 코드
		System.out.print("문자열 입력 -> ");
		String name = sc.next();
		
		// 정수 입력
		System.out.print("숫자 정수 입력 -> ");
		int num = sc.nextInt();
		
		System.out.println("문자열 : " + name + "\n정수 : " + num);
		
		
		
		
		
	}

}
