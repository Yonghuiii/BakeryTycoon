/*자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
 *
package Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {
	
	public void frame() {
		
		JFrame frame = new JFrame(); //프레임 만들기
		JPanel panel = new JPanel(); //패널 : 프레임 안에 또 다른 프레임을 넣을 수 있는 것
		JLabel label = new JLabel("신기한 GUI"); //레이블 : 글자 표시
		JButton btn1 = new JButton("First"); //버튼
		JButton btn2 = new JButton("Exit"); //종료버튼
		JTextArea txtArea = new JTextArea();//여러 줄 넣을 때 사용; JTextField //한줄 넣을 때 사용 , JTextField txtField = new JTextField(200);
		JPanel btnPanel = new JPanel();
		panel.setLayout(new BorderLayout()); //원하는 위치에 레이아웃 설정
		
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				label.setText(txtArea.getText());
				//txtArea.append("Your are amazing\n");
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		frame.add(panel); //프레임 안에 패널을 넣어줘야함
		
		
		frame.setResizable(false); // 프레임 크기 조절 방지
		frame.setVisible(true); //프레임 보이게 해주기
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);// 화면 가운데 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 껐을 때 모든게 종료됨
		
		
		
		
	}
}
*/