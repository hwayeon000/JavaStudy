package ex07;

import java.util.Scanner;

public class Ex03대시문자숫자합 {
	public static void main(String[] args) {
//		그림과 같이 대시(‘_’)문자로 구성된 형태의 숫자를  
//		주어진 숫자와 같이 출력하고 싶을때 사용되게 되는  
//		대시의 개수를 출력하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리0제외한숫자입력 : ");
		int num = sc.nextInt();
		
		int[] count = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		
		int res = 0;
		while (num > 0) {
			res += count[num % 10];
			num /= 10;
		}
		
		System.out.println("대시('-')의 총합 >> " + res);		
	}


}
