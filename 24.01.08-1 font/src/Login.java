//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.FocusListener;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.SpringLayout;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.JPasswordField;
//
//public class Login extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField textField;
//	private JPasswordField passwordField;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Login() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		SpringLayout sl_contentPane = new SpringLayout();
//		contentPane.setLayout(sl_contentPane);
//
//		JLabel lblNewLabel = new JLabel("아이디");
//		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 15, SpringLayout.WEST, contentPane);
//		contentPane.add(lblNewLabel);
//
//		JLabel lblNewLabel_1 = new JLabel("비밀번호");
//		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -65, SpringLayout.NORTH, lblNewLabel_1);
//		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 5, SpringLayout.EAST, lblNewLabel_1);
//		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 148, SpringLayout.NORTH, contentPane);
//		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, contentPane);
//		contentPane.add(lblNewLabel_1);
//
//		textField = new JTextField();
//		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 60, SpringLayout.NORTH, contentPane);
//		contentPane.add(textField);
//		textField.setColumns(10);
//
//		JButton btnNewButton = new JButton("로그인");
//		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 105, SpringLayout.NORTH, contentPane);
//		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -45, SpringLayout.EAST, contentPane);
//		contentPane.add(btnNewButton);
//
//		passwordField = new JPasswordField();
//		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, passwordField);
//		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, passwordField);
//		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 31, SpringLayout.EAST, lblNewLabel_1);
//		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, -201, SpringLayout.EAST, contentPane);
//		sl_contentPane.putConstraint(SpringLayout.NORTH, passwordField, -3, SpringLayout.NORTH, lblNewLabel_1);
//		contentPane.add(passwordField);
//		
//		JLabel lblNewLabel_2 = new JLabel("");
//		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 49, SpringLayout.SOUTH, btnNewButton);
//		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, btnNewButton);
//		contentPane.add(lblNewLabel_2);
//		
//		
//		
//	btnNewButton.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if(textField.getText().equals("아이디")&& passwordField.getText().equals("1234")) {
//			lblNewLabel_2.setText("로그인 되었습니다.");
//		}else {
//			lblNewLabel_2.setText("로긴실패");
//		}
//	});

	//}
	
//}
