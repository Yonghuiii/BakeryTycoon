package Character;

import java.util.Scanner;

import Bread.Bread;

//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.UIManager;
//import Event.DragRecipe;

import Event.Mouse_putMaterial;
import Thread.CustomerThread;
import Thread.RecipeTip;

public class Baker extends Character{
	
	/* 자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
	 * DragRecipe myDragRecipe = new DragRecipe();
	 */

	//필요 객체 생성 부분
	
	Scanner input = new Scanner(System.in);

	Bread myBread = new Bread();
	
	
	//변수 설정 부분
	/*왜 static? 
	 * 여러 곳에서 참조하는 클래스 변수의 경우 static이 아니면 원하는 정확한 값 출력이 안되는게 맞나?
	 */
	public static int health = 100; // 베이커 체력지수 변수 
	public static int stress = 50; // 베이커 스트레스 지수 변수

	
	String shake_recipe[] = new String[6]; // 기본 재료를 담는 배열 선언
	

	//현재 상태 정보를 확인하는 메소드
	public void check(){
			
			
	
		System.out.println("\t\t        ================================================================================");          
		System.out.println("\t\t        \t\t\t현재 제빵사 상태 정보입니다");          
		System.out.println("\t\t        ================================================================================");          
		System.out.println("\t\t        \t\t\t체력지수"+"["+health +"]");          
		System.out.println("\t\t        \t\t\t스트레스지수"+"["+stress +"]");          
		System.out.println("\t\t        \t\t\t금액"+"["+moneyBread +"]"+"원");          
		System.out.printf("\t\t        ================================================================================\r");
		System.out.println("\t\t        \t\t\t현재 가지고 있는 재료입니다\r");
		System.out.printf("\t\t        ================================================================================\r");
		System.out.println("\t\t        \t\t\t밀가루 " +"["+myBread.flour +"]"+"g");
		System.out.println("\t\t        \t\t\t우유 " +"["+ myBread.milk +"]"+"g");
		System.out.println("\t\t        \t\t\t설탕 " +"["+ myBread.sugar +"]"+"g");
		System.out.println("\t\t        \t\t\t물 " +"["+ myBread.water +"]"+"ml");
		System.out.println("\t\t        \t\t\t버터 " +"["+ myBread.butter +"]"+"g");
		System.out.println("\t\t        \t\t\t베이킹파우더 "+"["+ myBread.bakingpowder +"]"+"g");
		System.out.println("\t\t        \t\t\t효모 " +"["+ myBread.yeast +"]"+"g");
		System.out.println("\t\t        \t\t\t소금 " +"["+ myBread.salt +"]"+"g");
		System.out.println("\t\t        \t\t\t계란 " +"["+ myBread.egg +"]"+"개");
		System.out.println("\t\t        \t\t\t각종 다양한 토핑들이 있습니다.");
		System.out.printf("\t\t        =================================================================================\r");		
		System.out.println("\t\t        \t\t\t현재 가지고 있는 빵종류입니다");
		System.out.println("\t\t       =================================================================================\r");
		System.out.println("\t\t        \t\t\t딸기생크림케잌 " +"["+ myBread.cake +"]"+"판");
		System.out.println("\t\t        \t\t\t애플파이 " +"["+ myBread.pie +"]"+"판");
		System.out.println("\t\t        \t\t\t마카다미아쿠키 " +"["+ myBread.cookie +"]"+"개");
		System.out.println("\t\t        \t\t\t블루베리머핀 " +"["+ myBread.muffin +"]"+"개");
		System.out.println("\t\t        \t\t\t크랜베리통밀식빵 " +"["+ myBread.bread +"]"+"개");
		System.out.printf("\t\t        =================================================================================\r");
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("\t\t\t\t\t\t돌아가려면 '엔터'키를 누르세요\r");
		
		input.nextLine();
	
	
	}

