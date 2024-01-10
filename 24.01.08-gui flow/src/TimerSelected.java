import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Timer;

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
		
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("그림을 바꿈");
			}
		});
		timer.start();
		
		jrb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (jrb.isSelected()) {
					timer.setDelay(3000);
				} else {
					timer.setDelay(1000);
				}
			}
		});
		pnl.add(jrb);
		pnl.add(jrb2);
		
		
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
