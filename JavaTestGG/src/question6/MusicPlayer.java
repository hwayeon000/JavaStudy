package question6;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MusicController mc = new MusicController();
		
		while (true) {
			System.out.println("====뮤직플레이어====");
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();
				mc.musicList(title, singer, playTime);
				
			} else if (choice == 2) {
				System.out.println();
				mc.musicListShow();
				System.out.println();
				
			} else if (choice == 3) {
				// 노래 실행
				System.out.println();
				mc.musicOneShow();
				System.out.println();
				
			} else if (choice == 4) {
				// 이전곡
				System.out.println();
				mc.preMusic();
				System.out.println();
				
			} else if (choice == 5) {
				// 다음곡
				System.out.println();
				mc.nextMusic();
				System.out.println();
				
			} else if (choice == 6) {
				System.out.println();
				System.out.println("플레이어 종료");
				break;
			} else {
				System.out.println();
				System.out.println("번호확인");
				System.out.println();
			}

		}
		
	}


	
}
