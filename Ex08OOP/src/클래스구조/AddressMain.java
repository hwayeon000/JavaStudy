package 클래스구조;

public class AddressMain {
	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명() ;
		Address addr1;
		addr1 = new Address();
		
		// 객체의 필드, 메소드 사용 방법은 .을 이용한다.
		addr1.name = "김미희";
		addr1.age = 20;
		addr1.phoneNumber = "010-2407-8429";
		addr1.showAddress();
		
		
		Address addr2 = new Address();
		addr2.name = "박화연";
		addr2.age = 30;
		addr2.phoneNumber = "010-1234-1234";
		addr2.showAddress();
	
		System.out.println(addr1 + " , " + addr2);
	}

}
