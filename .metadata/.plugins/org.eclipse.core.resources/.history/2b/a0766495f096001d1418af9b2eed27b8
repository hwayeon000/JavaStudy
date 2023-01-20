package ex03;

import java.util.Random;

public class Ex04배열큰수작은수 {
	public static void main(String[] args) {
//		8칸 크기의 배열을 선언하고 랜덤수로 초기화 한
//		후 가장 큰 수와 작은 수를 각각 출력하시오
		
		Random rd = new Random();
		
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = rd.nextInt(1, 61);
			arr[i] = rd.nextInt(61) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}
		
		int maxNum = arr[0];
		int minNum = arr[0];
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			maxNum = (maxNum < arr[i]) ? arr[i] : maxNum;
			minNum = (minNum > arr[i]) ? arr[i] : minNum;
		}System.out.println();
		
		System.out.println("가장 큰 값 : " + maxNum);
		System.out.println("가장 작은 값 : " + minNum);
		
		
		
		
	}
}
