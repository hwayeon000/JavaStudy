package panelChange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//1번째 패널
@SuppressWarnings("serial")
class JPanel01 extends JPanel {

	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelTest win;

	public JPanel01(JPanelTest win) {
		this.win = win;
		setLayout(null);
		
		jButton1 = new JButton("회원가입 / 로그인");
		jButton1.setSize(140,20);
		jButton1.setLocation(10,10);
		add(jButton1);
		
		jTextArea1 = new JTextArea();
		
		jScrollPane1 = new JScrollPane(jTextArea1);
		jScrollPane1.setSize(200,150);
		jScrollPane1.setLocation(10,40);
		add(jScrollPane1);
		
		jButton1.addActionListener(new MyActionListener());
	}

	// 버튼 누르면 패널 2번 호출
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("panel02");
		}
	}
}

@SuppressWarnings("serial")
//2번째 패널
class JPanel02 extends JPanel {
	
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanelTest win;
	
	public JPanel02(JPanelTest win) {
		
		setLayout(null);
		this.win = win;
		JLabel idLb = new JLabel("아이디 : ");
		idLb.setBounds(31,40,67,15);
		add(idLb);
		
		textField = new JTextField();
		textField.setBounds(123,40,116,21);
		add(textField);
		textField.setColumns(10);
		
		JLabel pwLb = new JLabel("암호 : ");
		pwLb.setBounds(31,84,67,15);
		add(pwLb);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123,84,116,21);
		add(passwordField);
		
		JButton btn = new JButton("로그인");
		btn.setSize(90,20);
		btn.setLocation(10,10);
		add(btn);
		btn.addActionListener(new MyActionListener());
		
	}
	
	// 버튼 누르면 패널 1번 호출
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("panel01");
		}
	}

}

@SuppressWarnings("serial")
class JPanelTest extends JFrame{
	
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	
	// 패널 1번 2번 변경 후 재설정
	public void change(String panelName) {
		if (panelName.equals("panel01")) {
			
			getContentPane().removeAll();
			getContentPane().add(jpanel01);
			revalidate();
			repaint();
			
		} else {
			
			getContentPane().removeAll();
			getContentPane().add(jpanel02);
			revalidate();
			repaint();
			
		}
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		JPanelTest win = new JPanelTest();
		
		win.setTitle("frame test");
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		
		win.add(win.jpanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(400,300);
		win.setVisible(true);
		System.out.println("체크");
		
	}

}
