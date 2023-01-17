package festival;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
//		1차원 배열을 이용하여 다음과 같이
//		학생의 점수를 입력받아 
//		총점과 평균을 저장하고 출력하시오.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		System.out.print("Java 입력 : ");
		arr[0] = sc.nextInt();
		System.out.print("Web 입력 : ");
		arr[1] = sc.nextInt();		
		System.out.print("Android 입력 : ");
		arr[2] = sc.nextInt();
		
		System.out.println("java : " + arr[0]);
		System.out.println("web : " + arr[1]);
		System.out.println("and : " + arr[2]);
		System.out.println("total : " + (arr[0] + arr[1] + arr[2]));
		System.out.println("avg : " + (arr[0] + arr[1] + arr[2])/3);
		
	}
}
