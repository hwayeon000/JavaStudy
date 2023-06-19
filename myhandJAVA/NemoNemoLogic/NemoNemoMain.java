package NemoNemoLogic;

import java.util.Scanner;
import controller.GameQuestion;

public class NemoNemoMain {

	public static void main(String[] args) {
		Controller ct = new Controller();
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
		// level choice로 돌아가기 위한 변수
		int row = 1;
		// login check
		boolean isCheck = false;
		// 레벨에 따른 게임 그림 선택 번호
		int selectGameLevel = 0;
		String userNick = ct.getUserNick();
		
		
		// 게임 시작
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("ː   ① 회원가입  ② 로그인  ③ 종료     ː ");
			System.out.println("-------------------------------------------\n");
			int mainChoice = sc.nextInt();
			
			if (mainChoice == 1) { // 회원가입 
				System.out.println("---------------회원가입------------");
				System.out.print("아이디를 입력해주세요 : ");
				String id = sc.next();
				System.out.print("비밀번호를 입력해주세요 : ");
				String pw = sc.next();
				System.out.print("닉네임을 입력해주세요 : ");
				String nick = sc.next();
				DTO dto = new DTO(id,pw,nick);
				ct.join(dto);
				System.out.println("---------------------------------\n");

			} else if (mainChoice == 2 && !isCheck) {
				System.out.println("---------------로그인-------------");
				// 로그인
				System.out.print("아이디를 입력해주세요 : ");
				String id = sc.next();
				System.out.print("비밀번호를 입력해주세요 : ");
				String pw = sc.next(); 
				System.out.println("---------------------------------\n");
				DTO dto = new DTO(id, pw);
				isCheck = ct.login(dto);
				
				if (isCheck) {
					row = 1;
					System.out.println("---------------------------------\n");
					System.out.println();
					System.out.println("=============================================");
					System.out.println("ː            네모네모 로직 게임 설명             ː");
					System.out.println("ː                                          ː");
					System.out.println("ː   1. 쓰인 숫자만큼 연속된 칸을 칠할것 !          ː");
					System.out.println("ː   2. 숫자와 숫자 사이에는 최소한 한 칸을 비울 것 ! ː");
					System.out.println("ː   3. 숫자의 순서와 칠해진 칸의 순서가 일치할 것 !  ː");
					System.out.println("=============================================\n");
					System.out.println();
				}
				
				if (isCheck && row > 0) {
					// 게임 레벨 선택
					int selectGameNumber = 0;
					while (selectGameLevel > -2) {
						System.out.println();
						System.out.println("----------------난이도선택----------------");
						System.out.println("ː     ① 5X5     ② 10X10    ③ 로그아웃    ː ");
//						System.out.println("---------------------------------------\n");
						System.out.println("--------------------- 번호 선택 >>");
						// 게임 레벨 선택
						int level_choice = sc.nextInt();
						selectGameLevel = GameQuestion.levelChoice(level_choice);
						
						if (selectGameLevel > 0) {
							selectGameNumber = gameSelect(selectGameLevel);
							
							// 게임 선택
							GameQuestion.gameLankCheckAndAnswer(selectGameNumber);
							System.out.println("요기");
							
							
							
							
						}
						
						
					}
					// -2 : 로그아웃
					if (selectGameNumber == -2) {
						isCheck = false;
						row = 0;
						System.out.println("체크");
					} else {
						break;
					}
					

					
					System.out.println("플레이할 그림을 선택하세요");
					// 고민중
				}

			} else if (mainChoice == 3) {
				System.out.println("-------------게임을 종료합니다------------");
				isCheck = false;
				player.stop();
				break;
			} else {
				System.out.println("올바른 숫자를 입력해주세요");
			}
			
		}
		
		
	}
	
		
	

	// sleep 1초
	public static void sleep() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	// welcome
	public static void welcome() {

		
		System.out.println("                          ,--,                                ____                                       \n"
				+ "                        ,--.'|                              ,'  , `.                                     \n"
				+ "         .---.          |  | :               ,---.       ,-+-,.' _ |                                     \n"
				+ "        /. ./|          :  : '              '   ,'\\   ,-+-. ;   , ||                                     \n"
				+ "     .-'-. ' |   ,---.  |  ' |      ,---.  /   /   | ,--.'|'   |  || ,---.                               \n"
				+ "    /___/ \\: |  /     \\ '  | |     /     \\.   ; ,. :|   |  ,', |  |,/     \\                              \n"
				+ " .-'.. '   ' . /    /  ||  | :    /    / ''   | |: :|   | /  | |--'/    /  |                             \n"
				+ "/___/ \\:     '.    ' / |'  : |__ .    ' / '   | .; :|   : |  | ,  .    ' / |                             \n"
				+ ".   \\  ' .\\   '   ;   /||  | '.'|'   ; :__|   :    ||   : |  |/   '   ;   /|                             \n"
				+ " \\   \\   ' \\ |'   |  / |;  :    ;'   | '.'|\\   \\  / |   | |`-'    '   |  / |                             \n"
				+ "  \\   \\  |--\" |   :    ||  ,   / |   :    : `----'  |   ;/        |   :    |                             \n"
				+ "   \\   \\ |     \\   \\  /  ---`-'   \\   \\  /          '---'          \\   \\  /                              \n"
				+ "    '---\"       `----'             `----'                           `----'                            ");
		
		sleep();
		System.out.println();
		System.out.println("                 ,--.                                            ,--.                                    \n"
				+ "               ,--.'|                   ____                   ,--.'|                   ____             \n"
				+ "           ,--,:  : |                 ,'  , `.             ,--,:  : |                 ,'  , `.           \n"
				+ "        ,`--.'`|  ' :              ,-+-,.' _ |   ,---.  ,`--.'`|  ' :              ,-+-,.' _ |   ,---.   \n"
				+ "        |   :  :  | |           ,-+-. ;   , ||  '   ,'\\ |   :  :  | |           ,-+-. ;   , ||  '   ,'\\  \n"
				+ "        :   |   \\ | :   ,---.  ,--.'|'   |  || /   /   |:   |   \\ | :   ,---.  ,--.'|'   |  || /   /   | \n"
				+ "        |   : '  '; |  /     \\|   |  ,', |  |,.   ; ,. :|   : '  '; |  /     \\|   |  ,', |  |,.   ; ,. : \n"
				+ "        '   ' ;.    ; /    /  |   | /  | |--' '   | |: :'   ' ;.    ; /    /  |   | /  | |--' '   | |: : \n"
				+ "        |   | | \\   |.    ' / |   : |  | ,    '   | .; :|   | | \\   |.    ' / |   : |  | ,    '   | .; : \n"
				+ "        '   : |  ; .''   ;   /|   : |  |/     |   :    |'   : |  ; .''   ;   /|   : |  |/     |   :    | \n"
				+ "        |   | '`--'  '   |  / |   | |`-'       \\   \\  / |   | '`--'  '   |  / |   | |`-'       \\   \\  /  \n"
				+ "        '   : |      |   :    |   ;/            `----'  '   : |      |   :    |   ;/            `----'   \n"
				+ "        ;   |.'       \\   \\  /'---'                     ;   |.'       \\   \\  /'---'                      \n"
				+ "        '---'          `----'                           '---'          `----'                            ");
		sleep();
		System.out.println();
		System.out.println("                 ,--,                                                                                   \n"
				+ "               ,---.'|                                                                                   \n"
				+ "               |   | :                                                                                   \n"
				+ "               :   : |                          ,--,                                                     \n"
				+ "               |   ' :      ,---.             ,--.'|                                                     \n"
				+ "               ;   ; '     '   ,'\\   ,----._,.|  |,                                                      \n"
				+ "               '   | |__  /   /   | /   /  ' /`--'_       ,---.                                          \n"
				+ "               |   | :.'|.   ; ,. :|   :     |,' ,'|     /     \\                                         \n"
				+ "               '   :    ;'   | |: :|   | .\\  .'  | |    /    / '                                         \n"
				+ "               |   |  ./ '   | .; :.   ; ';  ||  | :   .    ' /                                          \n"
				+ "               ;   : ;   |   :    |'   .   . |'  : |__ '   ; :__                                         \n"
				+ "               |   ,/     \\   \\  /  `---`-'| ||  | '.'|'   | '.'|                                        \n"
				+ "               '---'       `----'   .'__/\\_: |;  :    ;|   :    :                                        \n"
				+ "                                    |   :    :|  ,   /  \\   \\  /                                         \n"
				+ "                                     \\   \\  /  ---`-'    `----'                                          \n"
				+ "                                      `--`-'                                                ");
		sleep();
		System.out.println();
		
	}
	
	// 게임 선택
	public static int gameSelect(int selectGameLevel) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int user_choice = 0;
		
		System.out.println();
		while (result == 0) {
			for (int i = 0; i < selectGameLevel; i++) {
				System.out.print("[" + (i + 1) + "]\t");
				if ((i + 1) % 5 == 0) System.out.println();
			}
			System.out.println();
			System.out.println("---------------------------------\n");
			System.out.println("게임을 선택해 주세요 ( •̀ ω •́ )✧");
			System.out.println("---------------------------------\n");
			user_choice = sc.nextInt();
			if (user_choice > selectGameLevel + 1 || user_choice < 0) {
				System.out.println("번호 확인");
			} else {
				result = user_choice;
			}
		}
		
		return result;
		
		}
	
	public static int rankCheckOrReplay() {
		Scanner sc = new Scanner(System.in);
		int rankOrReplay = 0;
		while (true) {
			System.out.println("--------이미 플레이한 그림입니다--------");
			System.out.println("ː    ① 랭킹보기       ② 다시하기      ː ");
			System.out.println("----------------------------------\n");
			rankOrReplay = sc.nextInt();
			if (rankOrReplay == 1 || rankOrReplay == 2) {
				return rankOrReplay;
			}
		}
	}
	
	// 코인 차감 후 목숨
	public static int lifeChance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("ː         ♡ 목숨이 0이 되었어요!                ː");
		System.out.println("ː    목숨을 구입해서 계속 플레이 하시겠습니까?       ː");
		System.out.println("ː ① 네! 계속할래요  ② 아니요 ㅠㅠ 포기하겠습니다     ː");
		System.out.println("=============================================\n");
		int yesOrNo = sc.nextInt();
		return yesOrNo;
	}
	
}
