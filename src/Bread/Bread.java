package Bread;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Character.Character;
import Thread.BakingImage_bread;
import Thread.BakingImage_cake;
import Thread.BakingImage_cookie;
import Thread.BakingImage_muffin;
import Thread.BakingImage_pie;

public class Bread{
	
	Scanner input = new Scanner(System.in);

	/*
	 * 변수 설정 부분
	 */
	public String breadname; //빵이름 변수
			
	int select_recipe; //선택한 레시피 번호를 반환해주는 변수

	public String recipe_name;//레시피 이름 변수

	public String type_recipe;	//사용자가 입력한 레시피 값을 담는 변수

	
	/* 빵 개수 
	 *Q.왜 public static 이여야만 하나? 
	 *Baker 클래스에서는 Bread() 객체 생성 후 에러 없었으나 
	 *왜 Customer/Grandfa/Mam/Student/Worker 클래스에서는 Bread() 객체를 생성해도 에러가 뜰까? 
	*/
	public static int cake=0; //처음 케이크 개수 
	public static int pie=0; //처음 파이 개수
	public static int cookie=0; //처음 쿠키 개수
	public static int muffin=0; //처음 머핀 개수
	public static int bread=0; //처음 빵 개수
	
	/* 재료양 
	 *Q.왜 public static 이여야만 하나? 
	 * public 선언 시 마우스 이벤트에서 재료 계량 후 비교시 원하는 값이 입력되지 않음 
	 * 
	*/
	public static int butter = 50;
	public static int sugar = 50;
	public static int salt =  10;
	public static int flour =  120;
	public static int egg = 5;
	public static int bakingpowder = 20;
	public static int milk = 100;
	public static int water = 50;
	public static int yeast = 10;
	public static int cream = 100;
	public static int strawberry = 10;
	public static int apple = 5;
	public static int makadamia = 5;
	public static int blueberry = 5;
	public static int cranberry = 5;
	

	/* 클릭한 재료를 담는 통
	 *Q.왜 public static 이여야만 하나? 
	 * public 선언 시 마우스 이벤트에서 재료 계량 후 비교시 원하는 값이 입력되지 않음 
	 * 
	*/
	public static int cup_flour =0 ;
	public static int cup_sugar =0;
	public static int cup_salt =0;
	public static int cup_egg =0;
	public static int cup_butter =0;
	public static int cup_bakingpowder =0;
	public static int cup_milk =0;
	public static int cup_water =0;
	public static int cup_yeast = 0;
	public static int cup_cream = 0;
	public static int cup_strawberry = 0;
	public static int cup_apple = 0;
	public static int cup_makadamia = 0;
	public static int cup_blueberry = 0;
	public static int cup_cranberry = 0;
	
	/* 한번 클릭할 때의 재료의 양
	 *Q.왜 public static 이여야만 하나? 
	 * public 선언 시 마우스 이벤트에서 재료 계량 후 비교시 원하는 값이 입력되지 않음 
	 * 
	*/
	public static int click_flour =20 ;
	public static int click_sugar =10;
	public static int click_salt =5;
	public static int click_egg =1;
	public static int click_butter =10;
	public static int click_bakingpowder =5;
	public static int click_milk =10;
	public static int click_water =20;
	public static int click_yeast = 5;
	public static int click_cream = 100;
	public static int click_strawberry = 10;
	public static int click_apple = 5;
	public static int click_makadamia = 5;
	public static int click_blueberry = 5;
	public static int click_cranberry = 5;
	
	//딸기생크림케익재료
	private int flour_cake =100;
	private int sugar_cake =50;
	private int butter_cake =20;
	private int salt_cake = 5;
	private int egg_cake = 2;
	private int bakingpowder_cake = 5;
	private int strawberry_cake = 10;
	private int cream_cake = 100;
	
	//애플파이재료
	private int flour_pie =100;
	private int sugar_pie =50;
	private int butter_pie =20;
	private int salt_pie = 5;
	private int egg_pie = 2;
	private int milk_pie = 10;
	private int apple_pie = 5;
	
	//마카다미아쿠키재료
	private int flour_cookie =20;
	private int sugar_cookie =10;
	private int butter_cookie =10;
	private int salt_cookie = 5;
	private int egg_cookie = 1;
	private int bakingpowder_cookie = 5;
	private int makadamia_cookie = 5;
	
