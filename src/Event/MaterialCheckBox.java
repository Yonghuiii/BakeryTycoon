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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
 

public class MaterialCheckBox extends JFrame 

{
	//필요 객체 생성 부분

	BuyMaterial myBuyMaterial = new BuyMaterial();
	
	//판넬 담는 변수 선언
	private JPanel contentPane;
		
	//판넬 변수 선언
	private JPanel jPanel1;
	
	private JButton check1;

	private JButton check2;
	
	private JLabel label1;

	
	
	// 팝업창 좌표값 및 사이즈
	int x = 10;
	int y = 10;
	int s_x = 10;
	int s_y = 10;
	int width = 80;
	int height = 20;

	

	public MaterialCheckBox() {
	
		super();
		initializeComponent();
		
		
	}
	
	//컴포넌트 초기화
	public void initializeComponent()
	{
		contentPane = (JPanel)this.getContentPane();
	        
		jPanel1 = new JPanel();
		
		
		//원하는 위치에 레이아웃 설정
		jPanel1.setLayout(new BorderLayout()); 
		
		
		
		check1 = new JButton();
		
        // check1 버튼이 눌러지면 발생하는 행동을 정의
		check1.addActionListener(new ActionListener() {
           
        	@Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            	check1_actionPerformed(e);
           	
            	
            }
            
        });
		
		check2 = new JButton();
		
        // check2 버튼이 눌러지면 발생하는 행동을 정의
		check2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            	check2_actionPerformed(e);
            	
            
            }
          });
		
		
	}
		
	/** Add Component Without a Layout Manager (Absolute Positioning) */

	public void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//재료 부족시 구매 의사결정 팝업창을 띄우는 메서드
	public void materialCheckBox_warning() {
	        
		
			JPanel MainContainer = new JPanel();
		   
			setContentPane(MainContainer);
		
		    JLabel label1 = new JLabel("재료가 부족합니다. 구매하시겠습니까?\n\n\n",SwingConstants.CENTER);
		    
		 
			// 팝업창 정보 메시지
			//
			this.setTitle("재료 구매 알림");
			this.setLocation(new Point(100, 1000));
			this.setSize(new Dimension(500, 100));
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			
			 //판넬 상단 색상 
			jPanel1.setLayout(null);
			jPanel1.setBackground(new Color(255,235,205));
				
			contentPane.setLayout(null);
			addComponent(contentPane, jPanel1, 5,10,700,100);
		
		    
		    //판넬 상단 버튼 추가
			addComponent(jPanel1, check1, 100,200,100,25);
			
			//판넬 상단 버튼 추가
			addComponent(jPanel1, check2, 400,200,100,25);
			
			
		       
			check1.setText("예");
	        check1.setBackground(new Color(255,192,203));
	       
	        
	        check2.setText("아니오");
	        check2.setBackground(new Color(255,192,203));
	       
		     
	      
	        MainContainer.add(label1);
	        MainContainer.add(check1,BorderLayout.SOUTH);
	        MainContainer.add(check2,BorderLayout.SOUTH);
	    
	}
	
	//check1-'예' 버튼 수행 시 액션 및 문구
	public void check1_actionPerformed(ActionEvent e)
	{
		//재료를 추가구매하는 재료 체크박스 메서드로 이동
		myBuyMaterial.checkMaterial();
		
		dispose();
		
	}
	
	//check2- '아니오' 버튼 수행 시 액션 및 문구
	public void check2_actionPerformed(ActionEvent e)
	{
		//사라짐
		dispose(); 
		
	}

}
