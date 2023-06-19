package 포켓몬;

public interface PokeMon {
	
	// 추상과 비슷한 개념
	
	// 추상클래스 : 일반메서드 + 추상메서드 다 포함 할 수 있다.
	// 		구현 된 메서드도 있고 꼭 구현되는 설계메서드도 있다!
	
	// 인터페이스 : 설계만 되어있는 메서드(추상메서드)만 포함하고 있다.
	// 		모두 body가 없는 메서드
	// 		==> 작업명세서, 프로젝트 설계도, 찐 설계도
	//		필드는 상수 형태로만 존재할 수 있음!
	
	// 포켓몬 게임에서 포켓몬은 반드시 공격, 특수공격이 있어야 함
	// 게임회사의 룰로 정한것
	
	// 공격
	public abstract void attack() ;
	// 특수 공격
	public abstract void specialAttack() ;
	
	// 인터페이스가 사용되는 대표적인 사례
	// JDBC ---> 
	
	
	
	
}
