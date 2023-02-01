package help;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import help.JPanel02.MyActionListener;
import help.JPanel02.MyJoinListener;
import help.JPanel02.MyLoginListener;


@SuppressWarnings("serial")
public class JPanelChangeTest extends JFrame {
	
	private JPanelChange win;
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	public MyPanel myPanel = null;
	
	public JPanelChangeTest() {
		
		win.setTitle("네모네모 로직~");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.myPanel = new MyPanel(win);

		// t.requestFocus(); 이거하면 안되는데
		win.setFocusable(true); // 이건 된다.
//		win.setSize(400, 300);
		win.setSize(600, 500);
		win.setVisible(true);

	}
	
	public static void main(String[] args) {
	
		JPanelChange win = new JPanelChange();
		
		win.setTitle("네모네모 로직 o((>ω< ))o");
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		win.myPanel  = new MyPanel(win);
		
		win.add(win.jpanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		win.setSize(400,300);
		win.setSize(500,400);
		win.setVisible(true);
		System.out.println("체크");
	}
}

@SuppressWarnings("serial")
class JPanelChange extends JFrame{
	
	public MyPanel myPanel = null;
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	
	// 패널 1번 2번 변경 후 재설정
	public void change(String panelName) {
		if (panelName.equals("Panel01")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel01);
			revalidate();
			repaint();
		} else if (panelName.equals("myPanel")) {
			getContentPane().removeAll();
			getContentPane().add(myPanel);
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


// 10*10 로직 패널
@SuppressWarnings("serial")
class MyPanel extends JPanel {
	
	int x_max = 25;
	int y_max = 25;
	int count = 0;
	
	int[][] map = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

	private JPanelChange win;
	
	int click_x = -1, click_y = -1;

	public MyPanel(JPanelChange win) {
		setLayout(null);
		this.win = win;
		
		JButton btn = new JButton("메인으로");
		btn.setSize(90,20);
		btn.setLocation(380,230);
		add(btn);
		btn.addActionListener(new MyActionListener());
		
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("a");
				if ((click_x >= 0 && click_x <= 9) && (click_y <= 9 && click_y >= 0)) {
					map[click_x][click_y] = 0;
					switch (e.getKeyCode()) {

					case KeyEvent.VK_UP:
						if (--click_y < 0)
							click_y = 0;
						map[click_x][click_y] = 1;
						break;

					case KeyEvent.VK_DOWN:
						if (++click_y > 9)
							click_y = 9;
						map[click_x][click_y] = 1;
						break;

					case KeyEvent.VK_RIGHT:
						if (++click_x > 9)
							click_x = 9;
						map[click_x][click_y] = 1;
						break;

					case KeyEvent.VK_LEFT:
						if (--click_x < 0)
							click_x = 0;
						map[click_x][click_y] = 1;
						break;
					}
				}
				repaint();
			}
		});

		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getX() <= 275 && e.getY() <= 275) {
					int x = e.getX() / x_max;
					int y = e.getY() / y_max;
					map[x][y] = 1;
					click_x = x;
					click_y = y;
				}
				repaint();
			}
		});
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("Panel01");
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Arial", Font.ITALIC, 30));
		g.drawString("count", 380, 30);
		for (int i = 0; i <= 10; i++) {
			g.drawLine(0, 25 * i, 250, 25 * i);
			g.drawLine(25 * i, 0, 25 * i, 250);
		}

		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 1) {
					count++;
//					g.fillOval(i * 25, j * 25, 25, 25);
					// 사각형 칠하기
					g.setColor(Color.BLUE);
					// i, j 인덱스..
					g.fillRect(i * 25, j * 25, 25, 25);
				} else if (map[i][j] == 3) {
					count++;
//					g.fillOval(i * 25, j * 25, 25, 25);
					// 사각형 칠하기
					g.setColor(Color.yellow);
					// i, j 인덱스..
					g.fillRect(i * 25, j * 25, 25, 25);
				}
			}

		g.setFont(new Font("Arial", Font.ITALIC, 15));
		g.drawString(count + "", 410, 50);
		count = 0;

	}
	
}



//1번째 패널
@SuppressWarnings("serial")
class JPanel01 extends JPanel {

	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JPanelChange win;

	public JPanel01(JPanelChange win) {
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
	private JPanelChange win;
	
	public JPanel02(JPanelChange win) {
		// setBounds ( x좌표 y좌표 w 가로크기 h 세로크기 )
		setLayout(null);
		this.win = win;
		JLabel idLb = new JLabel("아이디 : ");
		idLb.setBounds(32,40,67,15);
		add(idLb);
		
		textField = new JTextField();
		textField.setBounds(123,40,116,21);
		add(textField);
		textField.setColumns(10);
		
		JLabel pwLb = new JLabel("암호 : ");
		pwLb.setBounds(32,84,67,15);
		add(pwLb);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123,84,116,21);
		add(passwordField);
		
		JLabel nickLb = new JLabel("닉네임 : ");
		nickLb.setBounds(32,128,67,15);
		add(nickLb);
		
		textField = new JPasswordField();
		textField.setBounds(123,128,116,21);
		add(textField);
		
		JButton btn = new JButton("메인으로");
		btn.setSize(90,20);
		btn.setLocation(32,10);
		add(btn);
		btn.addActionListener(new MyActionListener());
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.setSize(90,20);
		btnJoin.setLocation(32,172);
		add(btnJoin);
		btnJoin.addActionListener(new MyJoinListener());
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setSize(90,20);
		btnLogin.setLocation(146,172);
		add(btnLogin);
		btnLogin.addActionListener(new MyLoginListener());
		
		
	}
	
	// 버튼 누르면 패널 1번 호출
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("Panel01");
		}
	}
	
	class MyJoinListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("Join");
		}
	}
	
	class MyLoginListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			win.change("myPanel");
		}
	}
	
}






//@SuppressWarnings("serial")
//class JPanelChange extends JFrame{
//
//	int x_max = 25;
//	int y_max = 25;
//	int count = 0;
//	
//	int[][] map = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };
//
//	
//	public JPanel01 jpanel01 = null;
//	public JPanel02 jpanel02 = null;
//	public NemoTen nemoTen = null;
//	
	// 패널 1번 2번 변경 후 재설정
//	public void change(String panelName) {
//		if (panelName.equals("Panel01")) {
//			
//			getContentPane().removeAll();
//			getContentPane().add(jpanel01);
//			revalidate();
//			repaint();
//			
//		} else {
//			
//			getContentPane().removeAll();
//			getContentPane().add(nemoTen);
//			revalidate();
//			repaint();
//			
//		}
//	}
	
//}
