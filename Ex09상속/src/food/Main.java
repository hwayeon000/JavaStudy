package food;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 8글자 법칙
		// 오버로딩 중복정의
		// 오버라이딩 재정의

		// 원조 마라탕 객체 생성 -> 추상 클래스 객체 생성 불가
//		WonzoMalatang wm = new WonzoMalatang();
		// 승재 마라탕 객체 ㅋㅋ
		SJMalatang sjm = new SJMalatang();
		// 선지 마라탕ㅋㅋ
		SZMalatang szm = new SZMalatang();
		// 유솔 마라탕
		YSMalatang ysm = new YSMalatang();

		
		// 업캐스팅
		// 객체 생성은 자식클래스에서 생성되었으나
		// 데이터 타입이 부모클래스로 형변환 한 것
		
		// 업캐스팅 한다고 하더라도
		// 자식클래스에서 오버라이드한 메서드가 있다면
		// 오버라이드 한 메서드가 호출!
		// 또한 자식클래스에서 따로 정의한 메서드는 호출 불가능
		WonzoMalatang wm1 = sjm;
		WonzoMalatang wm2 = szm;
		WonzoMalatang wm3 = ysm;
		
		wm1.makeMalatang();
		wm2.makeMalatang();
		// 자식 클래스에만 있는 메서드, 부모클래스에는 존재하지 않으므로 안됨
//		wm2.makeTangsuyug();
		wm3.makeMalatang();
		
		
		// 업캐스팅 사용 이유!!!
		// 업캐스팅 시 동일한 클래스를 상속받는 객체끼리 묶어줄 수 있다 ---> 효율적인 관리 가능
		ArrayList<WonzoMalatang> list = new ArrayList<>();
		list.add(wm1);
		list.add(wm2);
		list.add(wm3);
		list.add(new SJMalatang());
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).makeMalatang();
		}
		
		// 다운캐스팅
		// 부모 데이터 타입 --> 자식 데이터 타입으로 변환하는 것
		SZMalatang sz2 = (SZMalatang)wm2;
		// Class casting Exception -> 캐스팅 오류 --> 다운캐스팅도 형에 맞춰서 해줘야 함
//		SZMalatang sz2 = (SZMalatang)wm1;
		sz2.makeTangsuyug();
		
				
		
	}
}
