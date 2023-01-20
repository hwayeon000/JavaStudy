package ex05;

public class Ex01거리비교 {
	public static void main(String[] args) {
//		숫자가 담긴 1차원 배열이 주어졌을 때, 두 개의 숫자를 뽑아 서로의 거리를 비교한 후 
//		거리가 가장 작은 숫자의 위치(index)를 출력하시오
		
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int id1 = 0;
		int id2 = 1;
		
		for (int i = 0; i < point.length-1; i++) {
			for (int j = i+1; j < point.length; j++) {

				if ((point[id1]-point[id2])*(point[id1]-point[id2]) > (point[i]-point[j])*(point[i]-point[j])) {
					id1 = i;
					id2 = j;
				}
				
			}
		}
		
		System.out.println(id1 + ", " + id2);
		
	}
}
