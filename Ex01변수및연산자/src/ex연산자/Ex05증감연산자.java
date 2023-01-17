package ex연산자;

public class Ex05증감연산자 {
	public static void main(String[] args) {
		
		int num = 20;
		
		// ++, --
		//앞/ 뒤 붙을 수 있음
		// 차이점 : 연산이 실행되는 시점 (시간)
		// 전치 연산자 ---> 실행 코드가 실행되기 전에 연산
		// 후치 연산자 ---> 실행 코드가 실행되고 나서 연산
		
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println(num--);
		System.out.println(num);
		System.out.println(--num);
		System.out.println(num);
		
		// +1, -1
		// num++ ---> num = num + 1; ---> num += 1;
		// num-- ---> num = num -1; ---> num -= 1;
		
		// "누적"을 하되, +1, -1을 필요로하는 연산에 사용
		
		int num1 = 6;
		
		for (int i = 1; i < num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
