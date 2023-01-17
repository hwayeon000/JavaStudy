package festival;

import java.util.Iterator;
import java.util.Random;

public class Ex21 {
	public static void main(String[] args) {
//		8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
//		가장 큰 수와 작은 수를 각각 출력하시오.
//		(랜덤의 범위 1~99)
		Random rd = new Random();
		int[] arr = new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(99)+1;			
		}
		int maxNum = arr[0];
		int minNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			maxNum = maxNum>arr[i] ? maxNum : arr[i];		
			minNum = minNum<arr[i] ? minNum : arr[i];		
		}
		System.out.println();
		System.out.println(maxNum + ", " + minNum);
		
	}

}
