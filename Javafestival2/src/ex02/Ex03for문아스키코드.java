package ex02;

public class Ex03for문아스키코드 {
	public static void main(String[] args) {
		
//		for문을 활용하여 A~Z까지 출력
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		int cnt = 65;
		for (int i = 0; i < 26; i++) {
			System.out.print((char)cnt + " ");
			cnt++;
		}
		
		
	}

}
