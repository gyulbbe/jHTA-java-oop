package demo6;

public class Product {

	private int no;					//상품 번호
	private String name;			//상품 이름
	private String manufacturer;	//제조사
	private int price;				//가격
	private double discountRate;	//할인률
	private int availableStock;		//재고수량
	
	public Product() {}

	public Product(int no, String name, String manufacturer, int price, double discountRate, int availableStock) {
		this.no = no;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.discountRate = discountRate;
		this.availableStock = availableStock;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	//할인된 가격
	public int getMinusPrice() {
		return (int)(price*discountRate);
	}
	//최종 금액
	public int getFinalPrice() {
		return price - (int)(price*discountRate);
	}
	/**
	 * 상품에 대한 간단한 정보를 화면에 출력한다.
	 */
	public void print() {
		System.out.print(no + "\t");
		System.out.print(price + "\t");
		System.out.print(getMinusPrice() + "\t");
		System.out.println(name);
	}
	
	/**
	 * 상품에 대한 상세한 정보를 화면에 출력한다.
	 */
	public void printDetail() {
		System.out.println("상품번호: " + no);
		System.out.println("상품이름: " + name);
		System.out.println("제조회사: " + manufacturer);
		System.out.println("상품가격: " + price);
		System.out.println("할인가격: " + getMinusPrice());
		System.out.println("할인율  : " + discountRate*100 + "%");
		System.out.println("최종가격  : " + getFinalPrice());
		System.out.println("재고수량: " + availableStock);
	}
}
