import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontFrame extends JFrame{
	public FontFrame()	{
//		Font myfont = new Font("바탕체",3,20);
		
		Font myFont = null;
		try {
			myFont = Font.createFont(Font.TRUETYPE_FONT, 
					FontFrame.class.getClassLoader().getResourceAsStream("font/HIMelody-Regular.ttf")
					);
			myFont = myFont.deriveFont(Font.PLAIN,20);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lbl = new JLabel("텍스트입니다. ");
		
		lbl.setFont(myFont);
		
		add(lbl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FontFrame();

	}
}
