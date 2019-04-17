/* 자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
 *

package Event;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;


public class Tab extends JFrame{

 
	 public Tab(){
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  createTabbedPane();
		  setTitle("scheduler");
		  setSize(800, 450);
		    
		  setVisible(true);
	 }
	 
	 
	 void createTabbedPane(){
		  JTabbedPane tPane = new JTabbedPane();
		  add(tPane);
		  
		  JLabel mainLabel = new JLabel("첫번째", SwingConstants.CENTER);
		  JPanel mainPanel = new JPanel();
		  mainPanel.add(mainLabel);
		  tPane.addTab("재료확인", mainPanel);
		  
		  
		  JLabel schedulerLabel = new JLabel("두번째", SwingConstants.CENTER);
		  JPanel schedulerPanel = new JPanel();
		  schedulerPanel.add(schedulerLabel);
		  tPane.addTab("수량확인", schedulerPanel);
		  
		  
		  JLabel reportLabel = new JLabel("세번째", SwingConstants.CENTER);
		  JPanel reportPanel = new JPanel();
		  reportPanel.add(reportLabel);
		  tPane.addTab("베이킹하기", reportPanel);
		  
		  
		  JLabel diaryLabel = new JLabel("네번째", SwingConstants.CENTER);
		  JPanel diaryPanel = new JPanel();
		  diaryLabel.add(diaryPanel);
		  tPane.addTab("주문하기", diaryPanel);
	 }

}

*/
