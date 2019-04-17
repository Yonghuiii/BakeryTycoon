/* 자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
 *
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Thread.Music;

public class MainPage extends JFrame {

	// Music myMusic = new Music();

	private Image screenImg;
	private Graphics screenGraphic;
	private Image introBackground = new ImageIcon(Main.class.getResource("./image/cafe.jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("./image/menubar.jpg")));
	
	

//private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("./image/button1.jpg"));
//	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("./image/button2.jpg"));
	private ImageIcon checkButtonImage = new ImageIcon(Main.class.getResource("./image/mainButton1.jpg"));
	private ImageIcon bakingButtonImage = new ImageIcon(Main.class.getResource("./image/mainButton2.jpg"));
	
//	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton checkBtn = new JButton(checkButtonImage);
	private JButton bakingBtn = new JButton(bakingButtonImage);

	private int mouseX, mouseY;

	public MainPage() {
		setUndecorated(true);
		setTitle("I'm BAKER");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		getContentPane().setLayout(null);
	
						
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		//exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		getContentPane().add(menuBar);
		
		getContentPane().add(checkBtn);
				
						
		JButton checkBtn = new JButton("");
		checkBtn.setIcon(new ImageIcon(MainPage.class.getResource("/image/mainButton1.PNG")));
		checkBtn.setBounds(734, 519, 174, 100);
		getContentPane().add(checkBtn);						
		
						
						
		checkBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		
		checkBtn.setBounds(312, 519, 200, 100);
		
		checkBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				checkBtn.setIcon(checkButtonImage);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				checkBtn.setIcon(checkButtonImage);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}

		});
		
		
		JButton bakingBtn = new JButton("");
		bakingBtn.setIcon(new ImageIcon(MainPage.class.getResource("/image/mainButton2.PNG")));
		bakingBtn.setBounds(734, 519, 174, 100);
		getContentPane().add(bakingBtn);
		
		bakingBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bakingBtn.setIcon(bakingButtonImage);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bakingBtn.setIcon(bakingButtonImage);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}

		});
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);

		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}

		});

		add(exitButton);
		
		
		// 배경음악 스레드
		try {
			Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\music\\Classic.mp3");
			bm.start();

			Thread.sleep(1);

		} catch (InterruptedException e) {
			System.out.println(e);
		}		
		
		

	
	}

	public void paint(Graphics g) {
		screenImg = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImg.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImg, 0, 0, null);

	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}
*/