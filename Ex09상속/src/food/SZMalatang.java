package food;

public class SZMalatang extends WonzoMalatang{

	@Override
	public void makeMalatang() {
		// super -> 부모클래스를 지칭하는 키워드
		System.out.println("치즈가 듬뿍 들어간 마라탕 ~!");
	}

	// 부모의 메서드가 아닌 업그레이드 가능 -> 확장
	public void makeTangsuyug() {
		System.out.println("쫄깃한 찹쌀 탕수육");
	}
	
}
