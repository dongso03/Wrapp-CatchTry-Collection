import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabFrame extends JFrame {
	public TabFrame() {
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.gray);
		pnl.add(new JButton("버튼"));
		pnl.add(new JButton("버튼"));
		pnl.add(new JButton("버튼"));
		
		JPanel pnl2 = new JPanel();
		pnl2.setBackground(Color.PINK);
		
		JTabbedPane tabpane = new JTabbedPane()	;
		tabpane.addTab("빨강화면", pnl);
		tabpane.addTab("초록화면", pnl2);
		
		add(tabpane);
		
		showGUI();
		
		
	}
	
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TabFrame();
	}
}
