package 클래스구조;

public class PiggyBankMain {
	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		// PiggyBank 클래스에서 변수 int money룰 private로 선언했기 때문에
		// 다른 클래스에서 접근 불거 ---> 캡슐화
//		pb1.money = 5000;
		pb1.setMoney(10000);
		System.out.println(pb1.getMoney());
		
		// 저금통에 1500원 입금
		pb1.deposit(1500);
		// 700 인출
		pb1.withdraw(700);
		// 잔액확인
		pb1.balance();
		
		PiggyBank pb2 = new PiggyBank();
		pb2.balance();
		
		// 프로그래밍 패러다임
		// 이 시대의 개발자들에게 자리잡은 상식, 개념

		// 절차적 프로그래밍 : 실행 시간이 짦음, 하나의 오류에 기능 전체 마비
		// 객체지향 프로그래밍 : 하나이 오류에도 다른 기능은 문제 없읍, 안정성은 있으나 시간이 걸림 
		
		// 어떤 패턴으로 프로그램을 구성할 것인가 ... 다양한 종류가 있음
		// 배울것 : MVC패턴 (Model - View - Controller)
		// view : 눈에 보여지는 것
		// model : 실제 데이터 관련, VO, DB접근, 저장, 꺼내오기, 관리 등등
		// controller : 기능, 예를 들어 성적을 계산하는 기능 등 ...
	}

}