	//블루베리머핀재료
	private int flour_muffin =20;
	private int sugar_muffin =10;
	private int butter_muffin =10;
	private int salt_muffin = 5;
	private int egg_muffin = 1;
	private int bakingpowder_muffin = 5;
	private int blueberry_muffin = 5;

	
	//크랜베리호밀식빵재료
	private int flour_bread =60;
	private int sugar_bread =30;
	private int butter_bread =10;
	private int salt_bread = 5;
	private int egg_bread = 1;
	private int yeast_bread = 5;
	private int water_bread = 60;
	private int cranberry_bread = 5;

	//토핑을 담는 변수
	private String topping[] = {"딸기","생크림","사과","마카다미아","블루베리","크랜베리","효모"};

	
	//레시피 종류를 안내하고 입력받는 메서드
	public String recipeList(){
		    
		//레시피 종류 출력
		System.out.println("\t\t        ================================================================================");          
		System.out.println("\t\t        \t\t\t\t레시피 종류 입니다");
		System.out.println("\t\t        =================================================================================\r");
		System.out.println("\t\t        \t\t\t\t딸기생크림케잌");
		System.out.println("\t\t        \t\t\t\t애플파이");
		System.out.println("\t\t        \t\t\t\t마카다미아쿠키");
		System.out.println("\t\t        \t\t\t\t블루베리머핀");
		System.out.println("\t\t        \t\t\t\t크랜베리통밀식빵");
		System.out.printf("\t\t        =================================================================================\r");
		
		System.out.println("\t\t\t\t\t\t\t메뉴를 입력하세요");
		
		recipe_name = input.nextLine();
		
		//입력받은 레시피 이름 반환
		return recipe_name;
	}
	
