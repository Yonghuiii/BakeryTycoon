package Frame;



import java.util.Scanner;

import Frame. End;
import Character.Baker;
import Character.Character;
import Thread.CustomerThread;
import Thread.Music;


public class Home{
	/**
	 * @param num 제빵사 행동 선택
	 * {@link Baker}
	 * 
	 */
	
	//public static int open_time;
	
	//제빵사 행동 선택 시, 입력값 변수
	private int num;
	
	//필요 객체 생성 부분
	Scanner input = new Scanner(System.in);
	Baker myBaker = new Baker(); 
	Character myCharacter = new Character();
	End myEnd = new End();
	
	
	/**
	 * 홈으로 돌아가는 페이지 
	 * @return 
	 */
	public int home(int open_time) {
	
		
		
				
		
		//제빵사 행동 선택 안내문 출력
		System.out.println("\t\t\t\t\t\t이제부터 원하는 종류의 빵을 준비해보세요");
		System.out.printf("\t\t\t\t\t\t ───────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t│       1.  상 태 체 크                │");
		System.out.println("\t\t\t\t\t\t│                           │");
		System.out.println("\t\t\t\t\t\t│                           │");
		System.out.println("\t\t\t\t\t\t│       2. 베 이 킹 하 기              │");    
		System.out.printf("\t\t\t\t\t\t ───────────────────────────\r");		
		System.out.println("\t\t\t\t\t\t원하는 행동을 선택해주세요");
		
		
		String num = input.nextLine();
		
	
	
		//번호 선택에 따른 행동 
		switch(num)
		{
				case "1" :
					
					myBaker.check(); 	//제빵사 클래스의 재료확인 메소드로 이동 
	
					break;
				
				case "2" :
					open_time = myBaker.baking(open_time);	//제빵사 클래스의 베이킹 메소드로 이동한 후 제빵 시간을 반환함
		
					
					
					break;
	
					
		}
		
	
		return open_time; //오픈 시간에 베이킹 시간을 합산해서 반환해주어 프로그램 동작 시간을 조절할 수 있게 함
	}	
				
				
	
	
	
}


