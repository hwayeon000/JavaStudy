import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.Timer;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Timer m = new Timer();

//		int[][] arr = new int[5][5];
//		int cnt = 1;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = cnt;
//				cnt++;
//				System.out.print(arr[i][j] + "\t");
//			}System.out.println();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print("□" + " ");
//			}System.out.println();
//		}

//		System.out.println();
		
		// 10 배열 박쥐
//		int num = 10;
//		String ans = "0100000010,1101001011,1001111001,1101111011,1110110111,1111111111,1101111011,1000110001,1100110011,0110110110";
//		int[][] res = new int[num][num];
//		String[] arr = ans.split(",");
//
//		for (int i = 0; i < res.length; i++) {
//			String[] arr3 = arr[i].split("");
//			for (int j = 0; j < arr.length; j++) {
//				res[i][j] = Integer.parseInt(arr3[j]);
//				System.out.print(res[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res.length; j++) {
//				if (res[i][j] == 1) {
//					System.out.print("■" + " ");
//				} else {
//					System.out.print("□" + " ");
//				}
//			}
//			System.out.println();
//		}
		//----------------------------------------------------------
		char[][] res = { { 'o', 'x', 'x', 'x', 'o' }, { 'o', 'o', 'o', 'x', 'o' }, { 'o', 'x', 'o', 'x', 'o' },
				{ 'o', 'x', 'x', 'x', 'o' }, { 'o', 'o', 'o', 'o', 'o' } };

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if (res[i][j] == 'o') {
					System.out.print("■" + " ");
				} else {
					System.out.print("□" + " ");
				}
			}
			System.out.println();
		}

		//  가로 힌트 출력문
//		int cntNum = 0;
//		int num = 5;
//		String[] hintArr = {"","","","",""};
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < hintArr.length; j++) {
//				if (res[i][j] == 'o') {
//					cntNum++;
//					if (j == num-1 && res[i][num-1]=='o') {
//						hintArr[i] += cntNum;
//					}
//				} else if (res[i][j] == 'x') {
//					if(cntNum!=0) {
//						hintArr[i] += cntNum;
//					}
//					cntNum = 0;
//				}
//				
//			} cntNum = 0;
//		}
//
//		for (int i = 0; i < hintArr.length; i++) {
//			System.out.print(hintArr[i] + " ");
//		}
//
//		System.out.println();

		// 세로 힌드 출력문
		int cntNum = 0;
		int num = 5;
		String[] hintArr = {"","","","",""};
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < hintArr.length; j++) {
				if (res[j][i] == 'o') {
					cntNum++;
					if (j == num-1 && res[j][i]=='o') {
						hintArr[i] += cntNum;
					}
				} else if (res[j][i] == 'x') {
					if(cntNum!=0) {
						hintArr[i] += cntNum + ",";
					}
					cntNum = 0;
				}
				
			} cntNum = 0;
		}

//		String[] hintY = hintArr[0].split(",");
//		String[] hintY = hintArr[1].split(",");
//		String[] hintY = hintArr[2].split(",");
//		String[] hintY = hintArr[3].split(",");
//		String[] hintY = hintArr[4].split(",");
//		for (int i = 0; i < hintY.length; i++) {
//			System.out.print(hintY[i]);
//		}
		
//		System.out.println(hintArr[1] + " ");
		for (int i = 0; i < hintArr.length; i++) {
			System.out.println(hintArr[i] + " ");
		}

//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res.length; j++) {
//				if (res[i][j] == 'o') {
//					System.out.print("■" + " ");
//				} else {
//					System.out.print("□" + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		int cntNum = 0;
//		String printN = "";
//		String[] resN = new String[res.length];

//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res.length; j++) {
//				if (res[i][j] == 'o') {
//					cntNum += 1;
//					printN += cntNum;
//				} else {
//					cntNum = 0;
//					printN += cntNum;
//				}
//			}
//			resN[i] = printN;
//			printN = "";
//			cntNum = 0;
//		}
//
//		for (int i = 0; i < resN.length; i++) {
//			resN[i] = resN[i].replace("0", "");
//			String[] a = resN[i].split("");
//			for (int j = 0; j < a.length; j++) {
//				System.out.print(a[j] + " ");
//			}
//			System.out.println();
//		}


		// String를 String 이차원 배열롤 변경
//		String ans = "o,x,x,x,o/o,o,o,x,o/o,x,o,x,o/o,x,x,x,o/o,o,o,o,o";
//		String[] arr2 = ans.split("/");
//		
//		System.out.println("arr2");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
//		
//		
//		String[][] arr4 = new String[5][5];
//		
//		System.out.println("arr3");
//		for (int i = 0; i < arr4.length; i++) {
//			String[] arr3 = arr2[i].split(",");
//			for (int j = 0; j < arr2.length; j++) {
//				arr4[i][j] = arr3[j];				
//				System.out.print(arr4[i][j] + " ");
//			}System.out.println();
//		}

		// String를 int 이차원 배여롤 변경
