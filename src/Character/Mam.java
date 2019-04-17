package Character;

import Bread.Bread;
import Frame.Home;
import Thread.MamImage1;
import Thread.MamImage2;
import Thread.MamImage3;
import Thread.Music;

public class Mam extends Customer{



	//아줌마 come() 메소드
	@Override
	public void come(Bread myBread) {

		//아줌마 등장시 행동
		action1();
		
		//메뉴 주문을 랜덤하게 받아오는 메소드
		myBread.breadname = order();
		
		//랜덤 메뉴 - 딸기생크림케잌일 경우
		if(myBread.breadname == "딸기생크림케잌" )
		{
			if(Bread.cake > 0)
			{
				// 아줌마 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				// 아줌마 이미지 스레드 - 원하는 제품 있을 경우
				MamImage2 mamImg2 = new MamImage2();
			    Thread mamImage2 = new Thread(mamImg2);
			    
			    mamImage2.start();
			    
			 
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10; 
				
					
			
			}
			else
			// 할아버지 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname); 
			
		
		}
		else if(myBread.breadname == "애플파이" )
		{
			if(Bread.pie > 0)
			{
				 // 할아버지 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
			    
				// 할아버지 이미지 스레드 - 원하는 제품 있을 경우
				MamImage2 mamImg2 = new MamImage2();
			    Thread mamImage2 = new Thread(mamImg2);
			    
			    mamImage2.start();
			    
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
			

			}
			else
				
			// 아줌마 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
	  
		}		
		else if(myBread.breadname == "마카다미아쿠키" )
		{
			if(Bread.cookie > 0)
			{
				 // 아줌마 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				// 아줌마 이미지 스레드 - 원하는 제품 있을 경우
				MamImage2 mamImg2 = new MamImage2();
			    Thread mamImage2 = new Thread(mamImg2);
			    
			    mamImage2.start();
			    
			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
			
			}
			else
			// 아줌마 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
		
		}
		//랜덤 메뉴 - 블루베리머핀 경우
		else if(myBread.breadname == "블루베리머핀" )
		{
			if(Bread.muffin > 0)
			{
				 // 아줌마 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}
		 		
				 // 아줌마 이미지 스레드 - 원하는 제품 있을 경우
				MamImage2 mamImg2 = new MamImage2();
			    Thread mamImage2 = new Thread(mamImg2);
			    
			    mamImage2.start();
			    
			 	
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
				
			}
			else
			// 아줌마 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
		}
		//랜덤 메뉴 - 크랜베리통밀식빵 경우
		else if(myBread.breadname == "크랜베리통밀식빵" )
		{
			if(Bread.bread > 0)
			{
				 // 아줌마 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				 // 아줌마 이미지 스레드 - 원하는 제품 있을 경우
				MamImage2 mamImg2 = new MamImage2();
			    Thread mamImage2 = new Thread(mamImg2);
			    
			    mamImage2.start();
			    
			 
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
			   
			}
			else
				
			// 아줌마 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
		}
	
	}

	// 액션1 - 아줌마
	
	public void action1() {
		
		// 아줌마 음성 스레드 - 등장
 		try {
 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_come.mp3");
 			bm.start();

 			Thread.sleep(1);

 		} catch (InterruptedException e) {
 			System.out.println(e);
 		}	
		
		// 아줌마 이미지 스레드 - 등장
		MamImage1 mamImg1 = new MamImage1();
	    Thread mamImage1 = new Thread(mamImg1);
	    
	    mamImage1.start();	
	    
	
	    
	    //아줌마 등장 출력문
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.printf("\t\t\t\t\t\t" +"[" + count_customer +"]"+"번째 손님입니다\r");	
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t[아줌마]");

		System.out.println("\t\t\t\t\t\t어머~ 이동네에 이런 곳이 있었네");
		System.out.println("");
		
		System.out.println("\t\t\t\t\t\t심심한데, 잠깐 구경 좀 할까");
		System.out.println("");
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
	}
	
	// 액션2 - 아줌마
	public void action2(String breadname) {
	
		// 빵 수량이 0개 이하일 경우 반응
		if(Bread.cake == 0 || Bread.cake < 0 || Bread.pie == 0 ||Bread.pie < 0 ||Bread.cookie<0 || Bread.cookie==0 ||Bread.muffin==0 ||Bread.muffin<0 ||Bread.bread==0||Bread.bread<0)
		{
			 // 아줌마 음성 스레드 - 원하는 제품 없을 경우
	 		try {
	 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\mam_action2.mp3");
	 			bm.start();

	 			Thread.sleep(1);

	 		} catch (InterruptedException e) {
	 			System.out.println(e);
	 		}	
			 
			 // 아줌마 이미지 스레드 - 원하는 제품 없을 경우
			MamImage3 mamImg3 = new MamImage3();
		    Thread mamImage3 = new Thread(mamImg3);
		    
		    mamImage3.start();
		    
		    //아줌마 원하는 제품 없을 때 출력문
		    
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("\t\t\t\t\t\t응? 없다구??");
			System.out.println("\t\t\t\t\t\t어머나 저런,, 어쩔 수 없지뭐~ ");
			System.out.println("\t\t\t\t\t\t잠시만 내 얘기 좀 들어봐봐요 ");
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
			 System.out.println("\t\t\t\t\t\t\t  (수다수다)	 (수다수다)");
			 System.out.println("\t\t\t\t\t\t(수다수다)	(수다수다)	    (수다수다)");
			 for(int i=0; i<num; i++) {
			 		System.out.println("\t\t\t\t\t\t\t\t.");
			 		
			 		try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}

			 System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			 System.out.println("\t\t\t\t\t\t어머,빵은 못사고 한참 수다만 떨다 가네요. 그럼 수고해요~");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t서비스 만족도가 [10] 감소했습니다\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 증가했습니다\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		

			 System.out.println("");
				System.out.println("");
				System.out.println("");
			
				//sleep() 쓰레드로 시간 지연시키기 

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			//제빵사 스트레스 지수 상승
			 Baker.stress += 10;
			 
			 //서비스 만족도 하락

			 satisfaction_service -= 10;
		}
		
		else 
		{
			return;
		}

	}

	

	
}
