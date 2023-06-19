package 포켓몬;

public class Pica implements PokeMon {
	// public class Pica implements 인터페익스명

	// interface를 상속한다 ---> implements(구현)

	// 게임회사에서 만든 설계도(룰, 규칙)을 적용시키자
	// 설계도 -> Interface

	@Override
	public void attack() {
		System.out.println("전기 충격!");
	}

	@Override
	public void specialAttack() {
		System.out.println("백만볼트!!!");
	}

}
