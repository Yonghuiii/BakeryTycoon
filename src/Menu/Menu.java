package Menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Menu{

	//선택한 메뉴를 반환해주는 변수
	static int select_menu; 
	
	//메뉴의 번호 변수
	public int menu_num =0; 
	
	//메뉴판 담는 배열 	
	public String[][] menuList = {{"[1]","딸기생크림케잌","[가격]","   20000원"},{"[2]","애플파이     ","[가격]","   30000원"},{"[3]","마카다미아쿠키","[가격]","   1500원"},{"[4]","블루베리머핀","[가격]","   2000원"},
										{"[5]","크랜베리통밀식빵","[가격]","   3000원"}};

	//메뉴 리스트를 보여주는 메서드
	public void menuList() {
		
		System.out.printf("\t\t\t\t\t**********메			뉴**********\r");
		
			for(int i=0; i<menuList.length; i++)
			{
				System.out.print("\t\t\t\t\t");
				
				for(int j=0;j<menuList[i].length;j++)
			
				{
					System.out.print(menuList[i][j] + "\t");
				}
				System.out.println();
			}		
			
		return ;
	}
	
	//손님이 메뉴판에서 랜덤하게 메뉴 고르는 메소드
	public static String searchMenu() { 
		
	//랜덤하게 메뉴 섞기	
	 List<String> list = Arrays.asList("딸기생크림케잌", "애플파이", "마카다미아쿠키", "블루베리머핀","크랜베리통밀식빵");
		
	 Collections.shuffle(list, new Random());

	 //sleep() 스레드로 메뉴 고르는 효과주기
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
		 System.out.println("\t\t\t\t\t\t\t   메뉴 고르는 중");
		 
		 for(int i=0; i<num; i++) {
		 		System.out.println("\t\t\t\t\t\t\t\t.");
		 		
		 		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	}
		 
		 //랜덤하게 나온 빵에 따른 반응
		if(list.get(0).contains("딸기생크림케잌"))
		{
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t▶▶▶▶▶▶▶▶▶▶딸기생크림케잌 주세요\r");
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			String breadname = list.get(0).toString();
			
			return breadname;
		}
		else if(list.get(0).contains("애플파이"))
		{
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t▶▶▶▶▶▶▶▶▶▶애플파이 주세요\r");
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			String breadname = list.get(0).toString();	

			return breadname;
		}
		else if(list.get(0).contains("마카다미아쿠키"))
		{
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t▶▶▶▶▶▶▶▶▶▶마카다미아쿠키 주세요\r");
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			String breadname = list.get(0).toString();	

			return breadname;
		}
		else if(list.get(0).contains("블루베리머핀"))
		{
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t▶▶▶▶▶▶▶▶▶▶블루베리머핀 주세요\r");
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			String breadname = list.get(0).toString();	


			return breadname;
		}
		else if(list.get(0).contains("크랜베리통밀식빵"))
		{
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			System.out.printf("\t\t\t\t\t\t▶▶▶▶▶▶▶▶▶▶크랜베리통밀식빵 주세요\r");
			System.out.printf("\t\t\t\t\t ────────────────────────────────────────\r");		
			
			String breadname = list.get(0).toString();	

			return breadname;
		}
		
		return null;
	}	
	
	
	
}
