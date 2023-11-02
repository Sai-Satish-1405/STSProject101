package com.designPattern.behavioural;

import java.util.ArrayList;
import java.util.List;

interface AccountNumber1 {
	void attachAccounts(DormancyObserver1 d);
	void detachAccounts(DormancyObserver1 d);
	void notifyAccounts();

}

				class Publisher1 implements AccountNumber1 {
					 private  List<String> Acc ;
					List<DormancyObserver1> obList=new ArrayList<>();
					
					List<String> li=new ArrayList<>();
					
					List<String> getAccNum(){
						li.add("4567");
						li.add("5678");
						
						return li ;
						
					}

					@Override
					public void attachAccounts(DormancyObserver1 d) {
						obList.add(d);
						
						
					}

					@Override
					public void detachAccounts(DormancyObserver1 d) {
						obList.remove(d);
						
					}

					@Override
					public void notifyAccounts() {
						for( DormancyObserver1 o:obList) {
							o.dormantAcc(Acc);
						}
							
					
					}
					
					void updateDormant(){
						this.Acc=getAccNum();
						notifyAccounts();
						
					}
					
				}



interface DormancyObserver1 {
	void dormantAcc (List<String> acc);
	
}

				class AM implements DormancyObserver1{

					private List<String> acc;

					@Override
					public void dormantAcc(List<String> acc) {
						this.acc=acc;
						System.out.println("AM" + acc);
						
					}
					
				}
				
				class AH implements DormancyObserver1{
					
					private List<String> acc;

					@Override
					public void dormantAcc(List<String> acc) {
						this.acc=acc;
						System.out.println("AH"+acc);
						
					}
					
				}


				
	class DormancyTest1{
		
		public static void main(String[] args) {
			Publisher1 topic =new Publisher1();
			AM am=new AM();
			AH ah =new AH();
			
			topic.attachAccounts(ah);
			topic.attachAccounts(am);
			
			topic.updateDormant();
			
			
		}
		 
	}
			
				