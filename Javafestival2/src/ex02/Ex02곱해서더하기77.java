package ex02;

public class Ex02곱해서더하기77 {
	public static void main(String[] args) {
		
//		(77*1) + (76*2) + (75*3)+…+(1*77)를 계산하여 결과를 출력하시오

		int res = 0;
		for (int i = 1; i <= 77; i++) {
			res += (78-i) * i;
		}
		System.out.println(res);
			
	}

}
