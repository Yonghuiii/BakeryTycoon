package Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Bread.Bread;


	public class Mouse_putMaterial extends JFrame
	{
		//필요 객체 생성 부분

		MaterialCheckBox myMaterialCheckBox = new MaterialCheckBox();
		
		Bread myBread = new Bread();
		
		
		//판넬 담는 변수 선언
		private JPanel contentPane;
		
		//버튼 변수 선언
		private JButton jButton1; 
		private JButton jButton2;
		private JButton jButton3;
		private JButton jButton4;
		private JButton jButton5;
		
		private JButton jButton6;
		private JButton jButton7;
		private JButton jButton8;
		private JButton jButton9;
		private JButton jButton10;
		
		private JButton jButton11;
		private JButton jButton12;
		private JButton jButton13;
		private JButton jButton14;
		private JButton jButton15;
		
		private JButton buttonOK;
		
		//판넬 변수 선언
		private JPanel jPanel1;
		private JPanel jPanel2;

		
		// 팝업창 좌표값 및 사이즈
		int x = 10;
		int y = 10;
		int s_x = 10;
		int s_y = 10;
		int width = 80;
		int height = 20;

		public Mouse_putMaterial()
		{
			super();
			initializeComponent();
			//
			// TODO: Add any constructor code after initializeComponent call
			//
			
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	

	/**
	* This method is called from within the constructor to initialize the form.
	* WARNING: Do NOT modify this code. The content of this method is always regenerated
	* by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	* Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	* to retrieve your design properly in future, before revising this method.
	*/
		
		//컴포넌트 초기화
		public void initializeComponent()
		{
			//컨텐트팬(패널) 객체 생성
			contentPane = (JPanel)this.getContentPane();
			
			//재료 담을 패널 객체 생성
			jPanel1 = new JPanel();

			jPanel2 = new JPanel();
		
			//buttonOK 버튼을 담을 패널 객체 생성
			JPanel buttonPanel = new JPanel();
		
		
			//기본재료 버튼 객체 생성
			jButton1 = new JButton();
			jButton2 = new JButton();
			jButton3 = new JButton();
			jButton4 = new JButton();
			jButton5 = new JButton();
			
			
			//추가재료 버튼 객체 생성
			jButton6 = new JButton();
			jButton7 = new JButton();
			jButton8 = new JButton();
			jButton9 = new JButton();
			jButton10 = new JButton();
			
			//토핑재료 버튼 객체 생성
			jButton11 = new JButton();
			jButton12 = new JButton();
			jButton13 = new JButton();
			jButton14 = new JButton();
			jButton15 = new JButton();
			

			//클릭 시 팝업창 사라지게하는 버튼 객체 생성
			buttonOK = new JButton("OK");
		
			//버튼 패널에 buttonOK 버튼 추가 및 레이아웃 위치 조정
			buttonPanel.add(buttonOK);
			
			add(buttonPanel, BorderLayout.SOUTH);
			
			
			//재료버튼1 - 밀가루 버튼 눌렀을 때 행동 실행하도록 하는 메소드 
			jButton1.setText("밀가루");
			jButton1.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton1_actionPerformed(e);

				}
			
			});
			
			
			//재료버튼2 - 설탕 버튼 눌렀을 때 행동 실행하도록 하는 메소드 			
			jButton2.setText("설탕");
			jButton2.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton2_actionPerformed(e);
					
					
				}
			
			});
						
			//재료버튼3 - 버터 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton3.setText("버터");
			jButton3.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton3_actionPerformed(e);
				}
			
			});
			
			//재료버튼4 - 소금 버튼 눌렀을 때 행동 실행하도록 하는 메소드	
			jButton4.setText("소금");
			jButton4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton4_actionPerformed(e);
				}
			
	
			});
			
			//재료버튼5 - 계란 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton5.setText("계란");
			jButton5.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton5_actionPerformed(e);
				}
			
	
			});
		
		
			//재료버튼6 - 베이킹파우더 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton6.setText("베이킹파우더");
			jButton6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton6_actionPerformed(e);
				}
			
	
			});
			
			
			//재료버튼7 - 우유 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton7.setText("우유");
			jButton7.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton7_actionPerformed(e);
				}
			
			});
			
			//재료버튼8 - 물 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton8.setText("물");
			jButton8.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton8_actionPerformed(e);
				}
			
			});
			
			//재료버튼9 - 효모 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton9.setText("효모");
			jButton9.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton9_actionPerformed(e);
				}
			
			});
			
			//재료버튼10 - 생크림 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton10.setText("생크림");
			jButton10.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton10_actionPerformed(e);
				}
			
			});
			
			//재료버튼11 - 딸기 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton11.setText("딸기");
			jButton11.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton11_actionPerformed(e);
				}
			
			});
			
			//재료버튼12 - 사과 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton12.setText("사과");
			jButton12.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton12_actionPerformed(e);
				}
			
			});
			
			//재료버튼13 - 마카다미아 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton13.setText("마카다미아");
			jButton13.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton13_actionPerformed(e);
				}
			
	
			});
			
			//재료버튼14 - 블루베리 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton14.setText("블루베리");
			jButton14.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton14_actionPerformed(e);
				}
			
			});
			
			//재료버튼15 - 크랜베리 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			jButton15.setText("크랜베리");
			jButton15.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					jButton15_actionPerformed(e);
				}
			
			});
			
			//buttonOK 버튼 눌렀을 때 행동 실행하도록 하는 메소드
			buttonOK.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
					buttonOK_actionPerformed(e);
				}
				
			});
			
			contentPane.setLayout(null);

			addComponent(contentPane, jPanel1, 5,10,500,50);
			addComponent(contentPane, jPanel2, 5,10,500,150);
			
			
			
			
			// contentPane
			//
			contentPane.setLayout(null);
			addComponent(contentPane, jPanel1, 5,10,500,50);
			addComponent(contentPane, jPanel2, 6,60,500,150);
			//
	
		
			//판넬 상단 색상 
			jPanel1.setLayout(null);
			jPanel1.setBackground(new Color(255,235,205));
			jButton1.setBackground(new Color(255,192,203));
			jButton2.setBackground(new Color(255,192,203));
			jButton3.setBackground(new Color(255,192,203));
			jButton4.setBackground(new Color(255,192,203));
			jButton5.setBackground(new Color(255,192,203));
			
			//판넬 상단 버튼 추가
			addComponent(jPanel1, jButton1, 5,0,100,30);
			addComponent(jPanel1, jButton2, 100,0,100,30);
			addComponent(jPanel1, jButton3, 200,0,100,30);
			addComponent(jPanel1, jButton4, 300,0,100,30);
			addComponent(jPanel1, jButton5, 400,0,100,30);
			
			//판넬 하단 색상
			jPanel2.setLayout(null);
			jPanel2.setBackground(new Color(255,228,225));
			jButton6.setBackground(new Color(255,192,203));
			jButton7.setBackground(new Color(255,192,203));
			jButton8.setBackground(new Color(255,192,203));
			jButton9.setBackground(new Color(255,192,203));
			jButton10.setBackground(new Color(255,192,203));
			jButton11.setBackground(new Color(255,192,203));
			jButton12.setBackground(new Color(255,192,203));
			jButton13.setBackground(new Color(255,192,203));
			jButton14.setBackground(new Color(255,192,203));
			jButton15.setBackground(new Color(255,192,203));
			
			buttonOK.setBackground(new Color(255,255,203));
			
			//판넬 하단 버튼 추가
			addComponent(jPanel2, jButton6, 5,0,100,30);
			addComponent(jPanel2, jButton7, 100,0,100,30);
			addComponent(jPanel2, jButton8, 200,0,100,30);
			addComponent(jPanel2, jButton9, 300,0,100,30);
			addComponent(jPanel2, jButton10, 400,0,100,30);
			addComponent(jPanel2, jButton11, 5,60,100,30);
			addComponent(jPanel2, jButton12, 100,60,100,30);
			addComponent(jPanel2, jButton13, 200,60,100,30);
			addComponent(jPanel2, jButton14, 300,60,100,30);
			addComponent(jPanel2, jButton15, 400,60,100,30);
		
			addComponent(jPanel2, buttonOK, 200,100,100,30);
				
				
			//
			// 팝업창 정보 메시지
			//
			this.setTitle("재료 계량하기");
			this.setLocation(new Point(100, 500));
			this.setSize(new Dimension(550, 300));
		
	
		}
	

		/** Add Component Without a Layout Manager (Absolute Positioning) */
		public void addComponent(Container container,Component c,int x,int y,int width,int height)
		{
			c.setBounds(x,y,width,height);
			container.add(c);
			
		}
		
		//버튼1 수행 시 액션 및 문구
		public void jButton1_actionPerformed(ActionEvent e)
		{
			//밀가루 양이 0이하 일때
			if(myBread.flour < 0 || myBread.flour == 0)
			{
				System.out.println("\t\t\t\t\t\t밀가루가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "밀가루가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
				
			}
			else
			{
				System.out.println("\t\t\t\t\t\t밀가루 20g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_flour += myBread.click_flour;
				
			}
			
			
		//버튼2 수행 시 액션 및 문구	
		}
		public void jButton2_actionPerformed(ActionEvent e)
		{
			
			if(myBread.sugar < 0 || myBread.sugar == 0 )
			{
				System.out.println("\t\t\t\t\t\t설탕이 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "설탕이 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
				
			}
			else
			{
				System.out.println("\t\t\t\t\t\t설탕 10g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_sugar += myBread.click_sugar;
				
				
			}	
		}
		
		//버튼3 수행 시 액션 및 문구
		public void jButton3_actionPerformed(ActionEvent e)
		{
			
			if(myBread.butter < 0 || myBread.butter == 0)
			{
				System.out.println("\t\t\t\t\t\t버터가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "버터가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t버터 10g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_butter += myBread.click_butter;
				
				
			}	
	
		}
		
		//버튼4 수행 시 액션 및 문구
		public void jButton4_actionPerformed(ActionEvent e)
		{
			
			if(myBread.salt < 0 || myBread.salt == 0)
			{
				System.out.println("\t\t\t\t\t\t소금이 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "소금이 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t소금 5g을 넣었습니다");
			
				// TODO: Add any handling code here
				
				myBread.cup_salt += myBread.click_salt;
				
			}
			
		
		}
		
		//버튼5 수행 시 액션 및 문구
		public void jButton5_actionPerformed(ActionEvent e)
		{
			
			if(myBread.egg < 0 || myBread.egg == 0)
			{
				System.out.println("\t\t\t\t\t\t계란이 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "계란이 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t계란 1개를 넣었습니다");
				// TODO: Add any handling code here
				
			
				myBread.cup_egg += myBread.click_egg;
				
			}	
		
		}
		
		//버튼6 수행 시 액션 및 문구
		public void jButton6_actionPerformed(ActionEvent e)
		{
		
			if(myBread.bakingpowder < 0 || myBread.bakingpowder == 0)
			{
				System.out.println("\t\t\t\t\t\t베이킹파우더가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "베이킹파우더가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t베이킹파우더 5g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_bakingpowder += myBread.click_bakingpowder;
				
				
			}
		}
		
		//버튼7 수행 시 액션 및 문구
		public void jButton7_actionPerformed(ActionEvent e)
		{
		
			if(myBread.milk < 0 || myBread.milk == 0)
			{
				
				System.out.println("\t\t\t\t\t\t우유가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "우유가 부족합니다");

				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t우유 10g을 넣었습니다");
			
				// TODO: Add any handling code here
				
				myBread.cup_milk += myBread.click_milk;
				
				
			}
			
			
		}
		
		//버튼8 수행 시 액션 및 문구
		public void jButton8_actionPerformed(ActionEvent e)
		{
			
			if(myBread.water < 0 || myBread.water == 0)
			{
				System.out.println("\t\t\t\t\t\t물이 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "물이 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t물 20g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_water += myBread.click_water;
				
			}
		}
		
		//버튼9 수행 시 액션 및 문구
		public void jButton9_actionPerformed(ActionEvent e)
		{
			
			if(myBread.yeast < 0 || myBread.yeast == 0)
			{
				System.out.println("\t\t\t\t\t\t효모가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "효모가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t효모 5g을 넣었습니다");
				// TODO: Add any handling code here
				
				myBread.cup_yeast += myBread.click_yeast;

				
			}
			
		}
		
		//버튼10 수행 시 액션 및 문구
		public void jButton10_actionPerformed(ActionEvent e)
		{
			
			if(myBread.cream < 0 || myBread.cream == 0)
			{
				System.out.println("\t\t\t\t\t\t생크림이 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "생크림이 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			
			else
			{
				System.out.println("\t\t\t\t\t\t생크림을 100g을 담았습니다");
			
				myBread.cup_cream += myBread.click_cream;

				
			
			
			}
			// TODO: Add any handling code here
			
			
			
		}
		
		//버튼11 수행 시 액션 및 문구
		public void jButton11_actionPerformed(ActionEvent e)
		{
			
			if(myBread.strawberry < 0 || myBread.strawberry == 0)
			{
				System.out.println("\t\t\t\t\t\t딸기가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "딸기가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{	
				System.out.println("\t\t\t\t\t\t딸기 10개를 담았습니다");
				// TODO: Add any handling code here
				
				myBread.cup_strawberry += myBread.click_strawberry;
				
			}
			
		}
		
		//버튼12 수행 시 액션 및 문구
		public void jButton12_actionPerformed(ActionEvent e)
		{
			
			if(myBread.apple < 0 || myBread.apple == 0)
			{
				System.out.println("\t\t\t\t\t\t사과가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "사과가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t사과 5개를 담았습니다");
				// TODO: Add any handling code here
				
				myBread.cup_apple += myBread.click_apple;
				
			}
			
		}
		
		//버튼13 수행 시 액션 및 문구
		public void jButton13_actionPerformed(ActionEvent e)
		{
				
			if(myBread.makadamia < 0 || myBread.makadamia == 0)
			{
				System.out.println("\t\t\t\t\t\t마카다미아가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "마카다미아가 부족합니다");
			
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{	
				System.out.println("\t\t\t\t\t\t마카다미아 5개를 담았습니다");
				// TODO: Add any handling code here
				
		
				myBread.cup_makadamia += myBread.click_makadamia;
				
			}		
			
		}
		
		//버튼14 수행 시 액션 및 문구
		public void jButton14_actionPerformed(ActionEvent e)
		{
			
			if(myBread.blueberry < 0 || myBread.blueberry == 0)
			{
				System.out.println("\t\t\t\t\t\t블루베리가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "블루베리가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t블루베리 5개를 담았습니다");
			// TODO: Add any handling code here
			
				myBread.cup_blueberry += myBread.click_blueberry;
				
			}
			
		}
		
		//버튼15 수행 시 액션 및 문구
		public void jButton15_actionPerformed(ActionEvent e)
		{
	
			if(myBread.cranberry < 0 || myBread.cranberry == 0)
			{
				
				System.out.println("\t\t\t\t\t\t크랜베리가 부족합니다");
				
				//메시지 팝업창 띄우기
				JOptionPane.showMessageDialog(null, "크랜베리가 부족합니다");
				
				//메시지 팝업창 확인 클릭 후 재료 추가 구매 여부 물어보는 메소드 실행
				myMaterialCheckBox.materialCheckBox_warning();
			}
			else
			{
				System.out.println("\t\t\t\t\t\t크랜베리 5개를 담았습니다");
			
				// TODO: Add any handling code here
				

				myBread.cup_cranberry += myBread.click_cranberry;
				

			}
					
		}
		
		//버튼15 수행 시 액션 및 문구
		public void buttonOK_actionPerformed(ActionEvent e)
		{
			//buttonOK 버튼 클릭 시 팝업창 사라지게하기
			dispose();
					
		}

}
