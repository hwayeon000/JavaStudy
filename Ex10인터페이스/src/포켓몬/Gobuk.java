package 포켓몬;

public class Gobuk implements PokeMon {

	// 게임에 들어가려면 회사가 원하는 규직을 지켜야 함
	// 개발자 그 규칙이 무엇인지 인터페이스를 통해 할 수 있음

	@Override
	public void attack() {
		System.out.println("물대포 발사!");
	}

	@Override
	public void specialAttack() {
		System.out.println("물대포 두개 발사!!");
	}

}
