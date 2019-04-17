package Event;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Bread.Bread;
import Character.Baker;
import Character.Character;

class BuyMaterial extends JFrame implements ActionListener{

	
	//필요 객체 생성 부분

	Character myCharacter = new Character();

	Baker myBaker = new Baker();
	
	Bread myBread = new Bread();
	
	// 팝업창 좌표값 및 사이즈
	int x = 100;
	int y = 100;
	int s_x = 80;
	int s_y = 80;
	int width = 80;
	int height = 20;
	
	
	//판넬 담는 변수 선언
	private JPanel contentPane;
	
	private JButton buttonOK;
	private JCheckBox flour, sugar, butter,salt,egg,bakingpowder,milk,strawberry,apple,makadamia,blueberry,cranberry,yeast,water,cream;
	 
	public void checkMaterial() {
	  // TODO Auto-generated constructor stub
	  setTitle("체크박스 테스트");
	  setSize(400, 200);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  this.setLocationRelativeTo(null);
	  this.setVisible(true);
	  
	  JLabel label = new JLabel("무슨 재료를 추가 구매하시겠습니까?");
	  JPanel toPanel = new JPanel();
	  toPanel.add(label);
	  add(toPanel, BorderLayout.NORTH);
	  
	 // addComponent(contentPane, toPanel, 5,10,700,100);
	  
	  JPanel panel = new JPanel();
	  flour = new JCheckBox("밀가루");
	  panel.add(flour);
	  sugar = new JCheckBox("설탕");
	  panel.add(sugar);
	  butter = new JCheckBox("버터");
	  panel.add(butter);
	  salt = new JCheckBox("소금");
	  panel.add(salt);
	  egg = new JCheckBox("계란");
	  panel.add(egg);
	  bakingpowder = new JCheckBox("베이킹파우더");
	  panel.add(bakingpowder);
	  milk = new JCheckBox("우유");
	  panel.add(milk);
	  strawberry = new JCheckBox("딸기");
	  panel.add(strawberry);
	  apple = new JCheckBox("사과");
	  panel.add(apple);
	  makadamia = new JCheckBox("마카다미아");
	  panel.add(makadamia);
	  blueberry = new JCheckBox("블루베리");
	  panel.add(blueberry);
	  cranberry = new JCheckBox("크랜베리");
	  panel.add(cranberry);
	  yeast = new JCheckBox("효모");
	  panel.add(yeast);
	  water = new JCheckBox("물");
	  panel.add(water);
	  cream = new JCheckBox("크림");
	  panel.add(cream);
	
	  add(panel, BorderLayout.CENTER);
	  
	  buttonOK = new JButton("OK");
	  JPanel buttonPanel = new JPanel();
	  buttonPanel.add(buttonOK);
	  add(buttonPanel, BorderLayout.SOUTH);
	  buttonOK.addActionListener(this);
	  
	  setVisible(true);
	 }
 
	public void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  // TODO Auto-generated method stub
	  if(e.getSource() == buttonOK){
	   String msg = "";
	   if(flour.isSelected())
	    {
		   msg+="밀가루 ";
		   
		   myBread.flour += 100;
		   
		  // myBaker.moneyMaterial += myCharacter.moneyBread;
		   
		   myBaker.moneyBread -= 1000;
	    }

	   if(sugar.isSelected())
	   {
		   msg+="설탕 ";
		   
		   myBread.sugar += 50;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(butter.isSelected())
	   {
		   msg+="버터 ";
		   
		   myBread.butter += 50;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(salt.isSelected())
	   {
		   msg+="소금 ";
		   
		   myBread.salt += 50;
		   
		//  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(egg.isSelected())
	   {
		   msg+="계란 ";
		   
		   myBread.egg += 2;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(bakingpowder.isSelected())
	   {
		   msg+="베이킹파우더 ";
		   
		   myBread.bakingpowder += 50;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(milk.isSelected())
	   {
		   msg+="우유 ";
		   
		   myBread.milk += 50;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(strawberry.isSelected())
	   {
		   msg+="딸기 ";
		   
		   myBread.strawberry += 5;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(apple.isSelected())
	    {
		   msg+="사과 ";
		   
		   myBread.apple += 5;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	    }
	   if(makadamia.isSelected())
	   {
		   msg+="마카다미아 ";
		   
		   myBread.makadamia += 5;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(blueberry.isSelected())
	   {
		   msg+="블루베리 ";
		   
		   myBread.blueberry += 5;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(cranberry.isSelected())
	   {
		   msg+="크랜베리 ";
		   
		   myBread.cranberry += 5;
		   
		 //  myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(yeast.isSelected())
	    {
		   msg+="효모 ";
		   
		   myBread.yeast += 10;
		   
		//   myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	    }
	   if(water.isSelected())
	   {
		   msg+="물 ";
		   
		   myBread.water += 50;
		   
		//   myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }
	   if(cream.isSelected())
	   {
		   msg+="크림 ";
		   
		   myBread.apple += 100;
		   
		//   myBaker.moneyMaterial += myCharacter.moneyBread;

		   myBaker.moneyBread -= 1000;
	   }

	   System.out.println("");
	   System.out.println("");
	   msg = "< 다음 재료를 추가구매했습니다 >\n"+"\t\t\t\t\t\t"+msg;
	   System.out.println("\t\t\t\t\t\t"+msg);
	   System.out.println("");
	   System.out.println("\t\t\t\t\t\t<현재"+myBaker.moneyBread+"남았습니다.>");
	   System.out.println("");
	   System.out.println("");
	
	   
	   //초기 체크버튼 상태 해제 
	   flour.setSelected(false);
	   sugar.setSelected(false);
	   butter.setSelected(false);
	   salt.setSelected(false);
	   egg.setSelected(false);
	   bakingpowder.setSelected(false);
	   milk.setSelected(false);
	   strawberry.setSelected(false);
	   apple.setSelected(false);
	   makadamia.setSelected(false);
	   blueberry.setSelected(false);
	   cranberry.setSelected(false);
	   yeast.setSelected(false);
	   water.setSelected(false);
	   cream.setSelected(false);
	  }
	  
	  dispose();
	  
	 }
 
}

