package Character;

public class Character {

	public static int moneyBread = 15000; // 초기 금액 변수 
	//public static int moneyMaterial; //재료 가격 변수
	
	//항목별 맛 만족도 변수
	public static int satisfaction_taste_cake = 80;
	public static int satisfaction_taste_pie = 80;
	public static int satisfaction_taste_cookie = 80;
	public static int satisfaction_taste_muffin = 80;
	public static int satisfaction_taste_bread = 80;
	
	//맛 만족도 평균, 서비스 만족도 변수 
	public static int satisfaction_taste = (satisfaction_taste_cake + satisfaction_taste_pie + satisfaction_taste_cookie + satisfaction_taste_muffin + satisfaction_taste_bread)/5;


}
