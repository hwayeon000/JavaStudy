package 상품관리프로그램;

public class Product {

	// 물건 이름, 단가, 수량 3가지 데이터를 관리하는 Product 자료형 만들기

	// 필드
	// 상품명, 단가, 수량
	private String name;
	private int unitPrice;
	private int amount;

	// 메서드
	// constructor, getter
	public Product(String name, int unitPrice, int amount) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}

}
