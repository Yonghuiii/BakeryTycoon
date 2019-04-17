package Character;

import Bread.Bread;
import Frame.Home;
import Thread.Music;
import Thread.WorkerImage1;
import Thread.WorkerImage2;
import Thread.WorkerImage3;

public class Worker extends Customer {
	
	
	
	//직장인 come() 메소드
	
	@Override
	public void come(Bread myBread) {
	
		//직장인 등장시 행동
		action1();
		
		//메뉴 주문을 랜덤하게 받아오는 메소드
		myBread.breadname = order();
		
		
		//랜덤 메뉴 - 딸기생크림케잌일 경우
		if(myBread.breadname == "딸기생크림케잌" ) 
		{
			if(Bread.cake > 0)
			{
				// 직장인 음성 스레드 - 원하는 제품 있을 경우
		  		try {
		  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action1.mp3");
		  			bm.start();

		  			Thread.sleep(1);

		  		} catch (InterruptedException e) {
		  			System.out.println(e);
		  		}	
		  		
		  		
				// 직장인 이미지 스레드 - 원하는 제품 있을 경우

				WorkerImage2 workerimg2 = new WorkerImage2();
			    Thread WorkerImage2 = new Thread(workerimg2);
			    
			    WorkerImage2.start();
			    
			 
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5; 
				
				
			  
			}
			else
			// 직장인 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname); 
			
				
		   
		}
		
		//랜덤 메뉴 - 애플파이일 경우
		else if(myBread.breadname == "애플파이" ) 
		{
			if(Bread.pie > 0)
			{
				// 직장인 음성 스레드 - 원하는 제품 있을 경우
		  		try {
		  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action1.mp3");
		  			bm.start();

		  			Thread.sleep(1);

		  		} catch (InterruptedException e) {
		  			System.out.println(e);
		  		}	
		  		
				// 직장인 이미지 스레드 - 원하는 제품 있을 경우

				WorkerImage2 workerimg2 = new WorkerImage2();
			    Thread WorkerImage2 = new Thread(workerimg2);
			    
			    WorkerImage2.start();
			    
			    
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
				
			 
			}
			else
				
			// 직장인 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
			
			
		}	
		
		//랜덤 메뉴 - 마카다미아쿠키일 경우
		else if(myBread.breadname == "마카다미아쿠키" ) 
		{
			if(Bread.cookie > 0)
			{
				// 직장인 음성 스레드 - 원하는 제품 있을 경우
		  		try {
		  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action1.mp3");
		  			bm.start();

		  			Thread.sleep(1);

		  		} catch (InterruptedException e) {
		  			System.out.println(e);
		  		}	
		  		
				// 직장인 이미지 스레드 - 원하는 제품 있을 경우

				WorkerImage2 workerimg2 = new WorkerImage2();
			    Thread WorkerImage2 = new Thread(workerimg2);
			    
			    WorkerImage2.start();
			    
			   
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
					
				
			}
			else
			// 직장인 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
			
		}
		//랜덤 메뉴 - 블루베리머핀일 경우
		else if(myBread.breadname == "블루베리머핀" ) 
		{
			if(Bread.muffin > 0)
			{
				// 직장인 음성 스레드 - 원하는 제품 있을 경우
		  		try {
		  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action1.mp3");
		  			bm.start();

		  			Thread.sleep(1);

		  		} catch (InterruptedException e) {
		  			System.out.println(e);
		  		}	
		  		
				// 직장인 이미지 스레드 - 원하는 제품 있을 경우

				WorkerImage2 workerimg2 = new WorkerImage2();
			    Thread WorkerImage2 = new Thread(workerimg2);
			    
			    WorkerImage2.start();
			    
			    
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
			  
			}
			else
			// 직장인 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
			
			
		}
		//랜덤 메뉴 - 크랜베리통밀식빵일 경우
		else if(myBread.breadname == "크랜베리통밀식빵" )
		{
			if(Bread.bread > 0)
			{
				// 직장인 음성 스레드 - 원하는 제품 있을 경우
		  		try {
		  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action1.mp3");
		  			bm.start();

		  			Thread.sleep(1);

		  		} catch (InterruptedException e) {
		  			System.out.println(e);
		  		}	
		  		
				// 직장인 이미지 스레드 - 원하는 제품 있을 경우
				WorkerImage2 workerimg2 = new WorkerImage2();
			    Thread WorkerImage2 = new Thread(workerimg2);
			    
			    WorkerImage2.start();
			    
			   
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname); 
				
				// 서비스 만족도 증가
				satisfaction_service += 5;
				
				
			}
			else
			// 직장인 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
		}

	}
	

	// 액션1 - 직장인
	
	public void action1() {
		
		// 직장인 음성 스레드 - 등장
  		try {
  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_come.mp3");
  			bm.start();

  			Thread.sleep(1);

  		} catch (InterruptedException e) {
  			System.out.println(e);
  		}	
		 
		// 직장인 이미지 스레드 - 등장
		WorkerImage1 workerimg1 = new WorkerImage1();
	    Thread WorkerImage1 = new Thread(workerimg1);
	    
	    WorkerImage1.start();
	    
	 
	    
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.printf("\t\t\t\t\t\t" +"[" + count_customer +"]"+"번째 손님입니다\r");	
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t[직장인]");
	
		System.out.println("\t\t\t\t\t\t빨리 가야겠네, 이러다 업무 늦겠어");
		System.out.println("");
		
		System.out.println("\t\t\t\t\t\t가는 길에 회사 동료들이랑 먹을 간식 좀 사가야겠어 ");
		System.out.println("");
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
	}
	
	//액션2 - 직장인
	
	public void action2(String breadname) {
		
		// 빵 수량이 0개 이하일 경우 반응
		if(Bread.cake == 0 || Bread.cake < 0 || Bread.pie == 0 ||Bread.pie < 0 ||Bread.cookie<0 || Bread.cookie==0 ||Bread.muffin==0 ||Bread.muffin<0 ||Bread.bread==0||Bread.bread<0)
		{
			 // 직장인 음성 스레드 - 원하는 제품 없을 경우
	  		try {
	  		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\worker_action2.mp3");
	  			bm.start();

	  			Thread.sleep(1);

	  		} catch (InterruptedException e) {
	  			System.out.println(e);
	  		}	
	  		
			 // 직장인 이미지 스레드 - 원하는 제품 없을 경우

			WorkerImage3 workerimg3 = new WorkerImage3();
		    Thread WorkerImage3 = new Thread(workerimg3);
		    
		    WorkerImage3.start();
		    
		    
		    //직장인 원하는 제품 없을 때 출력문

			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("\t\t\t\t\t\t아 없다구요?!ㅜㅜ");
			System.out.println("\t\t\t\t\t\t에이~어쩔 수 없네요~저는 이만! 수고하세요");

			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			//sleep() 쓰레드로 효과주기
			int num = 3;
		 	
		 	for(int i=0; i<num; i++) {
		 		System.out.println("\t\t\t\t\t\t\t\t~");
		 		
		 		try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	}
			 System.out.println("\t\t\t\t\t\t\t후다닥~ 후다닥~");
			 System.out.println("\t\t\t\t\t\t\t   후다닥~ 후다닥~");
			 for(int i=0; i<num; i++) {
			 		System.out.println("\t\t\t\t\t\t\t\t~");
			 		
			 		try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}
			 
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t서비스 만족도가 [10] 감소했습니다\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//서비스 만족도 하락

				 satisfaction_service -= 10;

		}
		
		else 
		{
			return;
		}
			
	}

	

	
}