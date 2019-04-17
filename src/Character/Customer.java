package Character;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Bread.Bread;
import Menu.Menu;


public class Customer extends Character{

	//서비스 만족도 변수
	public static int satisfaction_service = 80;
	
	//손님 수 카운트 변수
	public static int count_customer = 0;
	//손님 카테고리 변수
	public static String category_Customer;
	
	//필요 객체 생성 부분
	
	Menu myMenu = new Menu();
	Bread myBread = new Bread();

	//손님을 랜덤으로 선정하는 메서드
	public String randomCustomer() {
		
		
		 List<String> list = Arrays.asList("grandfa", "mam", "student", "worker");
			
		 Collections.shuffle(list, new Random());

		 count_customer += 1;
		 
		
		 return category_Customer = list.get(0); 
			  	
			
	}
	
	//손님 들어오는 시작 메서드
	public void come(Bread myBread) {
		
	}	
	
	//손님 클래스가 메뉴를 주문하는 메서드
	public String order(){
			
			
		//메뉴 클래스에서 메뉴리스트를 살핌
		myMenu.menuList();
		
		//손님이 메뉴를 고르고 고른 메뉴 이름을 변수에 담음
		String breadname = myMenu.searchMenu(); 
		
		//손님이 고른 메뉴 정보를 반환함
		return breadname; 
		
			
	}
	
	
	//가격을 계산해주는 메서드
	public static int getCost(String breadname){
		
		
		//해당 제품 있을 경우 개수 및 가격 변동시키는 조건문
		if(breadname == "딸기생크림케잌")
		{
			//주문 시 해당 제품 수량 빼주기
			Bread.cake -=1;
			
			//해당 제품 가격을 매출에 더해주기
			moneyBread += 20000;
			
			//해당 제품이 있을 경우 출력문
			if(Bread.cake>0 )
			{
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\t\t\t와우~!");
				
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 감소했습니다\r");
				System.out.println("\t\t        ================================================================================");          
				
				Baker.stress -= 10;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
			
			}
			else
			{
				
				moneyBread += 0;
				
				//해당 제품이 있을 경우 출력문

				System.out.println("");
				System.out.println("");
				System.out.println("");	
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          

				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
		}
		//해당 제품 있을 경우 개수 및 가격 변동시키는 조건문
		else if(breadname == "애플파이")
		{
			if(Bread.pie>0)
			{
				//주문 시 해당 제품 수량 빼주기

				Bread.pie -=1;

				//해당 제품 가격을 매출에 더해주기

				moneyBread += 30000;
				
				//해당 제품이 있을 경우 출력문

				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\t\t\t와우~!");
				
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 감소했습니다\r");
				System.out.println("\t\t        ================================================================================");          

				Baker.stress -= 10;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
			
			}
			else
			{
				//해당 제품이 없을 경우 출력문

				moneyBread += 0;
					
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          

			
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
				
		}
		//해당 제품 있을 경우 개수 및 가격 변동시키는 조건문
		else if(breadname == "마카다미아쿠키")
		{
			if(Bread.cookie>0)
			{
				//주문 시 해당 제품 수량 빼주기

				Bread.cookie -=1;
				
				//해당 제품 가격을 매출에 더해주기

				moneyBread += 1500;
				
				//해당 제품이 있을 경우 출력문

				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\t\t\t와우~!");
				
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 감소했습니다\r");
				System.out.println("\t\t        ================================================================================");          

				Baker.stress -= 10;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
			}
			else
			{
				//해당 제품이 없을 경우 출력문

				moneyBread += 0;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          

				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
				
		}
		//해당 제품 있을 경우 개수 및 가격 변동시키는 조건문
		else if(breadname == "블루베리머핀" )
		{
			if(Bread.muffin>0 )
			{
				//주문 시 해당 제품 수량 빼주기

				Bread.muffin -=1;

				//해당 제품 가격을 매출에 더해주기

				moneyBread += 2000;
				
				//해당 제품이 있을 경우 출력문

				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\t\t\t와우~!");
				
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 감소했습니다\r");
				System.out.println("\t\t        ================================================================================");          

				Baker.stress -= 10;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
			}
			else
			{
				//해당 제품이 없을 경우 출력문

				moneyBread += 0;	
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          

				System.out.println("");
				System.out.println("");
				System.out.println("");
			
			
			}
				
		}
		//해당 제품 있을 경우 개수 및 가격 변동시키는 조건문
		else if(breadname == "크랜베리통밀식빵")
		{
			if(Bread.bread>0)
			{
				//주문 시 해당 제품 수량 빼주기

				Bread.bread -=1;
				
				//해당 제품 가격을 매출에 더해주기

				moneyBread += 3000;
					
				//해당 제품이 있을 경우 출력문

				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				System.out.println("\t\t\t\t\t와우~!");
				
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          
				System.out.printf("\t\t\t\t\t\t\t\t\t\t스트레스 수치가 [10] 감소했습니다\r");
				System.out.println("\t\t        ================================================================================");          

				Baker.stress -= 10;
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
			
			}
			else
			{
				//해당 제품이 없을 경우 출력문

				moneyBread += 0;	
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t        ================================================================================");          

				System.out.printf("\t\t\t\t\t현재 가지고 있는 금액은 %d입니다\r",moneyBread);
				System.out.println("\t\t        ================================================================================");          

				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
				
		}
		
		return moneyBread;
		
	}

	
}
	