package Character;

import Bread.Bread;
import Frame.Home;
import Thread.GrandfaImage1;
import Thread.GrandfaImage2;
import Thread.GrandfaImage3;
import Thread.Music;

public class Grandfa extends Customer {
	
 
	
	//할아버지 come() 메소드
	@Override
	public void come(Bread myBread) {
		
		//할아버지 등장시 행동
		action1();
		
		//메뉴 주문을 랜덤하게 받아오는 메소드
		myBread.breadname = order();
		
		//랜덤 메뉴 - 딸기생크림케잌일 경우
		if(myBread.breadname == "딸기생크림케잌" ) 
		{
			
			if(Bread.cake > 0)
			{
				
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				 // 할아버지 이미지 스레드 - 원하는 제품 있을 경우
				GrandfaImage2 grandfaimg2 = new GrandfaImage2();
			    Thread GrandfaImage2 = new Thread(grandfaimg2);
			    
			    GrandfaImage2.start();	
			    
			   
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5; 
				
					
			}
			else
			
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname); 
			
				
		}
		//랜덤 메뉴 - 애플파이일 경우
		else if(myBread.breadname == "애플파이" )
		{
			if(Bread.pie > 0)
			{
			
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}
		 		
				 // 할아버지 이미지 스레드 - 원하는 제품 있을 경우

				GrandfaImage2 grandfaimg2 = new GrandfaImage2();
			    Thread GrandfaImage2 = new Thread(grandfaimg2);
			    
			    GrandfaImage2.start();
			    
				
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 5; 
				
						
			    
			}
			else
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
		   
		}	
		//랜덤 메뉴 - 마카다미아쿠키 경우
		else if(myBread.breadname == "마카다미아쿠키" )
		{
			if(Bread.cookie > 0)
			{
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}
		 		
				 // 할아버지 이미지 스레드 - 원하는 제품 있을 경우
				GrandfaImage2 grandfaimg2 = new GrandfaImage2();
			    Thread GrandfaImage2 = new Thread(grandfaimg2);
			    
			    GrandfaImage2.start();
			    
			 	
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
					
			   
			}
			else 
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
		   
		}
		//랜덤 메뉴 - 블루베리머핀 경우
		else if(myBread.breadname == "블루베리머핀" )
		{
			if(Bread.muffin > 0)
			{
				
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				 // 할아버지 이미지 스레드 - 원하는 제품 있을 경우
				GrandfaImage2 grandfaimg2 = new GrandfaImage2();
			    Thread GrandfaImage2 = new Thread(grandfaimg2);
			    
			    GrandfaImage2.start();
			    
			 
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
			
					
			}
			    
			else
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
				
		}
		//랜덤 메뉴 - 크랜베리통밀식빵 경우
		else if(myBread.breadname == "크랜베리통밀식빵" )
		{
			if(Bread.bread > 0)
			{
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				 // 할아버지 이미지 스레드 - 원하는 제품 있을 경우
				GrandfaImage2 grandfaimg2 = new GrandfaImage2();
			    Thread GrandfaImage2 = new Thread(grandfaimg2);
			    
			    GrandfaImage2.start();
			    
			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
					
			 
			}
			else
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
			
		}
	}
			
	
	// 액션1 - 할아버지
	public static void action1() {
	
		// 할아버지 음성 스레드 - 등장
 		try {
 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_come.mp3");
 			bm.start();

 			Thread.sleep(1);

 		} catch (InterruptedException e) {
 			System.out.println(e);
 		}		
	
		// 할아버지 이미지 스레드 - 등장
		GrandfaImage1 grandfaimg1 = new GrandfaImage1();
	    Thread GrandfaImage1 = new Thread(grandfaimg1);
	    
	    GrandfaImage1.start();		
		
	    //할아버지 등장 출력문
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.printf("\t\t\t\t\t\t" +"[" + count_customer +"]"+"번째 손님입니다\r");	
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t[할아버지]");
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t허허, 못보던 곳이구만?!");
		System.out.println("");
	
		System.out.println("\t\t\t\t\t\t시간도 많은데, 잠시 구경 좀 하지");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}	
	
	// 액션2 - 할아버지 
	public void action2(String breadname) {
		
		// 빵 수량이 0개 이하일 경우 반응
		if(Bread.cake == 0 || Bread.cake < 0 || Bread.pie == 0 ||Bread.pie < 0 ||Bread.cookie<0 || Bread.cookie==0 ||Bread.muffin==0 ||Bread.muffin<0 ||Bread.bread==0||Bread.bread<0)
		{	
			
			
			 // 할아버지 음성 스레드 - 원하는 제품 없을 경우
	 		try {
	 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\grandfa_action2.mp3");
	 			bm.start();

	 			Thread.sleep(1);

	 		} catch (InterruptedException e) {
	 			System.out.println(e);
	 		}	
	 		
			// 할아버지 이미지 스레드 - 원하는 제품 없을 경우
			GrandfaImage3 grandfaimg3 = new GrandfaImage3();
		    Thread GrandfaImage3 = new Thread(grandfaimg3);
		    
		    GrandfaImage3.start();	
		    
		    //할아버지 원하는 제품 없을 때 출력문
			
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("\t\t\t\t\t\t허허, 없어도 괜찮네~젊은이");
			System.out.println("\t\t\t\t\t\t허허, 난 여유로운 사람이니 기다려주지~");
			
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			//sleep() 쓰레드로 기다리는 효과주기
			int num = 3;
		 	
		 	for(int i=0; i<num; i++) {
		 		System.out.println("\t\t\t\t\t\t\t\t.");
		 		
		 		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	}
			 System.out.println("\t\t\t\t\t\t\t    기다리는 중");
			 
			 for(int i=0; i<num; i++) {
			 		System.out.println("\t\t\t\t\t\t\t\t.");
			 		
			 		try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}

				System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("\t\t\t\t\t\t아니~ 뭐 이렇게 손이 느려서 장사하겠나? 쯧쯧, 이만 가지");
			
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t서비스 만족도가 [5] 감소했습니다\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 증가했습니다\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			//sleep() 쓰레드로 시간 지연시키기 
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			//제빵사 스트레스 지수 상승
			 Baker.stress += 10;	
			
			 //서비스 만족도 하락
			 satisfaction_service -= 5;
			 
			}
		
		else 
		{
			return;
		}

	}



}


