package Thread;

import Bread.Bread;
import Character.Character;
import Character.Customer;
import Character.Grandfa;
import Character.Mam;
import Character.Student;
import Character.Worker;
import Frame.Home;

public class CustomerThread extends Customer implements Runnable{

	int open_time;
	
	Home myHome = new Home();
	Character myCharacter = new Character();
	Customer myCustomer = new Customer();
	Grandfa myGrandfa = new Grandfa();
	Mam myMam = new Mam();
	Student myStudent = new Student();
	Worker myWorker = new Worker();
	Bread myBread = new Bread();

	
	//랜덤하게 들어오는 손님 알려주는 메서드
	public void randomCustomerCome(int open_time) {
		
		//손님 들어올 때 효과음 스레드
		 try {
	            Music bm = new Music("C:\\Users\\adgir\\eclipse-workspace\\BakeryTycoon\\audio\\Door Closing With Bells, Free Sound Effect No Copyright No Royalty.mp3");
	            bm.start();
	           
	            
	            Thread.sleep(1);
	          
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }		
		
		
		{
				//sleep() 스레드로 문 열리는 효과주기 
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 	
			 	for(int i=0; i<2; i++) {
			 		System.out.println("\t\t\t\t\t\t딸 ~ 랑  딸 ~ 랑");
			 		System.out.println("\t\t\t\t\t\t\t\t딸 ~ 랑  딸 ~ 랑");
			 		System.out.println("\t\t\t\t\t\t딸 ~ 랑  딸 ~ 랑");
			 		System.out.println("\t\t\t\t\t\t\t\t딸 ~ 랑  딸 ~ 랑");
			 		
			 	}
			 		
		 		try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	 
			
			 	//랜덤하게 들어온 손님 변수값을 받아오는 변수
			 	Customer.category_Customer = myCustomer.randomCustomer();
				
			 	//각 유형별 손님에 따라 행동을 개시해주는 조건문
				if(Customer.category_Customer == "grandfa")
				{
					myGrandfa.come(myBread);
				
				}
				else if(Customer.category_Customer == "mam")
				{		
					myMam.come(myBread);	
					
				}
				else if(Customer.category_Customer == "student")
				{	
					myStudent.come(myBread);
						
				}
				else if(Customer.category_Customer == "worker")
				{	
					myWorker.come(myBread);
						
				}
			
				
		}
		
		return; 
		
	}
	
	
	public void run() {
		
				try 
				{
					randomCustomerCome(open_time);

					Thread.sleep(100);
			
				}catch(InterruptedException e) 
				{
					e.printStackTrace();
				}	
	
	}
	
	
	
		
}
