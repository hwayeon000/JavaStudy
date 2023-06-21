package festival;

public class Ex10 {
	public static void main(String[] args) {
//		(77*1) + (76*2) + (75*3)+…+(1*77)를 계산하여
//		결과를 출력하시오.
		
		int cnt = 77;
		int res = 0;
		for (int i = 1; i <= 77; i++) {
			res += cnt * i;
			cnt--;
		}
		System.out.println(res);
		
	}

}
