package NemoNemoLogic;

import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		Controller ct = new Controller();
		Scanner sc = new Scanner(System.in);
//		MusicPlayer player = new MusicPlayer();
//		MusicVO m = player.play(0); // 메인음악
		int row = 1;
		boolean isCheck = false;
		welcome();
		
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("ː   ① 회원가입  ② 로그인  ③ 종료     ː ");
			System.out.println("-------------------------------------------\n");
			int choice = sc.nextInt();
			
			if (choice == 1) { // 회원가입 
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

			}else if (choice == 2) {
				while(!isCheck) {
					System.out.println("---------------로그인-------------");
					// 로그인
					System.out.print("아이디를 입력해주세요 : ");
					String id = sc.next();
					System.out.print("비밀번호를 입력해주세요 : ");
					String pw = sc.next(); 
					System.out.println("---------------------------------\n");
					DTO dto = new DTO(id, pw);
					isCheck = ct.login(dto);
				}
				System.out.println("=============================================");
				System.out.println("ː            네모네모 로직 게임 설명             ː");
				System.out.println("ː                                          ː");
				System.out.println("ː   1. 쓰인 숫자만큼 연속된 칸을 칠할것 !          ː");
				System.out.println("ː   2. 숫자와 숫자 사이에는 최소한 한 칸을 비울 것 ! ː");
				System.out.println("ː   3. 숫자의 순서와 칠해진 칸의 순서가 일치할 것 !  ː");
				System.out.println("=============================================\n");
				while(row > 0) {
					sleep();
					System.out.println("-------------난이도선택------------");
					System.out.println("ː   ① 5X5    ② 10X10   ③ 로그아웃  ː ");
					System.out.println("---------------------------------\n");
					int level_choice = sc.nextInt();
					if(level_choice == 3) {
						System.out.println("로그아웃 되었습니다.");
						isCheck = false;
						break;
					} else if (level_choice > 3){
						System.out.println("번호를 확인하세요~.");
						continue;
					}

					System.out.println("플레이할 그림을 선택하세요");
					ct.levelChoice(level_choice);
					
					int game_select = sc.nextInt();
//					player.stop();
//					player.play(1); // 게임 플레이음악
					row = ct.gameChoice(game_select);
					if(row > 0) {
						continue;
					}else {
						isCheck = false;
					}
				}
			}else if (choice == 3) {
				System.out.println("-------------게임을 종료합니다------------");
				// 일단 멈춤
//				player.stop();
				break;
			}else {
				System.out.println("올바른 숫자를 입력해주세요");
			}
		}
	}
	
	// 구분선 출력
	public static void linePrint() {
		System.out.println("=======================================");
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
	
	
	
	
	// welcome
//		public static void welcome() {
//
//			System.out.println();
//			System.out.println("━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━");
//			System.out.println("                       ___                                           \n"
//					+ "                      /\\_ \\                                          \n"
//					+ "  __  __  __     __   \\//\\ \\      ___     ___     ___ ___       __   \n"
//					+ " /\\ \\/\\ \\/\\ \\  /'__`\\   \\ \\ \\    /'___\\  / __`\\ /' __` __`\\   /'__`\\ \n"
//					+ " \\ \\ \\_/ \\_/ \\/\\  __/    \\_\\ \\_ /\\ \\__/ /\\ \\L\\ \\/\\ \\/\\ \\/\\ \\ /\\  __/ \n"
//					+ "  \\ \\___x___/'\\ \\____\\   /\\____\\\\ \\____\\\\ \\____/\\ \\_\\ \\_\\ \\_\\\\ \\____\\\n"
//					+ "   \\/__//__/   \\/____/   \\/____/ \\/____/ \\/___/  \\/_/\\/_/\\/_/ \\/____/\n"
//					+ "                                                                     ");
//			System.out.println();
//			sleep();
//			System.out.println("\t __  __                                   __  __                                  \n"
//					+ "\t/\\ \\/\\ \\                                 /\\ \\/\\ \\                                 \n"
//					+ "\t\\ \\ `\\\\ \\      __     ___ ___      ___   \\ \\ `\\\\ \\      __     ___ ___      ___   \n"
//					+ "\t \\ \\ , ` \\   /'__`\\ /' __` __`\\   / __`\\  \\ \\ , ` \\   /'__`\\ /' __` __`\\   / __`\\ \n"
//					+ "\t  \\ \\ \\`\\ \\ /\\  __/ /\\ \\/\\ \\/\\ \\ /\\ \\L\\ \\  \\ \\ \\`\\ \\ /\\  __/ /\\ \\/\\ \\/\\ \\ /\\ \\L\\ \\\n"
//					+ "\t   \\ \\_\\ \\_\\\\ \\____\\\\ \\_\\ \\_\\ \\_\\\\ \\____/   \\ \\_\\ \\_\\\\ \\____\\\\ \\_\\ \\_\\ \\_\\\\ \\____/\n"
//					+ "\t    \\/_/\\/_/ \\/____/ \\/_/\\/_/\\/_/ \\/___/     \\/_/\\/_/ \\/____/ \\/_/\\/_/\\/_/ \\/___/ \n"
//					+ "");
//			System.out.println();
//			sleep();
//			System.out.println("\t\t\t           __                                                    \n"
//					+ "\t\t\t          /\\ \\                          __                       \n"
//					+ "\t\t\t          \\ \\ \\        ___      __     /\\_\\     ___              \n"
//					+ "\t\t\t           \\ \\ \\  __  / __`\\  /'_ `\\   \\/\\ \\   /'___\\            \n"
//					+ "\t\t\t            \\ \\ \\L\\ \\/\\ \\L\\ \\/\\ \\L\\ \\   \\ \\ \\ /\\ \\__/            \n"
//					+ "\t\t\t             \\ \\____/\\ \\____/\\ \\____ \\   \\ \\_\\\\ \\____\\           \n"
//					+ "\t\t\t              \\/___/  \\/___/  \\/___L\\ \\   \\/_/ \\/____/           \n"
//					+ "\t\t\t                                /\\____/                          \n"
//					+ "\t\t\t                                \\_/__/      ");
//			System.out.println();
//			System.out.println("━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━━━━━⊱⋆⊰━━━━");
//			sleep();
//			System.out.println();
//			
//			
//			System.out.println();
//			sleep();
//			
//		}
		
	// sleep 1초
	public static void sleep() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
