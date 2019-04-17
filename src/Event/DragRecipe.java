/* 자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
 *

package Event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Character.Character;
import Thread.BakingImage_bread;
import Thread.BakingImage_cake;
import Thread.BakingImage_cookie;
import Thread.BakingImage_muffin;
import Thread.BakingImage_pie;

public class DragRecipe extends JFrame{
    int c=0;
    JLabel[] re=new JLabel[5];
	String recipe[] = new String[5];
	

	//빵 만드는 순서 랜덤하게 섞어주는 메소드
	public void DragRecipe(String recipe_name) {
		
		
		this.setTitle("베이킹 레서피 순서 맞추기");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(null);
	    
	    this.setSize(500,500);
	    this.setVisible(true);
	    
		if(recipe_name.contains("케잌"))
		{
			System.out.println(recipe_name);
			
			String recipe[] = {"섞기","반죽","팬닝","굽기","데코"};
		
		    
			for(int i=0; i<5; i++){
	            re[i]= new JLabel("");
	            re[i].setText(""+recipe[i]);
	            re[i].setSize(70,70);
	            int x=(int)(Math.random()*250);
	            int y=(int)(Math.random()*250);
	            re[i].setLocation(x,y);
	            re[i].addMouseListener(new MyMouseListener());
	            this.add(re[i]);
	            
	            try {
     				Thread.sleep(7000);
     			} catch (InterruptedException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     			}
	        }
			
            {
            	 
               
                BakingImage_cake cake = new BakingImage_cake();
    		    Thread Image_cake = new Thread(cake);
    		    	
    		    Image_cake.start();
			
                Character.satisfaction_taste_cake += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 딸기생크림케잌 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cake);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	

			}
			
		}
		else if(recipe_name.contains("파이"))
		{
			
			System.out.println(recipe_name);
			
			String recipe[] = {"섞기","반죽","냉장휴지","팬닝","굽기"};
		    
			for(int i=0; i<5; i++){
	            re[i]= new JLabel("");
	            re[i].setText(""+recipe[i]);
	            re[i].setSize(70,70);
	            int x=(int)(Math.random()*250);
	            int y=(int)(Math.random()*250);
	            re[i].setLocation(x,y);
	            re[i].addMouseListener(new MyMouseListener());
	            this.add(re[i]);
	            
	            try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	        }
			
		   
			
			//if("섞기 반죽 냉장휴지 팬닝 굽기".equals(type_recipe))
			{
				 
				BakingImage_pie pie = new BakingImage_pie();
			    Thread Image_pie = new Thread(pie);
			    
			    Image_pie.start();
				
				Character.satisfaction_taste_pie += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 애플파이 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_pie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
		
		}
		else if(recipe_name.contains("쿠키"))
		{
			System.out.println(recipe_name);
			
			String recipe[] = {"섞기","반죽","쿠키성형","굽기"};
			
		    
			for(int i=0; i<4; i++){
	            re[i]= new JLabel("");
	            re[i].setText(""+recipe[i]);
	            re[i].setSize(70,70);
	            int x=(int)(Math.random()*250);
	            int y=(int)(Math.random()*250);
	            re[i].setLocation(x,y);
	            re[i].addMouseListener(new MyMouseListener());
	            this.add(re[i]);
	            
	            try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
			

			//if("섞기 반죽 쿠키성형 굽기".equals(type_recipe))
			{
				
				
				BakingImage_cookie cookie = new BakingImage_cookie();
			    Thread Image_cookie = new Thread(cookie);
			    
			    Image_cookie.start();
				
				
				Character.satisfaction_taste_cookie += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 마카다미아 쿠키 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cookie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			
		}
		else if(recipe_name.contains("머핀"))
		{
		
			System.out.println(recipe_name);
			
			String recipe[] = {"섞기","반죽","팬닝","굽기"};
		
		    
			for(int i=0; i<4; i++){
	            re[i]= new JLabel("");
	            re[i].setText(""+recipe[i]);
	            re[i].setSize(70,70);
	            int x=(int)(Math.random()*250);
	            int y=(int)(Math.random()*250);
	            re[i].setLocation(x,y);
	            re[i].addMouseListener(new MyMouseListener());
	            this.add(re[i]);
	            
	            try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	        }
			
		
			
			//if("섞기 반죽 팬닝 굽기".equals(type_recipe))
			{
				
				
				BakingImage_muffin muffin = new BakingImage_muffin();
			    Thread Image_muffin = new Thread(muffin);
			    
			    Image_muffin.start();
			    
				Character.satisfaction_taste_muffin += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 블루베리 머핀 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_muffin);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			
		
		}
		else if(recipe_name.contains("식빵"))
		{
			System.out.println(recipe_name);
			
			String recipe[] = {"섞기","반죽","상온발효","빵성형하기","굽기"};
	
		    
			for(int i=0; i<5; i++){
	            re[i]= new JLabel("");
	            re[i].setText(""+recipe[i]);
	            re[i].setSize(70,70);
	            int x=(int)(Math.random()*250);
	            int y=(int)(Math.random()*250);
	            re[i].setLocation(x,y);
	            re[i].addMouseListener(new MyMouseListener());
	            this.add(re[i]);
	            
	            try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	        }
			
			
			//if("섞기 반죽 상온발효 빵성형 굽기".equals(type_recipe))
			{

				BakingImage_bread bread = new BakingImage_bread();
			    Thread Image_bread = new Thread(bread);
			    
			    Image_bread.start();
			    
		
				Character.satisfaction_taste_bread += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 크랜베리통밀식빵 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_bread);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			
		}
		
	}
    
    class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel a =(JLabel)e.getSource();
            if(re[c]==a){
                a.setVisible(false);
                c++;
                
                dispose();
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
        	
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}

*/