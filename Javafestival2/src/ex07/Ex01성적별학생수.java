package ex07;

public class Ex01성적별학생수 {
	public static void main(String[] args) {
//		학생들의 성적정보가 문자열로  
//		선언되어 있을 때 각 성적 별 학생 수를 출력
		
//		String score = "A,A,B,C,D,A,C,D,D,D,F";
//		
//		String[] arr = score.split(",");
//		String[] scores = {"A", "B", "C", "D", "F"};
//		int[] total = {0, 0, 0, 0, 0};
//
//		for (int i = 0; i < arr.length; i++) {
//			switch (arr[i]) {
//			case "A":
//				total[0] += 1;
//				break;
//			case "B":
//				total[1] += 1;
//				break;
//			case "C":
//				total[2] += 1;
//				break;
//			case "D":
//				total[3] += 1;
//				break;
//			case "F":
//				total[4] += 1;
//				break;
//			default:
//				break;
//			}
//		}
//		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i] + " : " + total[i] + "명");
//		}
		
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
//		score = score.replace(",", "");
		char[] arr = score.toCharArray();
		
		char[] munja = {'A','B','C','D','F'};
		int[] count = new int[munja.length];
		
		for (int i = 0; i < munja.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (munja[i]==arr[j]) {
					count[i]++;
				}
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(munja[i] + " : " + count[i] + "명");
		}
		
	}

}
