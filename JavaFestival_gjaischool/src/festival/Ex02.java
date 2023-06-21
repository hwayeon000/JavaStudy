package festival;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>");
		int num = sc.nextInt();
		
		System.out.println("반올림 전: " + num);
		System.out.println("반올림 후 : " + (num + 5)/10 * 10);
		
	}

}
