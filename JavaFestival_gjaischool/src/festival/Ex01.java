package festival;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 정수 입력받아 10의자리 이하 버리는 코드 작성하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>");
		int num = sc.nextInt();
		
		System.out.println("결과 : " + num/10 * 10);
		
	}

}
