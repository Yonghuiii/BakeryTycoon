package Frame;

import Thread.Music;

public class TimeControl {
	
	 //게임 운영 시간 변수 
	 int open_time = 0;
	
	
	 //필요 객체 생성 부분
	 Home myHome = new Home();
	
	 End myEnd = new End();
	
	

	public void TimeControl() {
		// TODO Auto-generated method stub
		
		// 배경음악 스레드
		try {
			Music bgm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\Classic.mp3");
			bgm.start();

			Thread.sleep(1);

		} catch (InterruptedException e) {
			System.out.println(e);
		}	
	
		
		 //게임을 180분 동안 진행시키기 위한 반복문
		 while(open_time<180)
		 {
			 //제빵사에게 행동을 안내하는 홈 화면으로 이동하고 베이킹 단계 후 게임 동작을 컨트롤하기 위한 시간 변수를 받아옴
			 open_time = myHome.home(open_time); 
		 }

		 
		 //영업 종료 안내문 출력
		 System.out.println("오픈한지 " + open_time/60 + "시간("+open_time+")분째입니다. 오늘 영업이 끝났네요!!!");

		 //운영 결과를 안내해주는 결과값 출력
		 myEnd.End();
		
	}

	 
	 
	
}
