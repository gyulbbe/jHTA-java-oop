package demo20;

import java.awt.event.*;
import javax.swing.*;

public class MyApp extends JFrame{

	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Edit");
	private JMenu menu3 = new JMenu("Help");
	
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenuItem item1 = new JMenuItem("New");
	private JMenuItem item2 = new JMenuItem("Load");
	private JMenuItem item3 = new JMenuItem("Save");
	private JMenuItem item4 = new JMenuItem("Exit");
	
	private JMenuItem item5 = new JMenuItem("Undo");
	private JMenuItem item6 = new JMenuItem("Copy");
	private JMenuItem item7 = new JMenuItem("Cut");
	private JMenuItem item8 = new JMenuItem("Paste");
	
	private JMenuItem item9 = new JMenuItem("Welcome");
	private JMenuItem item10 = new JMenuItem("About");
	
	public MyApp() {
		init();
	}
	
	private void init() {
		ActionListener l1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("새 파일을 연다.");
			}
		};
		ActionListener l2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("파일을 불러온다.");
			}
		};
		ActionListener l3 = (e) -> System.out.println("파일을 저장한다.");
		
		ActionListener l4 = (e) -> System.out.println("프로그램을 종료한다.");
		
		//메뉴아이템을 클릭했을 때 실행할 코드가 정의된 객체를 등록하기
		item1.addActionListener(l1);
		item2.addActionListener(l2);
		item3.addActionListener(l3);
		item4.addActionListener(l4);
		item5.addActionListener(e -> System.out.println("실행을 취소한다."));
		item6.addActionListener(e -> System.out.println("복사한다."));
		item7.addActionListener(e -> System.out.println("잘라낸다."));
		item8.addActionListener(e -> System.out.println("붙여넣는다."));
		item9.addActionListener(e -> System.out.println("환영한다."));
		item10.addActionListener(e -> System.out.println("도움말을 표시한다."));
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		
		menu2.add(item5);
		menu2.add(item6);
		menu2.add(item7);
		menu2.add(item8);
		
		menu3.add(item9);
		menu3.add(item10);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		setJMenuBar(menuBar);
		
		//setBounds(int x, int y, int width, int height) 메소드는 화면의 좌표와 크기를 결정하는 메소드다.
		setBounds(100, 100, 400, 200);
		//setVisible(boolean display) 메소드는 화면을 모니터에 표시할지 여부를 결정하는 메소드다.
		setVisible(true);
		//화면 우측상단의 닫기버튼을 눌렀을 때 수행할 동작을 지정하는 메소드다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyApp app = new MyApp();
	}
}