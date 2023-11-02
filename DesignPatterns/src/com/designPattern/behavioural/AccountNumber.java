package com.designPattern.behavioural;

import java.util.ArrayList;
import java.util.List;

interface AccountNumber{
	
	void attachAccounts(DormancyObserver obj);
	void detachAccounts( DormancyObserver obj);
	void notifyAccounts();
	
}

class Publisher  implements AccountNumber{
	
	List<DormancyObserver> observer;
	private String Acc;
	
	Publisher(){
		
		observer=new ArrayList<>();
	}
	
	String getAccNumber(){
		return "00062726728";
	}
	
	@Override
	public void attachAccounts(DormancyObserver obj) {
		observer.add(obj);				
	}

	@Override
	public void detachAccounts(DormancyObserver obj) {
		observer.remove(obj);	
	}

	@Override
	public void notifyAccounts() {
		for(DormancyObserver ob:observer){
			ob.dormantAccounts(Acc);
			
		}
		
	}
	
	void updateDormant(){
		this.Acc=getAccNumber();
		notifyAccounts();
	}
		
}

//////////////////////////////////////////////////////////////

interface DormancyObserver{ 
	void dormantAccounts(String Acc); 	
}


class AccountManager implements DormancyObserver{
	private String Acc;

	@Override
	public void dormantAccounts(String Acc) {
		this.Acc=Acc;
	System.out.println("Urgent Hey ! AM this Account " + Acc+ " has gone into Dormant Now ");	
		
	}
	
}
class AccountHolder implements DormancyObserver{
	private String Acc;

	@Override
	public void dormantAccounts(String Acc) {
		this.Acc=Acc;
		System.out.println("Dear Account Holder this Account " + Acc+ "has gone into Dormant Now " );	
	}
	
}


class DormantObserverTest{
	
	public static void main(String[] args) {
		
		Publisher topic =new Publisher();
		
		DormancyObserver AM=new AccountManager();
		DormancyObserver AH=new AccountHolder();
		
		topic.attachAccounts(AH);
		topic.attachAccounts(AM);
		
		topic.updateDormant();
		
	}
	
}
