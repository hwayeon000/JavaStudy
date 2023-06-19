package ex04;

import java.util.Random;

public class Ex04로또뽑기 {
	public static void main(String[] args) {
//		중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
		Random rd = new Random();
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = rd.nextInt(1,46);
			lotto[i] = rd.nextInt(46) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j]==lotto[i]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}
		
		
	}
	

}
