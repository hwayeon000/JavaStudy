package person;

public class Main {
	public static void main(String[] args) {
		// 객체를 생성하는 곳 (실행시키는 곳)
		
		// p1 이라는 사람 하나 만들기
		// 객제 생성
		// 설계도의 이름
//		Person p1 = new Person();
		// new Person(); ---> 생성자
		// . -- >(참조한다)
//		p1.name = "조자연";
//		p1.age = 20;
//		p1.height = 160;
		Person p1 = new Person("조자연", 20, 160);
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
//		p1.eat();
//		p1.walk();
//		p1.sleep();

		// 이름을 가져와서 확인
		System.out.println(p1.getName() + ", " + p1.getAge() + ", " + p1.getHeight());
		p1.setName("최영화");
		// this.name = name;
		p1.setAge(17);
		p1.setHeight(170);
		// 이름을 가져와서 확인
		System.out.println(p1.getName() + ", " + p1.getAge() + ", " + p1.getHeight());
		
		// 설계도를 하나 만들어 놓으면 여러개의 객체 생성이 가능하다!
		
		
		
		
		
		
		// p2를 만들어서 본인의 나이, 이름, 키 초기화
//		Person p2 = new Person(); // 인스턴스화
//		// 기본생성자 ??? 
		// 내가 새로운 생성자를 만들면
		// 원래 있던 (생략되어있던) 기본생성자는
		//기능을 잃어버림(덮어씌워짐)
//		p2.name = "박화연";
//		p2.age = 33;
//		p2.height = 160;
//		
//		System.out.println(p2.name);
//		System.out.println(p2.age);
//		System.out.println(p2.height);
//		p2.eat();
//		p2.walk();
//		p2.sleep();
		
		
		
	}

}
