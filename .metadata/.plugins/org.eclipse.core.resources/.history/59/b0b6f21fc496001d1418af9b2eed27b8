package ex08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Java시험문제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("점수 입력 : ");
		String score = sc.next();
		
		String[] arr = score.split("");
		ArrayList<Integer> total = new ArrayList<>();
		
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("O")) {
				total.add(cnt);
				cnt++;
			} else if (arr[i].equals("X")) {
				cnt = 0;
				total.add(cnt);
				cnt++;
			}
		}

		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res += total.get(i);
		}
		
		System.out.println(res);
		
	}
	

}
