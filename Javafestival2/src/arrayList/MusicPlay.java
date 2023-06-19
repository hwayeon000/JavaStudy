package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 노래 제목이 저장되는 ArrayList music 만들기
		ArrayList<String> musicList = new ArrayList<>();
		//삽입
		musicList.add("Maria");
		musicList.add("HowYouLikeThat");
		musicList.add("깡");
		musicList.add("살짝설렜어");

		int playList = 0;
		String musicName;
		int select = 0;

		while (true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				playList(musicList);
			}

			else if (menu == 2) {
				playList(musicList);
				if (musicList.size() > 0) {
					System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
					playList = sc.nextInt();
					System.out.print("추가할 노래 입력 >> ");
					musicName = sc.next();
					if (playList == 1) {
						musicList.add(musicName);
						System.out.println("추가가 완료되었습니다.");
					}
					else if (playList == 2) {
						System.out.print("추가할 위치 입력 >> ");
						playList = sc.nextInt();
						musicList.add(playList - 1, musicName);
						System.out.println("추가가 완료되었습니다.");
					}else{
						System.out.println("번호를 확인해 주세요.");
					}
				}

			}

			else if (menu == 3) {
				playList(musicList);
				
				if (musicList.size() > 0) {
					System.out.print("[1]선택삭제 [2] 전체삭제 >> ");
					select = sc.nextInt();

					if (select == 1) {
						System.out.print("삭제할 노래 선택 >> ");
						select = sc.nextInt();
						musicList.remove(select - 1);
						System.out.println("노래가 삭제되었습니다.");
					} else if (select == 2) {
						musicList.clear();
						System.out.println("전체삭제 되었습니다.");
					}else{
						System.out.println("번호를 확인해 주세요.");
					}
				}

			} else if (menu == 4) {

				System.out.println("프로그램을 종료합니다");
				break;
			}

			else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
		
	}

	public static void playList(ArrayList<String> musicList) {
		System.out.println("========현재 재생 목록========");
		if (musicList.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musicList.size(); i++) {
				System.out.println((i + 1) + ".  " + musicList.get(i));
			}
		}
		System.out.println("===========================");
	}
		
}


