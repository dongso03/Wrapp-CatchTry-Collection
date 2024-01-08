import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;
import java.util.Timer;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TimerSelected extends JFrame{
	public TimerSelected() {
		JPanel pnl = new JPanel();
		CardLayout cardLayout = new CardLayout();

		pnl.add(new JLabel (new ImageIcon("춘식1.png")),"1번");
		pnl.add(new JLabel (new ImageIcon("춘식2.png")),"2번");
		pnl.add(new JLabel (new ImageIcon("춘식3.png")),"3번");
		JRadioButton jrb = new JRadioButton();
		JRadioButton jrb2 = new JRadioButton();
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrb);
		btg.add(jrb2);
		jrb.setSelected(true);
		
		Timer timer = new Timer(1000, new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
			}
		};
		
		
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TimerSelected();
	}
}
