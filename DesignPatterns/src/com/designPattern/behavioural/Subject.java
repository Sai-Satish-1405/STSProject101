package com.designPattern.behavioural;

import java.util.ArrayList;
import java.util.List;

/////////////__Subject_Interface__/////////////////////////////////////////
interface Subject{
	
	void attach(Observer obj);
	void detach(Observer obj);
	void notifyLocation();	 
 }
/////////////__Subject_Subclasses__/////////////////////////////////////////

class DeliveryData implements Subject{

	private String location;
	
	private List<Observer> observer;
	
	DeliveryData(){
		observer=new ArrayList<>();	
	}
	
	@Override
	public void attach(Observer obj) {
		observer.add(obj);			
	}

	@Override
	public void detach(Observer obj) {
		observer.remove(obj);	
	}
	
	@Override
	public void notifyLocation() {
		for(Observer ob:observer){
			ob.updateLocation(location);
			
			
		}
		
	}


	void locationUpdated(){
		this.location=getLocation();
		notifyLocation();
		
	}
	
	
	String getLocation (){	
		return "Area 64";
	}	
	
}

/////////////__Observer_Interface__//////////////////////////////////////////
interface Observer{
	void updateLocation(String location);
		
	
		
	
 }
/////////////__Implentation_Subclasses__//////////////////////////////////////
class Seller implements Observer{

	private String location;

	@Override
	public void updateLocation(String location) {
	this.location=location;
	System.out.println( "Location to Seller updated "+location);
		
	}		
	
}

class Warehouse implements Observer{

	private String location;

	@Override
	public void updateLocation(String location) {
		this.location=location;	
		
		System.out.println( "Location to seller updated "+location);
		
	}
	
	
}

class Customer implements Observer{

	private String location;

	@Override
	public void updateLocation(String location) {
		this.location=location;	
		System.out.println( "Location to Customer updated "+location);
	}
	
}

class ObserverTest{
	public static void main(String[] args) {
		DeliveryData topic =new DeliveryData();
		
		Observer obj1=new Seller();
		Observer obj2=new Warehouse();
		Observer obj3=new Customer();
		
		topic.attach(obj1);
		topic.attach(obj2);
		topic.attach(obj3);
		
		topic.locationUpdated();
		topic.locationUpdated();
				
	}
}
