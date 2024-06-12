package demo6;

public class ProductService {

	//상품 정보를 저장하는 배열
	private Product[] database = new Product[100];
	//저장할 배열 위치
	private int position = 0;
	
	/**
	 * 배열 객체 전체 반환
	 * @return
	 */
	public Product[] getAllProduct() {
		return database;
	}
	
	/**
	 * 객체 하나 반환
	 */
	public Product getOneProduct(int no) {
		
		//1. 전달받은 제품번호로 배열에서 맞는 거 찾기
		int foundIndex = -1;
		for(int i = 0; i < position; i++) {
			if(database[i].getNo() == no) {
				foundIndex = i;
				break;
			}
		}
		if (foundIndex != -1) {
			return database[foundIndex];
		} else {
			return null;
		}
		//제품 하나의 정보가 들은 객체 전달
	}
	
	/**
	 * 상품을 전달받아서 저장한다.
	 * @param product 신규 상품
	 */
	public void addNewProduct(Product product) {
		//전달받은 상품 객체를 배열에 집어 넣는다.
		database[position] = product;
		//저장위치 1증가
		position++;
	}

	//수정
	public void updateProduct(int no, String name, String manufacturer, int price, double discountRate, int availableStock) {
		//1. 전달받은 제품번호로 배열에서 맞는 거 찾기
		int foundIndex = -1;
		for(int i = 0; i < position; i++) {
			Product product = database[i];
			if(product.getNo() == no) {
				foundIndex = i;
				break;
			}
		}
		//2. 없는 경우
		if(foundIndex == -1) {
			System.out.println("### 일치하는 상품번호가 없습니다.");
			return;
		}
		//3. 수정
		
		database[foundIndex].setName(name);
		database[foundIndex].setManufacturer(manufacturer);
		database[foundIndex].setPrice(price);
		database[foundIndex].setDiscountRate(foundIndex);
		database[foundIndex].setAvailableStock(availableStock);
	}

	public void deleteProduct(int no) {

		//1. 전달받은 제품번호로 배열에서 맞는 거 찾기
		int foundIndex = -1;
		for(int i = 0; i < position; i++) {
			Product product = database[i];
			if(product.getNo() == no) {
				foundIndex = i;
				break;
			}
		}
		//2. 없는 경우
		if(foundIndex == -1) {
			System.out.println("### 일치하는 상품번호가 없습니다.");
			return;
		}
		
		//3. 한칸씩 앞으로 이동
		for(int i = foundIndex; i < position; i++) {
			database[i] = database [i + 1]; 
		}
		
		//4. 끝 칸을 null로 변경하고 position값 1감소
		database[position - 1] = null;
		position--;
		System.out.println("### 제품정보가 삭제되었습니다.");
	}
}
