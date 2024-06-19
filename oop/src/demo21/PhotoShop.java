package demo21;

public class PhotoShop {

	//선 그리기 기능
	public void drawLine(Pen pen) {
		pen.draw();
	}
	
	public Pen selectPen(int no) {
		Pen redPen = new Pen() {
			public void draw() {
				System.out.println("빨간펜으로 그린다.");
			}
		};
		
		Pen yellowPen = new Pen() {
			public void draw() {
				System.out.println("노란펜으로 그린다.");
			}
		};
		
		Pen bluePen = new Pen() {
			public void draw() {
				System.out.println("파란펜으로 그린다.");
			}
		};
		
		Pen selectedPen = null;
		switch(no) {
			case 1:
				selectedPen = redPen;
				break;
			case 2:
				selectedPen = yellowPen;
				break;
			case 3:
				selectedPen = bluePen;
				break;
			default:
				selectedPen = () -> System.out.println("까만펜으로 그린다.");
		}
		return selectedPen;
	}
	public static void main(String[] args) {
		PhotoShop app = new PhotoShop();
		Pen pen = app.selectPen(3);
		app.drawLine(pen);
	}
}