	//필요한 재료의 계량 정보를 알려주는 메서드
	public void recipe_material(String recipe_name) {
		
		if(recipe_name.contains("케잌"))
		{
			
			System.out.printf("\t\t\t\t\t\t\t ──────────────\r");
			System.out.printf("\t\t\t\t\t\t\t│딸기생크림케잌 재료│\r");
			System.out.printf("\t\t\t\t\t\t\t ──────────────\r");
			System.out.printf("\t\t\t\t\t\t밀가루 "+"["+flour_cake+"]"+"g을 넣으세요.\r"); 
			System.out.printf("\t\t\t\t\t\t설탕"+"["+sugar_cake+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t버터"+"["+butter_cake+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t소금"+"["+salt_cake+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t계란"+"["+egg_cake+"]"+"개를 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t베이킹파우더"+"["+bakingpowder_cake+"]"+"g을 넣으세요\r");
			System.out.printf("\t\t\t\t\t\t추가재료"+ "["+topping[0]+"]"+ "["+topping[1]+"]" + "을 사용하세요.\r");
			System.out.printf("\r");
			System.out.printf("\r");
			
		}
		else if(recipe_name.contains("파이"))
		{
		
			System.out.printf("\t\t\t\t\t\t\t ─────────\r");
			System.out.printf("\t\t\t\t\t\t\t│애플파이 재료│\r");
			System.out.printf("\t\t\t\t\t\t\t ─────────\r");
			System.out.printf("\t\t\t\t\t\t밀가루 "+"["+flour_pie+"]"+"g을 넣으세요.\r"); 
			System.out.printf("\t\t\t\t\t\t설탕"+"["+sugar_pie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t버터"+"["+butter_pie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t소금"+"["+salt_pie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t계란"+"["+egg_pie+"]"+"개를 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t우유"+"["+milk_pie+"]"+"g을 넣으세요\r");
			System.out.printf("\t\t\t\t\t\t추가재료 "+ "["+topping[2]+"]" + "을 사용하세요.\r");
			System.out.printf("\r");
			System.out.printf("\r");
				
			
		}
		else if(recipe_name.contains("쿠키"))
		{
		
			System.out.printf("\t\t\t\t\t\t\t ──────────────\r");
			System.out.printf("\t\t\t\t\t\t\t│마카다미아쿠키 재료│\r");
			System.out.printf("\t\t\t\t\t\t\t ──────────────\r");
			System.out.printf("\t\t\t\t\t\t밀가루 "+"["+flour_cookie+"]"+"g을 넣으세요.\r"); 
			System.out.printf("\t\t\t\t\t\t설탕"+"["+sugar_cookie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t버터"+"["+butter_cookie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t소금"+"["+salt_cookie+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t계란"+"["+egg_cookie+"]"+"개를 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t베이킹파우더"+"["+bakingpowder_cookie+"]"+"g을 넣으세요\r");
			System.out.printf("\t\t\t\t\t\t추가재료 "+ "["+topping[3]+"]" + "를 넣으세요.\r");
			System.out.printf("\r");
			System.out.printf("\r");
			
			
		}
		else if(recipe_name.contains("머핀"))
		{
			
			System.out.printf("\t\t\t\t\t\t\t ────────────\r");
			System.out.printf("\t\t\t\t\t\t\t│블루베리머핀 재료│\r");
			System.out.printf("\t\t\t\t\t\t\t ────────────\r");
			System.out.printf("\t\t\t\t\t\t밀가루 "+"["+flour_muffin+"]"+"g을 넣으세요.\r"); 
			System.out.printf("\t\t\t\t\t\t설탕"+"["+sugar_muffin+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t버터"+"["+butter_muffin+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t소금"+"["+salt_muffin+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t계란"+"["+egg_muffin+"]"+"개를 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t베이킹파우더"+"["+bakingpowder_muffin+"]"+"g을 넣으세요\r");
			System.out.printf("\t\t\t\t\t\t추가재료 "+"["+ topping[4] +"]"+ "를 넣으세요.\r");
			System.out.printf("\r");
			System.out.printf("\r");
			
		
		}
		else if(recipe_name.contains("식빵"))
		{
			
			System.out.printf("\t\t\t\t\t\t\t ───────────────\r");
			System.out.printf("\t\t\t\t\t\t\t│크랜베리통밀식빵 재료│\r");
			System.out.printf("\t\t\t\t\t\t\t ───────────────\r");
			System.out.printf("\t\t\t\t\t\t밀가루 "+"["+flour_bread+"]"+"g을 넣으세요.\r"); 
			System.out.printf("\t\t\t\t\t\t설탕"+"["+sugar_bread+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t버터"+"["+butter_bread+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t소금"+"["+salt_bread+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t계란"+"["+egg_bread+"]"+"개를 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t물"+"["+water_bread+"]"+"g을 넣으세요.\r");
			System.out.printf("\t\t\t\t\t\t추가재료 "+ "["+topping[5]+"]"+ "["+ topping[6]+"]"+"를 넣으세요.\r");
			System.out.printf("\r");
			System.out.printf("\r");
			
		}
			
		
	}
	
	//빵 만드는 순서 랜덤하게 섞어주는 메서드
	public String recipe_guide(String recipe_name) {
		
		if(recipe_name.contains("케잌"))
		{
		
			//랜덤하게 섞기
	    	List<String> list = Arrays.asList("섞기","반죽","팬닝","굽기","데코");
			
			Collections.shuffle(list);
			
			System.out.println("\t\t\t\t\t\t" + list);
			
			System.out.println("\t\t\t\t\t\t레시피를 순서대로 입력해주세요"); // 레시피값 입력받기
			
			String type_recipe = input.nextLine();
			
			//해당되는 베이킹 이미지 등장시키는 스레드
			BakingImage_cake cake = new BakingImage_cake();
		    Thread Image_cake = new Thread(cake);
		    
		    Image_cake.start();
		    
		    //이미지 등장 동안 지연 시간 주는 스레드
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


			if("섞기 반죽 팬닝 굽기 데코".equals(type_recipe))
			{
				
				//입력 값과 순서가 일치하면 '맛'만족도 변수값 상승
				Character.satisfaction_taste_cake += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 딸기생크림케잌 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cake);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	

			}
			else
			{
				//입력 값과 순서가 틀리면 '맛'만족도 변수값 하락

				Character.satisfaction_taste_cake -= 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 틀렸어요. 딸기생크림케잌 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cake);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			}
			
			
			return null;
			
			
		}
		else if(recipe_name.contains("파이"))
		{
			
			//랜덤하게 섞기

			List<String> list = Arrays.asList("섞기","반죽","냉장휴지","팬닝","굽기");
			
			Collections.shuffle(list);
			
			System.out.println("\t\t\t\t\t\t" + list);
			
			
			System.out.println("\t\t\t\t\t\t레시피를 순서대로 입력해주세요"); 
			
			String type_recipe = input.nextLine();
			
			//해당되는 베이킹 이미지 등장시키는 스레드

			BakingImage_pie pie = new BakingImage_pie();
		    Thread Image_pie = new Thread(pie);
		    
		    Image_pie.start();
		    
		    //이미지 등장 동안 지연 시간 주는 스레드

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if("섞기 반죽 냉장휴지 팬닝 굽기".equals(type_recipe))
			{
				//입력 값과 순서가 일치하면 '맛'만족도 변수값 상승

				Character.satisfaction_taste_pie += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 애플파이 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_pie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
					
			}
			else
			{
				//입력 값과 순서가 틀리면 '맛'만족도 변수값 하락

				Character.satisfaction_taste_pie -= 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 틀렸어요. 애플파이 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_pie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
	
			}
			
			return null;
			
	
		} 
		else if(recipe_name.contains("쿠키"))
		{
			
			//랜덤하게 섞기

			List<String> list = Arrays.asList("섞기","반죽","쿠키성형","굽기");
			
			Collections.shuffle(list);
			
			System.out.println("\t\t\t\t\t\t" +list);
			
			System.out.println("\t\t\t\t\t\t레시피를 순서대로 입력해주세요"); 
			
			String type_recipe = input.nextLine();
			
			//해당되는 베이킹 이미지 등장시키는 스레드

			BakingImage_cookie cookie = new BakingImage_cookie();
		    Thread Image_cookie = new Thread(cookie);
		    
		    Image_cookie.start();
			
		    //이미지 등장 동안 지연 시간 주는 스레드

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if("섞기 반죽 쿠키성형 굽기".equals(type_recipe))
			{
				//입력 값과 순서가 일치하면 '맛'만족도 변수값 상승

				Character.satisfaction_taste_cookie += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 마카다미아 쿠키 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cookie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			else
			{
				//입력 값과 순서가 틀리면 '맛'만족도 변수값 하락

				Character.satisfaction_taste_cookie -= 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 틀렸어요. 마카다미아 쿠키 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_cookie);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
			}
			
			return null;
			
			
		}
		else if(recipe_name.contains("머핀"))
		{
		
			//랜덤하게 섞기

			
			List<String> list = Arrays.asList("섞기","반죽","팬닝","굽기");
			
			Collections.shuffle(list);
			
			System.out.println("\t\t\t\t\t\t" + list);
			
			System.out.println("\t\t\t\t\t\t레시피를 순서대로 입력해주세요"); 
			
			String type_recipe = input.nextLine();
			
			//해당되는 베이킹 이미지 등장시키는 스레드

			BakingImage_muffin muffin = new BakingImage_muffin();
		    Thread Image_muffin = new Thread(muffin);
		    
		    Image_muffin.start();
		    
		    //이미지 등장 동안 지연 시간 주는 스레드

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
			if("섞기 반죽 팬닝 굽기".equals(type_recipe))
			{
				
				//입력 값과 순서가 일치하면 '맛'만족도 변수값 상승

				Character.satisfaction_taste_muffin += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 블루베리 머핀 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_muffin);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			else
			{
				//입력 값과 순서가 틀리면 '맛'만족도 변수값 하락

				Character.satisfaction_taste_muffin -= 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 틀렸네요. 블루베리 머핀 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_muffin);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");

			}
			
			return null;
			
			
		}
		else if(recipe_name.contains("식빵"))
		{
			//랜덤하게 섞기

			List<String> list = Arrays.asList("섞기","반죽","상온발효","빵성형","굽기");
			
			Collections.shuffle(list);
			
			System.out.println("\t\t\t\t\t\t" +list);
			
			System.out.println("\t\t\t\t\t\t레시피를 순서대로 입력해주세요"); 
			
			String type_recipe = input.nextLine();
			
			//해당되는 베이킹 이미지 등장시키는 스레드

			BakingImage_bread bread = new BakingImage_bread();
		    Thread Image_bread = new Thread(bread);
		    
		    Image_bread.start();
		    
		    //이미지 등장 동안 지연 시간 주는 스레드

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
			if("섞기 반죽 상온발효 빵성형 굽기".equals(type_recipe))
			{
				
				//입력 값과 순서가 일치하면 '맛'만족도 변수값 상승

				Character.satisfaction_taste_bread += 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 정확했어요. 크랜베리통밀식빵 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_bread);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
			
				
			}
			else
			{
				//입력 값과 순서가 틀리면 '맛'만족도 변수값 하락

				Character.satisfaction_taste_bread -= 5;
				
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t\t\t\t\t\t 베이킹 순서가 틀렸네요. 크랜베리통밀식빵 맛이 " + "[" + "%d" + "]" +"이 되었습니다.\r", Character.satisfaction_taste_bread);
				System.out.printf("\t\t\t\t\t\t\t\t\t\t ────────────────────────────────────────────────\r");

			}
			
			return null;
			
	
		}
			
		
		return null;
	}
	

}
