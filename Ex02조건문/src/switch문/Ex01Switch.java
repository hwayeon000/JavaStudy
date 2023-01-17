package switch문;

import java.util.Scanner;

public class Ex01Switch {
	public static void main(String[] args) {
		
		//switch(식){
		// 	   case 값1:
		//    case 값2:
		//}
		
		// switch로 숫자 홀빡 판별
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = "";
		
		switch (num % 2) {
		case 0:
			res = "짝수";
			break;
		case 1:
			res = "홀수";
			break;
		}
		
		System.out.println(res);
		
		
		
	}

}
