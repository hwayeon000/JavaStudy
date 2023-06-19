package 다중if문;

import java.util.Scanner;

public class Ex02다중if문 {
	public static void main(String[] args) {
		
		// 명소 추천
		// 가고싶은 도시 입력시 그 도시의 명소 추천
		// 부산 -> 해운대
		// 뉴욕 -> 자유의 여신상
		// 파리 -> 에펠탑
		// 광주 -> 광주포차
		// 서울 -> 롯데타워
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아래의 도시 중 하나를 입력해주세요.");
		System.out.print("부산, 뉴욕, 파리, 광주, 서울 >> ");
		String city = sc.next();
		String res = "";
				
		System.out.println("입력한 도시 : " + city);
		
		// 문자열끼리 같은지 비교하기 위해서는 .equals("비교값")를 사용
		if (city.equals("부산")) {
			res = "젊음이 넘치는 해운대 추천합니다!";
		} else if (city.equals("뉴욕")) {
			res = "웅장함이 느껴지는 자유의 여신상 어때요?";
		} else if (city.equals("파리")) {
			res = "세계적으로 유명한 에펠탑은 꼭 방문하세요!";
		} else if (city.equals("광주")) {
			res = "낭만있게 한잔 할 수 있는 광주 포차 어때요?";
		} else if (city.equals("서울")) {
			res = "높고 거대한 롯데 타워로 오세요~.";
		} else {
			res = "아직 그 도시의 명소는 알지못하겠어요../(ㄒoㄒ)/~~";
		}
		
		System.out.println(res);
		
		
	}

}