	// 베이킹을 시작하는 메소드
	public int baking(int open_time){
	
		//레시피 리스트를 참고하여 레시피 이름을 반환받아 recipe_name 변수에 담음
		String recipe_name = myBread.recipeList();
		
		//recipe_name에 해당되는 빵 재료를 계량해주는 메소드 실행
		put_Material(myBread.recipe_name);
		
		//레시피 팁을 보여주는 스레드
		RecipeTip recipetip = new RecipeTip();
	    Thread tip = new Thread(recipetip);
	    
	    tip.start();

	    //레시피 팁 시간 지연 스레드 4초간 실행
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		//빵 조리 순서 랜덤 메소드
		open_time = make_Bread(myBread.recipe_name, open_time);
		
	
		//영업 시간 경과를 알려주는 시간 지연 스레드 실행
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 	
	 	for(int i=0; i<1; i++) {
	 		System.out.print("\t\t\t\t\t\t오픈한지 ");
	 	}
	 		
 		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		for(int i=0; i<1; i++) {
	 		System.out.print("\t"+open_time/60+"시간 ("+open_time+"분)");
	 	}
 		
 		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		for(int i=0; i<1; i++) {
	 		System.out.println("\t지났습니다");
	 	}
 		
 		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	 
 			System.out.println("");
 			System.out.println("");
		
	
 		//영업 시간 경과후 손님이 등장하는 조건문 실행
		if((40< open_time && open_time <90) || (90<open_time && open_time<120)|| (150<open_time && open_time<170))
		{
			//손님 스레드 객체 생성
			//가게 오픈시간에 맞춰서 손님이 들어오게하기위해서 스레드를 사용하는 부분
			CustomerThread cT = new CustomerThread();
		    Thread customer = new Thread(cT);
		    
      	
		    	customer.start();  
		    	
				try {
		    		 
		    		 customer.join(); //손님 스레드 실행 유지 
		    		 
		    		 Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		}
		
		return open_time; // 영업 시간에 베이킹 시간을 더하여 반환
			
	}
				

	public void put_Material(String recipe_name) {

		//레시피 '딸키생크림케잌' 선택시
		if(recipe_name.contains("케잌"))
		{
	
			//해당 계량 정보를 보여주는 메소드
			myBread.recipe_material(myBread.recipe_name);
		
			
			//해당되는 재료의 버튼을 클릭하여 재료를 계량하는 마우스 이벤트 실행
			new Mouse_putMaterial();
			
			
			//마우스 이벤트 실행 동안 시간 지연 sleep() 스레드 10초간 실행 
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//10초 후 3초간 시간 카운트 해주는 슬립 스레드 실행 
			System.out.println("\t\t\t\t\t\t\t\t\t\t남은 시간 카운트 시작! ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t3 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t1 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//마우스 이벤트로 재료를 계량한 값과 해당 레시피 계량 정보와 비교 - 정확할 때
			if(myBread.cup_flour == 100 && myBread.cup_sugar == 50 && myBread.cup_butter == 20 && myBread.cup_salt == 5 && 
					myBread.cup_egg ==2 && myBread.cup_bakingpowder == 5 && myBread.cup_cream == 100 && myBread.cup_strawberry == 10)
			{
				
				// '맛' 만족도 상승
				satisfaction_taste_cake += 5;
				
				// 계량 상태 및 맛 수치 출력
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 정확히 계량했어요. 딸기생크림케잌 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cake);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
			
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기
				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
				
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
			
			}
			else { //계량 비교 - 틀림
				
				// '맛' 만족도 하락
				
				satisfaction_taste_cake -= 5;
				
				// 계량 상태 및 맛 수치 출력

				System.out.printf("\t\t\t\t\t\t\t\t\t\t ─────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 계량이 틀렸네요. 딸기생크림케잌 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cake);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ─────────────────────────────────────────────\r");
	
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기
				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
				
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
				
			}
							
			System.out.println();
			
			
		}
		//레시피 '애플파이' 선택시
		else if(myBread.recipe_name.contains("파이"))
		{
			//해당 계량 정보를 보여주는 메소드
			myBread.recipe_material(myBread.recipe_name);
			
			//해당되는 재료의 버튼을 클릭하여 재료를 계량하는 마우스 이벤트 실행
			new Mouse_putMaterial();
			
			
			//마우스 이벤트 실행 동안 시간 지연 sleep() 스레드 10초간 실행 

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//10초 후 3초간 시간 카운트 해주는 슬립 스레드 실행 

			System.out.println("\t\t\t\t\t\t\t\t\t\t남은 시간 카운트 시작! ");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//마우스 이벤트로 재료를 계량한 값과 해당 레시피 계량 정보와 비교 - 정확할 때
			if(myBread.cup_flour == 100 && myBread.cup_sugar == 50 && myBread.cup_butter == 20 && myBread.cup_salt == 5 && myBread.cup_egg ==2 && myBread.cup_milk == 10 && myBread.cup_apple == 5)
			{
				
				// '맛' 만족도 상승

				Character.satisfaction_taste_pie += 5;
				
				// 계량 상태 및 맛 수치 출력

				System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 정확히 계량했어요. 애플파이 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_pie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────\r");
			
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기
				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
				
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
				
			
			}
			else {//계량 비교 - 틀림
				
				// '맛' 만족도 하락

				satisfaction_taste_pie -= 5;
				
				// 계량 상태 및 맛 수치 출력

				System.out.printf("\t\t\t\t\t\t\t\t\t\t ─────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 계량이 틀렸네요. 애플파이 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_pie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ─────────────────────────────────────────\r");
	
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
			
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
			
			    
			}
			
			//Collection.shuffle(pick_recipe);
			
			
			System.out.println();
			
	
		}
		//레시피 '마카다미아쿠키' 선택시
		else if(recipe_name.contains("쿠키"))
		{
			//해당 계량 정보를 보여주는 메소드
			myBread.recipe_material(recipe_name);
			
			//해당되는 재료의 버튼을 클릭하여 재료를 계량하는 마우스 이벤트 실행
			new Mouse_putMaterial();
			
		
			//마우스 이벤트 실행 동안 시간 지연 sleep() 스레드 10초간 실행 

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//10초 후 5초간 시간 카운트 해주는 슬립 스레드 실행 

			System.out.println("\t\t\t\t\t\t\t\t\t\t남은 시간 카운트 시작! ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//마우스 이벤트로 재료를 계량한 값과 해당 레시피 계량 정보와 비교 - 정확할 때

			if(myBread.cup_flour == 20 && myBread.cup_sugar == 10 && myBread.cup_butter == 10 && myBread.cup_salt == 5 && myBread.cup_egg ==1 && myBread.cup_bakingpowder == 5 && myBread.cup_makadamia == 5)
			{
				
				// '맛' 만족도 상승

				satisfaction_taste_cookie += 5;
				
				// 계량 상태 및 맛 수치 출력

				System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 정확히 계량했어요. 마카다미아 쿠키 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_cookie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
			
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
				
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
				
			    
			    
			}
			else {//계량 비교 - 틀림
				
				// '맛' 만족도 하락

				satisfaction_taste_cookie -= 5;
				
				// 계량 상태 및 맛 수치 출력

				System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 계량이 틀렸네요. 마카다미아 쿠키 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_cookie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────────\r");
	
				//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

				myBread.flour -= myBread.cup_flour;
				myBread.sugar -= myBread.cup_sugar;
				myBread.butter -= myBread.cup_butter;
				myBread.salt -= myBread.cup_salt;
				myBread.egg -= myBread.cup_egg;
				myBread.bakingpowder -= myBread.cup_bakingpowder;
				myBread.milk -= myBread.cup_milk;
				myBread.water -= myBread.cup_water;
				myBread.yeast -= myBread.cup_yeast;
				myBread.cream -= myBread.cup_cream;
				myBread.strawberry -= myBread.cup_strawberry;
				myBread.apple -= myBread.cup_apple;
				myBread.makadamia -= myBread.cup_makadamia;
				myBread.blueberry -= myBread.cup_blueberry;
				myBread.cranberry -= myBread.cup_cranberry;
				
				//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
				myBread.cup_flour =0 ;
				myBread.cup_sugar =0;
				myBread.cup_salt =0;
				myBread.cup_egg =0;
				myBread.cup_butter =0;
				myBread.cup_bakingpowder =0;
				myBread.cup_milk =0;
				myBread.cup_water =0;
				myBread.cup_yeast = 0;
				myBread.cup_cream = 0;
				myBread.cup_strawberry = 0;
				myBread.cup_apple = 0;
				myBread.cup_makadamia = 0;
				myBread.cup_blueberry = 0;
				myBread.cup_cranberry = 0;
				
			
			    
			}
	
		}
		//레시피 '블루베리머핀' 선택시	
		else if(myBread.recipe_name.contains("머핀"))
		{
			//해당 계량 정보를 보여주는 메소드
			myBread.recipe_material(myBread.recipe_name);
			
			//해당되는 재료의 버튼을 클릭하여 재료를 계량하는 마우스 이벤트 실행
			new Mouse_putMaterial();
			
			//마우스 이벤트 실행 동안 시간 지연 sleep() 스레드 10초간 실행 

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//10초 후 5초간 시간 카운트 해주는 슬립 스레드 실행 

			System.out.println("\t\t\t\t\t\t\t\t\t\t남은 시간 카운트 시작! ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//마우스 이벤트로 재료를 계량한 값과 해당 레시피 계량 정보와 비교 - 정확할 때

			if(myBread.cup_flour == 20 && myBread.cup_sugar == 10 && myBread.cup_butter == 10 && myBread.cup_salt == 5 && myBread.cup_egg ==1 && myBread.cup_bakingpowder == 5 && myBread.cup_blueberry == 5)
				{
					
					// '맛' 만족도 상승

					satisfaction_taste_muffin += 5;
					
					// 계량 상태 및 맛 수치 출력

					System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────────\r");
					System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 정확히 계량했어요. 블루베리 머핀 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_muffin);
					System.out.printf("\t\t\t\t\t\t\t\t\t\t ──────────────────────────────────────────────\r");
				
					//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

					myBread.flour -= myBread.cup_flour;
					myBread.sugar -= myBread.cup_sugar;
					myBread.butter -= myBread.cup_butter;
					myBread.salt -= myBread.cup_salt;
					myBread.egg -= myBread.cup_egg;
					myBread.bakingpowder -= myBread.cup_bakingpowder;
					myBread.milk -= myBread.cup_milk;
					myBread.water -= myBread.cup_water;
					myBread.yeast -= myBread.cup_yeast;
					myBread.cream -= myBread.cup_cream;
					myBread.strawberry -= myBread.cup_strawberry;
					myBread.apple -= myBread.cup_apple;
					myBread.makadamia -= myBread.cup_makadamia;
					myBread.blueberry -= myBread.cup_blueberry;
					myBread.cranberry -= myBread.cup_cranberry;
					
					//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
					myBread.cup_flour =0 ;
					myBread.cup_sugar =0;
					myBread.cup_salt =0;
					myBread.cup_egg =0;
					myBread.cup_butter =0;
					myBread.cup_bakingpowder =0;
					myBread.cup_milk =0;
					myBread.cup_water =0;
					myBread.cup_yeast = 0;
					myBread.cup_cream = 0;
					myBread.cup_strawberry = 0;
					myBread.cup_apple = 0;
					myBread.cup_makadamia = 0;
					myBread.cup_blueberry = 0;
					myBread.cup_cranberry = 0;
					
					
				    
				}
				else {//계량 비교 - 틀림
					
					satisfaction_taste_muffin -= 5;
					
					// 계량 상태 및 맛 수치 출력

					System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────\r");
					System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 계량이 틀렸네요. 블루베리 머핀 맛이 " + "[" + "%d" + "]" +"이 되었습니다. \r", satisfaction_taste_muffin);
					System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────\r");
	
					//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

					myBread.flour -= myBread.cup_flour;
					myBread.sugar -= myBread.cup_sugar;
					myBread.butter -= myBread.cup_butter;
					myBread.salt -= myBread.cup_salt;
					myBread.egg -= myBread.cup_egg;
					myBread.bakingpowder -= myBread.cup_bakingpowder;
					myBread.milk -= myBread.cup_milk;
					myBread.water -= myBread.cup_water;
					myBread.yeast -= myBread.cup_yeast;
					myBread.cream -= myBread.cup_cream;
					myBread.strawberry -= myBread.cup_strawberry;
					myBread.apple -= myBread.cup_apple;
					myBread.makadamia -= myBread.cup_makadamia;
					myBread.blueberry -= myBread.cup_blueberry;
					myBread.cranberry -= myBread.cup_cranberry;
					
					//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
					myBread.cup_flour =0 ;
					myBread.cup_sugar =0;
					myBread.cup_salt =0;
					myBread.cup_egg =0;
					myBread.cup_butter =0;
					myBread.cup_bakingpowder =0;
					myBread.cup_milk =0;
					myBread.cup_water =0;
					myBread.cup_yeast = 0;
					myBread.cup_cream = 0;
					myBread.cup_strawberry = 0;
					myBread.cup_apple = 0;
					myBread.cup_makadamia = 0;
					myBread.cup_blueberry = 0;
					myBread.cup_cranberry = 0;
				
					
				    
				}
			

		}	
		//레시피 '크랜베리식빵' 선택시		
		else if(myBread.recipe_name.contains("식빵"))
		{
			//해당 계량 정보를 보여주는 메소드
			myBread.recipe_material(myBread.recipe_name);
			
			//해당되는 재료의 버튼을 클릭하여 재료를 계량하는 마우스 이벤트 실행
			new Mouse_putMaterial();
			
			//마우스 이벤트 실행 동안 시간 지연 sleep() 스레드 10초간 실행 

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//10초 후 5초간 시간 카운트 해주는 슬립 스레드 실행 

			System.out.println("\t\t\t\t\t\t\t\t\t\t남은 시간 카운트 시작! ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//마우스 이벤트로 재료를 계량한 값과 해당 레시피 계량 정보와 비교 - 정확할 때

			if(myBread.cup_flour == 60 && myBread.cup_sugar == 30 && myBread.cup_butter == 10 && myBread.cup_salt == 5 && myBread.cup_egg ==1 && myBread.cup_yeast == 5 && myBread.cup_water == 60 && myBread.cup_cranberry == 5)
				{
					
					// '맛' 만족도 상승

					satisfaction_taste_bread += 5;
					
					// 계량 상태 및 맛 수치 출력

					System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
					System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 정확히 계량했어요. 크랜베리통밀식빵 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_bread);
					System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				
					
					//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

					myBread.flour -= myBread.cup_flour;
					myBread.sugar -= myBread.cup_sugar;
					myBread.butter -= myBread.cup_butter;
					myBread.salt -= myBread.cup_salt;
					myBread.egg -= myBread.cup_egg;
					myBread.bakingpowder -= myBread.cup_bakingpowder;
					myBread.milk -= myBread.cup_milk;
					myBread.water -= myBread.cup_water;
					myBread.yeast -= myBread.cup_yeast;
					myBread.cream -= myBread.cup_cream;
					myBread.strawberry -= myBread.cup_strawberry;
					myBread.apple -= myBread.cup_apple;
					myBread.makadamia -= myBread.cup_makadamia;
					myBread.blueberry -= myBread.cup_blueberry;
					myBread.cranberry -= myBread.cup_cranberry;
					
					//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
					myBread.cup_flour =0 ;
					myBread.cup_sugar =0;
					myBread.cup_salt =0;
					myBread.cup_egg =0;
					myBread.cup_butter =0;
					myBread.cup_bakingpowder =0;
					myBread.cup_milk =0;
					myBread.cup_water =0;
					myBread.cup_yeast = 0;
					myBread.cup_cream = 0;
					myBread.cup_strawberry = 0;
					myBread.cup_apple = 0;
					myBread.cup_makadamia = 0;
					myBread.cup_blueberry = 0;
					myBread.cup_cranberry = 0;
					
					
				
				}
				else {//계량 비교 - 틀림
					
					// '맛' 만족도 하락

					satisfaction_taste_bread -= 5;
					
					// 계량 상태 및 맛 수치 출력

					System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
					System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 계량이 틀렸네요. 크랜베리통밀식빵 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", satisfaction_taste_bread);
					System.out.printf("\t\t\t\t\t\t\t\t\t\t ───────────────────────────────────────────────\r");
	
					//초기 재료 값에서 마우스 이벤트로 계량한 값 빼주기

					myBread.flour -= myBread.cup_flour;
					myBread.sugar -= myBread.cup_sugar;
					myBread.butter -= myBread.cup_butter;
					myBread.salt -= myBread.cup_salt;
					myBread.egg -= myBread.cup_egg;
					myBread.bakingpowder -= myBread.cup_bakingpowder;
					myBread.milk -= myBread.cup_milk;
					myBread.water -= myBread.cup_water;
					myBread.yeast -= myBread.cup_yeast;
					myBread.cream -= myBread.cup_cream;
					myBread.strawberry -= myBread.cup_strawberry;
					myBread.apple -= myBread.cup_apple;
					myBread.makadamia -= myBread.cup_makadamia;
					myBread.blueberry -= myBread.cup_blueberry;
					myBread.cranberry -= myBread.cup_cranberry;
				
					//마우스 이벤트로 계량한 컵 변수값 초기화시켜 다음 베이킹 시 오차 없애기
					myBread.cup_flour =0 ;
					myBread.cup_sugar =0;
					myBread.cup_salt =0;
					myBread.cup_egg =0;
					myBread.cup_butter =0;
					myBread.cup_bakingpowder =0;
					myBread.cup_milk =0;
					myBread.cup_water =0;
					myBread.cup_yeast = 0;
					myBread.cup_cream = 0;
					myBread.cup_strawberry = 0;
					myBread.cup_apple = 0;
					myBread.cup_makadamia = 0;
					myBread.cup_blueberry = 0;
					myBread.cup_cranberry = 0;
					
					
				
				}

			}
		
		return;
	}
		
		
	// 레시피 순서 맞추기 메소드 실행
	public int make_Bread(String recipe_name, int open_time) {
		
		//'딸기생크림케잌' 선택시
		if(recipe_name.contains("케잌"))
		{
			
			
		    //myDragRecipe.DragRecipe(recipe_name);
			
			//빵 클래스의 레시피 가이드 메소드를 통해 
			myBread.recipe_guide(myBread.recipe_name);
			
			
			System.out.println();
			
			
			myBread.cake += 1; //케익 수량 증가
			
			open_time += 60; //
			
			health -= 5;
			
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 열심히 집중했더니 체력이" + "[" + "%d" + "]" +"이 되었습니다.\r", health);
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
		
			return open_time;
		}
		//'애플파이' 선택시
		else if(myBread.recipe_name.contains("파이"))
		{

			
		    //myDragRecipe.DragRecipe(recipe_name);

			myBread.recipe_guide(myBread.recipe_name);
			
			myBread.pie += 1;
			
			open_time += 60;
			
			health -= 5;
			

			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 열심히 집중했더니 체력이" + "[" + "%d" + "]" +"이 되었습니다.\r", health);
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			return open_time;
			
		}
		else if(myBread.recipe_name.contains("쿠키"))
		{

		    //myDragRecipe.DragRecipe(recipe_name);

			myBread.recipe_guide(myBread.recipe_name);
			
			myBread.cookie += 1;
	
			open_time += 40;
			
			health -= 5;
			
	
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 열심히 집중했더니 체력이" + "[" + "%d" + "]" +"이 되었습니다.\r", health);
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			return open_time;
			
		}
		else if(myBread.recipe_name.contains("머핀"))
		{
	
		    //myDragRecipe.DragRecipe(recipe_name);

			myBread.recipe_guide(myBread.recipe_name);
			
			myBread.muffin += 1;
			
			open_time += 40;
			
			health -= 5;
	
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 열심히 집중했더니 체력이" + "[" + "%d" + "]" +"이 되었습니다.\r", health);
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			return open_time;
			
		}	
		else if(myBread.recipe_name.contains("식빵"))
		{

		    
		    //myDragRecipe.DragRecipe(recipe_name);

			myBread.recipe_guide(myBread.recipe_name);
			
			myBread.bread += 1;
			
			open_time += 40;
			
			health -= 5;
	
			
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			System.out.printf("\t\t\t\t\t\t\t\t\t\t\t 열심히 집중했더니 체력이" + "[" + "%d" + "]" +"이 되었습니다.\r", health);
			System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			}
		
		
		return open_time; //베이킹 후 전체 경과 시간을 영업 시간 변수에 반환해줌
	}

}

