package Frame;
import Bread.Bread;
import Character.Baker;
import Character.Character;
import Character.Customer;
import Thread.Music;

public class End {

	
	//필요 객체 생성 부분
	Bread myBread = new Bread();
	Character myCharacter = new Character();
	Baker myBaker = new Baker(); 
	
	
	//결과 발표 ★ 찍는 숫자 변수
	private int num = 2;
 	private int i;
 	
 	
 	public void End() {
 		
 	 	
 		//결과 발표 효과음 스레드 
		 try {
				
	            Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\Happy end sound effect.mp3");
	            bm.start();
	           
	            //bm.play();
	            
	            
	            Thread.sleep(1000);
	          
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		System.out.println("\t\t\t\t\t과연 오늘 3시간 동안 베이커리 운영 결과는???");
	 	
		for(i=0; i<num; i++) {
		 		System.out.println("\t\t\t\t\t\t\t★");
		 		System.out.println("\t\t\t\t\t\t\t☆");
		 		for(int j=0;j<num;j++)
		 		{
		 			System.out.println("\t\t\t\t\t\t\t★");
		 			System.out.println("\t\t\t\t\t\t\t☆");
		 			try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 		}
		 }
	
		 
		 for(i=0; i<num; i++) {
		 		
		 		System.out.println("\t\t\t\t\t\t\t★");
		 		System.out.println("\t\t\t\t\t\t\t☆");
		 		for(int j=0;j<num;j++)
		 		{
		 			System.out.println("\t\t\t\t\t\t\t★");
		 			System.out.println("\t\t\t\t\t\t\t☆");
		 			
		 			try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 		}
		 }
		// 최종 결과 출력문
		System.out.printf("\t\t         ================================================================================\r");
	
		System.out.println("\t\t\t\t\t\t[매출]과 [만족도]는 아래와 같습니다 ");
		System.out.printf("\t\t         ================================================================================\r");
		System.out.println("\t\t\t\t\t\t=금액 :" + myCharacter.moneyBread + "입니다");
		System.out.println("\t\t\t\t\t\t=만족도(맛) :" + Character.satisfaction_taste + "입니다");
		System.out.println("\t\t\t\t\t\t=만족도(서비스) :" + Customer.satisfaction_service + "입니다");
		System.out.printf("\t\t         ================================================================================\r");

		//운영 성공시
		if(myCharacter.moneyBread > 10000 || myCharacter.moneyBread == 10000 )
		{	
			myCharacter.moneyBread *=2;
	
			
			System.out.println("\t Y88b   d88P                   d8b                      888888b.          d8888 888    d8P  8888888888 8888888b.  "); 
			System.out.println("	Y88b d88P                    88P                      888   88b        d88888 888   d8P   888        888   Y88b "); 
			System.out.println("	 Y88o88P                     8P                       888  .88P       d88P888 888  d8P    888        888    888 "); 
			System.out.println("	  Y888P     .d88b.  888  888     888d888  .d88b.      8888888K.      d88P 888 888d88K     8888888    888   d88P "); 
			System.out.println(" 	   888     d88  88b 888  888     888P    d8P  Y8b     888   Y88b    d88P  888 8888888b    888        8888888P   "); 
			System.out.println("	   888     888  888 888  888     888     88888888     888    888   d88P   888 888  Y88b   888        888 T88b   "); 
			System.out.println("	   888     Y88..88P Y88b 888     888     Y8b.         888   d88P  d8888888888 888   Y88b  888        888  T88b  ");
			System.out.println("	   888       Y88P     Y88888     888       Y8888      8888888P   d88P     888 888    Y88b 8888888888 888   T88b ");
                                              
		
			System.out.printf("\t\t         ================================================================================\r");
			
			System.out.println("\t\t\t\t\t\t축하합니다. 베이커리를 성공적으로 운영하셨네요");
			System.out.println("\t\t\t\t\t\t다음에도 베이커리를 운영할 기회와 상금" + myCharacter.moneyBread + "을 드립니다\r");
			System.out.printf("\t\t         ================================================================================\r");
	
		}
		//운영 실패시ㅜ
		else 
		{
		System.out.printf("\t\t         ================================================================================\r");
	

           

		System.out.println("		 .d8888b.   .d88888b.   .d88888b.  8888888b.        888888  .d88888b.  888888b.  "); 
		System.out.println("		 d88P  Y88b d88P   Y88b d88P   Y88b 888   Y88b          88b d88P   Y88b 888   88b");  
		System.out.println("		 888    888 888     888 888     888 888    888          888 888     888 888  .88P");  
		System.out.println("		 888        888     888 888     888 888    888          888 888     888 8888888K.");  
		System.out.println("		 888  88888 888     888 888     888 888    888          888 888     888 888   Y88b"); 
		System.out.println("		 888    888 888     888 888     888 888    888          888 888     888 888    888"); 
		System.out.println("		 Y88b  d88P Y88b. .d88P Y88b. .d88P 888  .d88P          88P Y88b. .d88P 888   d88P"); 
		System.out.println("		   Y8888P88   Y88888P     Y88888P   8888888P            888   Y88888P   8888888P  "); 
		System.out.println("                                             				.d88P                        	");
		System.out.println("                                          				.d88P                        		"); 
		System.out.println("                                         			    888P                            	");        
                  
         
		
		
		System.out.println("\t\t\t\t\t\t오늘 하루 즐거우셨나요?");
		System.out.println("\t\t\t\t\t\t스트레스 지수가 " + myBaker.stress + " 체력 지수가 " + myBaker.health + " 네요");
		System.out.println("\t\t\t\t\t\t고생하셨습니다~ 집에 조심히 돌아가세요");
		System.out.printf("\t\t         ================================================================================\r");
		System.out.println("\t\t\t\t\t\t선물로 오늘 직접 만드신 빵을 드립니다");
		System.out.printf("\t\t         ================================================================================\r");
		System.out.println("\t\t\t\t\t\t딸기생크림케잌 " +"["+ myBread.cake +"]"+"판");
		System.out.println("\t\t\t\t\t\t애플파이 " +"["+ myBread.pie +"]"+"판");
		System.out.println("\t\t\t\t\t\t마카다미아쿠키 " +"["+ myBread.cookie +"]"+"개");
		System.out.println("\t\t\t\t\t\t블루베리머핀 " +"["+ myBread.muffin +"]"+"개");
		System.out.println("\t\t\t\t\t\t크랜베리통밀식빵 " +"["+ myBread.bread +"]"+"개");
		System.out.printf("\t\t         ================================================================================\r");
		System.out.println("\t\t\t\t\t\t앞으로도 더욱 맛있는 빵 만들어보길 바래요^^");
		System.out.printf("\t\t         ================================================================================\r");
		
		}
		
	}
 	
}

