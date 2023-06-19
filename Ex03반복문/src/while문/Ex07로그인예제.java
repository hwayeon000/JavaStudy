package while문;

import java.util.Scanner;

public class Ex07로그인예제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userId = "hello";
		int userPw = 1234;

		String id = "";
		int pw = 0;
				
//		while(!(id.equals(userId)) || pw != userPw) {
//			System.out.print("아이디를 입력해주세요 >> ");
//			id = sc.next();
//			System.out.print("비밀번호를 입력해주세요 >> ");
//			pw = sc.nextInt();
//			
//			if (id.equals(userId)) {
//				if (pw == userPw) {
//					System.out.println("로그인 성공!");
//				}else {
//					System.out.println("비밀번호를 확인해 주세요.");
//				}
//			}else {
//				System.out.println("아이디를 확인해 주세요.");
//			}
//		}
		
//		while(!(id.equals(userId)) || pw != userPw) {
//			System.out.print("아이디를 입력해주세요 >> ");
//			id = sc.next();
//			System.out.print("비밀번호를 입력해주세요 >> ");
//			pw = sc.nextInt();
//			
//			if (id.equals(userId) && pw == userPw) {
//				System.out.println("로그인 성공!");
//			}else {
//				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
//			}
//		}
		
		int check = 0;
		while(true) {
			check++;
			System.out.print("아이디를 입력해주세요 >> ");
			id = sc.next();
			System.out.print("비밀번호를 입력해주세요 >> ");
			pw = sc.nextInt();
			
			if (id.equals(userId) && pw == userPw) {
				System.out.println("로그인 성공!");
				break;
			} else if (check == 3) {
				System.out.println("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요.");
				break;
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				System.out.print("계속 하시겠습니까? (Y/N) >>");
				String choice = sc.next();
				if (choice.equals("Y")) {
					continue;
				}else {
					break;
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
