package Thread;

import java.util.Scanner;

public class RecipeTip implements Runnable {

	
	Scanner input = new Scanner(System.in);
	
	//베이킹 레시피 팁 메서드
	public void tip() {
		
		
		
		System.out.println("\t\t\t\t\t	      ,-------------------,     ");
		System.out.println("\t\t\t\t\t	      ,~~--~~~~---~~~~--~~~~    ");
		System.out.println("\t\t\t\t\t	     .::~  ───────────── ~~~-   ");
		System.out.println("\t\t\t\t\t	    ,,~~~-│'베이킹 레시피 팁'│~~~-   ");
		System.out.println("\t\t\t\t\t	  ..  ,~~~~───────────── ~~     ");
		System.out.println("\t\t\t\t\t	 . .   ,-----~~-----~~----      ");
		System.out.println("\t\t\t\t\t	 ...                            ");          
	
		System.out.print("\t\t\t\t\t\t레시피 팁을 보시겠습니까?(네/아니오)\r");
		
		String type = input.nextLine();
		
		
		//조건 선택문 - 해당 경우에 따른 출력
		switch(type)
		{	
		case "네" : 
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");		
				System.out.printf("\t\t\t\t\t 딸기생크림케잌   : 섞기-반죽-팬닝-굽기-데코                                 \r");
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t    애플파이      : 섞기-반죽-냉장휴지-팬닝-굽기                           \r");
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t   마카다미아     : 섞기-반죽-쿠키성형-굽기                                  \r");
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t  블루베리 머핀   : 섞기-반죽-팬닝-굽기                                        \r");
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");
				System.out.printf("\t\t\t\t\t 크랜베리통밀식빵 : 섞기-반죽-상온발효-빵성형-굽기                        \r");
				System.out.printf("\t\t\t\t ──────────────────────────────────────────────────\r");		

				break;
				
		case "아니오" :
			System.out.printf("\t\t\t\t\t\t ─────────────\r");		
			System.out.printf("\t\t\t\t\t\t│서두르세요~~~!!!│\r");
			System.out.printf("\t\t\t\t\t\t ─────────────\r");		
			
				break;
		}

		

		
	}
	
	public void run() {
		try 
		{
			tip();

			Thread.sleep(1000);
	
		}catch(InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}
}
