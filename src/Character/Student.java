package Character;
import Bread.Bread;
import Frame.Home;
import Thread.Music;
import Thread.StudentImage1;
import Thread.StudentImage2;
import Thread.StudentImage3;


public class Student extends Customer  {
	
	
	//학생 come() 메소드
	 
	@Override
	public void come(Bread myBread) {
		
		//학생 등장시 행동
		action1();
		
		//메뉴 주문을 랜덤하게 받아오는 메소드
		myBread.breadname = order();
		
		//랜덤 메뉴 - 딸기생크림케잌일 경우
		if(myBread.breadname == "딸기생크림케잌" )
		{
			if(Bread.cake > 0)
			{
				// 학생 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}
		 			
				// 학생 이미지 스레드 - 원하는 제품 있을 경우
				StudentImage2 studentimg2 = new StudentImage2();
			    Thread StudentImage2 = new Thread(studentimg2);
			    
			    StudentImage2.start();	
			    
		 			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10; 
		   
			}
			else
				
			// 학생 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname); 
			
		
		}
		else if(myBread.breadname == "애플파이" )
		{
			if(Bread.pie > 0)
			{
				// 학생 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				// 학생 이미지 스레드 - 원하는 제품 있을 경우
				StudentImage2 studentimg2 = new StudentImage2();
			    Thread StudentImage2 = new Thread(studentimg2);
			    
			    StudentImage2.start();
			    
			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
				
			}
			else
			// 학생 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
		 
			
		}		
		else if(myBread.breadname == "마카다미아쿠키" )
		{
			if(Bread.cookie > 0)
			{
				// 학생 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				// 학생 이미지 스레드 - 원하는 제품 있을 경우
				StudentImage2 studentimg2 = new StudentImage2();
			    Thread StudentImage2 = new Thread(studentimg2);
			    
			    StudentImage2.start();
			    
			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
				
			
			}
			else
			// 학생 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
			
		}
		else if(myBread.breadname == "블루베리머핀" )
		{
			if(Bread.muffin> 0)
			{
				// 학생 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
		 		
				// 학생 이미지 스레드 - 원하는 제품 있을 경우
				StudentImage2 studentimg2 = new StudentImage2();
			    Thread StudentImage2 = new Thread(studentimg2);
			    
			    StudentImage2.start();
			    
			 
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
				
			}
			else
			// 학생 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
			
		}
		else if(myBread.breadname == "크랜베리통밀식빵" )
		{
			if(Bread.bread > 0)
			{
				// 학생 음성 스레드 - 원하는 제품 있을 경우
		 		try {
		 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action1.mp3");
		 			bm.start();

		 			Thread.sleep(1);

		 		} catch (InterruptedException e) {
		 			System.out.println(e);
		 		}	
		 		
				// 학생 이미지 스레드 - 원하는 제품 있을 경우
				StudentImage2 studentimg2 = new StudentImage2();
			    Thread StudentImage2 = new Thread(studentimg2);
			    
			    StudentImage2.start();
			    
			
			    //해당 메뉴 가격 계산
				Customer.getCost(myBread.breadname);
				
				// 서비스 만족도 증가
				satisfaction_service += 10;
				
					
			}
			else
			// 학생 반응 - 원하는 제품 없을 경우
			action2(myBread.breadname);
			
				
		}
			
	}
	
	// 액션1 - 학생
	public void action1() {

		// 학생 음성 스레드 - 등장
 		try {
 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_come.mp3");
 			bm.start();

 			Thread.sleep(1);

 		} catch (InterruptedException e) {
 			System.out.println(e);
 		}	
		
		// 학생 이미지 스레드 - 등장
		StudentImage1 studentimg1 = new StudentImage1();
	    Thread StudentImage1 = new Thread(studentimg1);
	    
	    StudentImage1.start();	
	    
	
		
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.printf("\t\t\t\t\t\t" +"[" + count_customer +"]"+"번째 손님입니다\r");	
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t[학생]");

		System.out.println("\t\t\t\t\t\t이런 곳이 있었다니..빨리 학교 가야겠지만");
		System.out.println("");
		
		System.out.println("\t\t\t\t\t\t뭔가 달고 맛있는거 먹고싶은데 트렌디한거 없나?");
		System.out.println("");
		System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
	}
	
	// 액션2 - 학생
	public void action2(String breadname) {
		
		// 빵 수량이 0개 이하일 경우 반응
		if(Bread.cake == 0 || Bread.cake < 0 || Bread.pie == 0 ||Bread.pie < 0 ||Bread.cookie<0 || Bread.cookie==0 ||Bread.muffin==0 ||Bread.muffin<0 ||Bread.bread==0||Bread.bread<0)
		{
			 // 학생 음성 스레드 - 원하는 제품 없을 경우
	 		try {
	 		    Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\student_action2.mp3");
	 			bm.start();

	 			Thread.sleep(1);

	 		} catch (InterruptedException e) {
	 			System.out.println(e);
	 		}	
	 		
			 // 학생 이미지 스레드 - 원하는 제품 없을 경우
			StudentImage3 studentimg3 = new StudentImage3();
		    Thread StudentImage3 = new Thread(studentimg3);
		    
		    StudentImage3.start();	
		    
		
		    //학생 원하는 제품 없을 때 출력문

			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			System.out.println("\t\t\t\t\t\t아 없다구요?!ㅜㅜ");
			System.out.println("\t\t\t\t\t\t아..그렇구나...");
			
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		

			
			//sleep() 쓰레드로 효과주기
			int num = 3;
		 	
		 	for(int i=0; i<num; i++) {
		 		System.out.println("\t\t\t\t\t\t\t\t.");
		 		
		 		try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	}
		 	System.out.println("\t\t\t\t\t\t\t쭈.뼛.쭈.뼛");
			 System.out.println("\t\t\t\t\t\t\t   쭈.뼛.쭈.뼛");
			 
			 for(int i=0; i<num; i++) {
			 		System.out.println("\t\t\t\t\t\t\t\t.");
			 		
			 		try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}
			 
			
				System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
	
			 System.out.println("\t\t\t\t\t\t저..학교 가야해서 가볼게요~ 안녕히계세요");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t서비스 만족도가 [5] 감소했습니다\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────\r");		

			 System.out.println("");
				System.out.println("");
				System.out.println("");
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//서비스 만족도 하락

				satisfaction_service -= 5;
		}
		
		else 
		{
			return;
		}
			
	}
	
	
		
}