//		String ans = "10001,11101,10101,10001,11111";
//		String[] arr2 = ans.split(",");
//		
//		System.out.println("arr2");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
//		
//		
//		int[][] arr4 = new int[5][5];
//		
//		System.out.println("arr3");
//		for (int i = 0; i < arr4.length; i++) {
//			String[] arr3 = arr2[i].split("");
//			for (int j = 0; j < arr2.length; j++) {
//				arr4[i][j] = Integer.parseInt(arr3[j]);				
//				System.out.print(arr4[i][j] + " ");
//			}System.out.println();
//		}

		

//		System.out.println("줄바꿈 확인");
//		System.out.println("1\n3");
		

		
		
		Scanner sc = new Scanner(System.in);
		int row = 1;
		boolean isCheck = false;
		String[] nums = { "①", "②", "③", "④", "⑤" };
		
		// 게임 시작
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("ː   ① 회원가입  ② 로그인  ③ 종료     ː ");
			System.out.println("-------------------------------------------\n");
			int choice = sc.nextInt();
			
			if (choice == 1) { // 회원가입 
				System.out.println("---------------회원가입------------");
				System.out.print("횐 가입 체크 : ");
				String id = sc.next();

				System.out.println("---------------------------------\n");

			} else if (choice == 2 && !isCheck) {
				System.out.println("---------------로그인-------------");
				// 로그인
				System.out.print("로긴 체크 : ");
				String pw = sc.next();
				
				if (pw.equals("성공")) {
					isCheck = true;
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
					System.out.println();
					System.out.println("-------------난이도선택------------");
					System.out.println("ː   ① 5X5    ② 10X10   ③ 로그아웃  ː ");
					System.out.println("---------------------------------\n");
					int level_choice = sc.nextInt();
					if (level_choice == 1) {
						System.out.println("5 x 5");
						System.out.println();
						System.out.println("게임을 선택하세요.");
						System.out.println("1번 2번 3번 .....");
					} else if (level_choice == 2) {
						System.out.println("10 x 10");
					} else if (level_choice == 3) {
						System.out.println("로그아웃 되었습니다.");
						isCheck = false;
						row = 0;
					} else {
						System.out.println("번호를 확인하세요~.");
						continue;
					}
					
					System.out.println("플레이할 그림을 선택하세요");
					// 고민중
				}

			} else if (choice == 3) {
				System.out.println("-------------게임을 종료합니다------------");
//				player.stop();
				isCheck = false;
				break;
			} else {
				System.out.println("올바른 숫자를 입력해주세요");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[][] ans = { { 1, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
//		printResult(ans);
		printQuestion(ans);

		
	}
	

	public static void printQuestion(int[][] ans) {
		// x hint
		String[] hintArrX = getHintArrX(ans);
		// y hint
		String[] hintArrY = getHintArrY(ans);

		int hintZone = (ans.length + 1) / 2;
		int entireZone = (ans.length + 1) / 2 + ans.length;
		int len = (ans.length+1)/2;
		
		for(int i = 0; i < entireZone; i++) {
			for(int j = 0; j < entireZone; j++) {
				if (i < hintZone && j < hintZone) {
					System.out.print("  ");
				} else if(i >= hintZone && j >= hintZone){
					System.out.print("□" + " ");
//					System.out.print((i - len) + ":" + (j-len));
				} else {
//					System.out.print("■" + " ");
//					System.out.print(i +":"+j);
					if (i < len) {
						String[] a = hintArrY[j-3].split("");
						if (a.length > i ) {
							System.out.print(a[i] + " ");
						}else {
							System.out.print("  ");
						}
					}else {
//						System.out.print("■" + " ");
//						System.out.print(hintArrX[i-3]);
						String[] a = hintArrX[i-3].split("");
						if (a.length > j ) {
							System.out.print(a[j] + " ");
						}else {
							System.out.print("  ");
						}
					}
					
				}
			} System.out.println();
		}
		
		
	}

	public static String[] getHintArrX(int[][] ans) {

		int cntNumX = 0;
		int numX = 5;
		String[] hintArrX = { "", "", "", "", "" };
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < hintArrX.length; j++) {
				if (ans[i][j] == 1) {
					cntNumX++;
					if (j == numX - 1 && ans[i][numX - 1] == 1) {
						hintArrX[i] += cntNumX;
					}
				} else if (ans[i][j] == 0) {
					if (cntNumX != 0) {
						hintArrX[i] += cntNumX;
					}
					cntNumX = 0;
				}

			}
			cntNumX = 0;
		}

		return hintArrX;
	}

	public static String[] getHintArrY(int[][] ans) {
		
		int cntNumY = 0;
		int numY = 5;
		String[] hintArrY = { "", "", "", "", "" };
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < hintArrY.length; j++) {
				if (ans[j][i] == 1) {
					cntNumY++;
					if (j == numY - 1 && ans[j][i] == 1) {
						hintArrY[i] += cntNumY;
					}
				} else if (ans[j][i] == 0) {
					if (cntNumY != 0) {
						hintArrY[i] += cntNumY;
					}
					cntNumY = 0;
				}

			}
			cntNumY = 0;
		}
		
		return hintArrY;
	
	
	}
	
	public static void printResult(int[][] res) {

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length * 2; j++) {
				if (res[i][j / 2] == 1) {
					System.out.print("▒");
				} else {
					if (j % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print("|");
					}
				}
			}
			System.out.println();
		}
	}


}
