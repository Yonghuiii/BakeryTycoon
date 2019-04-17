package Thread;


/*
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image extends JFrame implements Runnable {
	
	public void Image() {
		// TODO Auto-generated method stub
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	//	JLabel textLabel = new JLabel("제임스 고슬링 입니더!");
		ImageIcon img = new ImageIcon("https://media.giphy.com/media/qcrzLyoFYeURq/giphy.gif"); 
		JLabel imageLabel = new JLabel(img);
	//	ImageIcon icon = new ImageIcon("images/icon.gif"); 
	//	JLabel label = new JLabel("커피한잔 하실래예, 전화주이소",icon, SwingConstants.CENTER);
	//	c.add(textLabel);
 		c.add(imageLabel);
 	//	c.add(label);
		setSize(300,500);
		setVisible(true);
	}
	*/
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class BakingImage_muffin extends JFrame implements Runnable {
	    JPanel contentPane;
	    JLabel imageLabel = new JLabel();
	    JLabel headerLabel = new JLabel();

	    //머핀 이미지 메서드
	    public void Image_muffin() {
	        try {
	            setDefaultCloseOperation(EXIT_ON_CLOSE);
	            contentPane = (JPanel) getContentPane();
	            contentPane.setLayout(new BorderLayout());
	            setSize(new Dimension(500, 300));
	           
	            ImageIcon icon = new ImageIcon("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\image\\muffin.gif");
	            imageLabel.setIcon(icon);
	            contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
	            // show it
	            this.setLocationRelativeTo(null);
	            this.setVisible(true);
	            
	            try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	            dispose();
	            
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	    }
	
	
	
	public void run() {
		 try {
             Image_muffin();
         }
         catch (Exception e) {
             System.out.println(e);
         }
	}

	
}