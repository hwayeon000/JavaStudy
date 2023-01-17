package 배열;

import java.util.Random;

public class Ex00랜덤수가져오기 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		
		// 랜덤 수 가져오기
		int rdNum = rd.nextInt();
		
		// 범위 지정, 0 ~ 9까지
		// 시작수, 끝-1
		int num = rd.nextInt(1, 10);
		
		System.out.println(rdNum + ", " + num);
		
	}

}
