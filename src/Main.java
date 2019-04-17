import java.util.Scanner;

import Character.Character;
import Frame.TimeControl;


/**
 * 베이커리 경영 시뮬레이션 게임(타이쿤)
 * 
 * @author Yonghui Shim
 * @version 2.0(2019.04.15)
 * @since 1.0 (2019.03.29)
 */


public class Main {

	
	//게임 화면 해상도 설정
	public static final int SCREEN_WIDTH = 1280; 
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-gener\ated method stub
		
		
		/*
		 * 자바스윙연습(현재 실행 내용과 무관, 추후 GUI 적용시 참고)
		 
		Tab myTab = new Tab();
		MainPage myMainPage = new MainPage();
		
		
		new Tab();
		
		new MainPage();
			
		 */	
	
		//필요 객체 생성 부분
		Scanner input = new Scanner(System.in);
		Character myCharacter = new Character();
		TimeControl myTimeControl = new TimeControl();
	
		
		
	
		
		//게임 타이틀 출력
		System.out.println("*******************************************************");
		System.out.println("_____  _ ___  ___ ______   ___   _   __ _____ ______"); 
		System.out.println("|_   _|( )|  \\/  | | ___ \\ / _ \\ | | / /|  ___|| ___ \\");
		System.out.println("  | |  |/ | .  . | | |_/ // /_\\ \\| |/ / | |__  | |_/ /");
		System.out.println("  | |     | |\\/| | | ___ \\|  _  ||    \\ |  __| |    / ");
		System.out.println(" _| |_    | |  | | | |_/ /| | | || |\\  \\| |___ | |\\ \\ ");
		System.out.println(" \\___/    \\_|  |_/ \\____/ \\_| |_/\\_| \\_/\\____/ \\_| \\_|");
		System.out.println("*******************************************************");		
		
		//게임 안내문 출력
		System.out.println("[ 게임 안내문]");
		System.out.println("I’m Baker 체험단에 선정되신 것을 환영합니다.");
		System.out.println("당신은 오늘 12시간동안 자신만의 빵집을 운영하며 실제 제빵사가 될 기회가 주어졌습니다.");
		System.out.println("1인이 운영하는 빵집으로 가게 오픈 3시간 전부터 제빵을 시작하여 손님맞이를 경험할 수 있습니다.");
		System.out.println("");
		System.out.println("[주요 일과]");
		System.out.println("제빵 : 주어진 레시피를 참고합니다. 계량/재료 넣는 순서/굽는 시간이 제과의 맛에 영향을 주기때문에 신중히 작업해야 합니다.");
		System.out.println("손님응대 : 손님이 원하는 제과가 있는 경우 ‘서비스 만족도’가 높아지며 제과의 맛에 따라 ‘맛에 대한 만족도’를 결정합니다. ");
		System.out.println("\t손님에 따라 응대하는 방법이 다르니 적절히 대처해주세요.");
		System.out.println("");		
		System.out.println("[게임 종료 후]");
		System.out.println("12시간이 경과하면 빵집 운영이 종료되고 '하루 매출액과 만족도'을 평가하여");
		System.out.println("평가 기준 이상의 성공적인 운영을 한 경우 매출액 두배의 상금을 드리고 평가 기준에 미달하면 남은 빵을 상금으로 드립니다.");
		System.out.println("");
		System.out.println("");
		System.out.println("자, 시작되셨으면 '엔터'키를 눌러주세요");
		
		String start = input.nextLine();
		
		
		
		
		//게임 시작 시간 지연 스레드 
				
		System.out.print("\t\t\t\t\t\t오늘 단하루 ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("일일 ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("제빵사가 된 ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("당신 ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//게임을 일정시간 반복시키기 위한 객체 생성
		 myTimeControl.TimeControl();
	
	
		
	    
	}

 		
}

	
					
			
	
	

