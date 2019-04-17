package Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class GrandfaImage1 extends JFrame implements Runnable {
	    JPanel contentPane;
	    JLabel imageLabel = new JLabel();
	    JLabel headerLabel = new JLabel();

	    
	    //할아버지 이미지 메서드 - 등장

	    public void GrandfaImage1() {
	        try {
	            setDefaultCloseOperation(EXIT_ON_CLOSE);
	            contentPane = (JPanel) getContentPane();
	            contentPane.setLayout(new BorderLayout());
	            setSize(new Dimension(300, 250));
	           
	            ImageIcon icon = new ImageIcon("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\image\\grandfa_come.gif");
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
             GrandfaImage1();
         }
         catch (Exception e) {
             System.out.println(e);
         }
	}

	
}
