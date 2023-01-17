package 클래스구조;

public class PiggyBank {
	// 속성 : 돈
	// 기능 : 입금, 인출, 잔액 보여주기
	private int money;

	public void deposit(int num) {
		money = money + num;
		System.out.println("총액 : " + money);
	}

	public void withdraw(int num) {
		money = money - num;
		System.out.println("총액 : " + money);
	}

	public void balance() {
		System.out.println("총액 : " + money);
	}

	// money를 접긎 할 수 있도록 도와주는 getter,setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
