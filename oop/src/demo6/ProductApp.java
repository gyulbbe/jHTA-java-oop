package demo6;

import utils.Keyboard;

public class ProductApp {
	
	private ProductService service = new ProductService();

	//메뉴
	private void displayMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.전체조회 2.상세조회 3.등록 4.수정 5.삭제 0.종료");
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		System.out.print("메뉴번호 입력: ");
		int menuNo = Keyboard.readInt();
		
		if (menuNo == 1) {
			viewAllProducts();
		} else if (menuNo == 2) {
			viewProductDetail();
		} else if (menuNo == 3) {
			addNewProduct();
		} else if (menuNo == 4) {
			modifyProductInfo();
		} else if (menuNo == 5) {
			removeProduct();
		} else if (menuNo == 0) {
			System.out.println("<< 프로그램 종료 >>");
			System.exit(0);
		}	
		
		System.out.println();
		System.out.println();

		displayMenu();
	}
	
	//전체 상품 조회
	private void viewAllProducts() {
		System.out.println("<< 전체 상품 조회 >>");

		//1.배열 객체를 가져온다
		Product[] products = service.getAllProduct();
		
		//2.화면에 출력한다.
		System.out.println("-----------------------------------------");
		System.out.println("번호\t가격\t할인가격\t이름");
		System.out.println("-----------------------------------------");
		for(Product product : products) {
			//없으면 멈추고
			if(product == null) {
				break;
			}
			product.print();
		}
		
	}
	
	//상세보기
	private void viewProductDetail() {
		
		//1. 상세 보기 하고 싶은 제품 번호를 넣는다.
		System.out.println("자세히 보고 싶은 제품 번호를 입력하세요: ");
		int no = Keyboard.readInt();
		
		//2.객체 하나를 가져온다.
		Product product = service.getOneProduct(no);
		
		//존재하지 않는 경우
		if(product == null) {
			System.out.println("### 일치하는 상품번호가 없습니다.");
			return;
		}
		
		//3.화면에 출력한다.
		System.out.println("<< 상품 상세 조회 >>");
		product.printDetail();
	}
	
	//제품 등록
	private void addNewProduct() {
		System.out.println("<< 신규 상품 등록 >>");
		
		//1.정보를 받는다.
		System.out.print("제품번호를 입력하세요. : ");
		int no = Keyboard.readInt();
		System.out.print("제품명를 입력하세요. : ");
		String name = Keyboard.readString();
		System.out.print("제조사를 입력하세요. : ");
		String manufacturer = Keyboard.readString();
		System.out.print("가격을 입력하세요. : ");
		int price = Keyboard.readInt();
		System.out.print("할인률을 입력하세요. : ");
		double discountRate = Keyboard.readDouble();
		System.out.print("재고수량을 입력하세요. : ");
		int availableStock = Keyboard.readInt();
		
		//2.정보를 넘겨줄 객체를 정보를 담아 생성
		Product product = new Product(no, name, manufacturer, price, discountRate, availableStock);
		
		//3.정보가 담긴 객체를 보낸다.
		service.addNewProduct(product);
		
		System.out.println("제품이 성공적으로 등록되었습니다.");
	}
	
	//수정
	private void modifyProductInfo() {
		System.out.println("<< 상품 정보 수정 >>");

		//1.수정할 정보를 입력받는다
		System.out.println("### 수정할 정보를 입력하세요");
		System.out.println("제품번호을 입력하세요: ");
		//제품이 존재하지 않으면 멈추기
		int no = Keyboard.readInt();
		Product product = service.getOneProduct(no);
		if(product == null) {
			System.out.println("해당하는 제품번호가 존재하지 않습니다.");
			return;
		}
		//수정할 정보 입력
		System.out.println("새 제품명을 입력하세요: ");
		String name = Keyboard.readString();
		System.out.print("새 제조사를 입력하세요. : ");
		String manufacturer = Keyboard.readString();
		System.out.print("새 가격을 입력하세요. : ");
		int price = Keyboard.readInt();
		System.out.print("새 할인률을 입력하세요. : ");
		double discountRate = Keyboard.readDouble();
		System.out.print("새 재고수량을 입력하세요. : ");
		int availableStock = Keyboard.readInt();
		
		//2. 수정할 정보를 보낸다.
		service.updateProduct(no, name, manufacturer, price, discountRate, availableStock);
	}
	
	//삭제
	private void removeProduct() {
		System.out.println("<< 상품정보 삭제 >>");

		//1. 삭제할 정보를 입력받는다.
		System.out.println("### 삭제할 정보를 입력하세요");
		System.out.println("제품번호을 입력하세요: ");
		int no = Keyboard.readInt();
		
		//2. 삭제 메소드 호출
		service.deleteProduct(no);
	}
	
	//메인
	public static void main(String[] args) {
		ProductApp app = new ProductApp();
		app.displayMenu();
	}
}
