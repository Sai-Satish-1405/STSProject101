package com.designPattern.creational;
/////////////////////////////Client Classes////////////////////////////////////////
 abstract class VehicleFactory {
	 public abstract int getwheels();			//Method
	 @Override
	 public String toString() { 
		return "No of wheels are " + this.getwheels();
		 }
	}
 
class Bike extends VehicleFactory {
	
	private int wheels;
	
	Bike(int wheels){
		this.wheels=wheels;	
	}

	@Override
	public int getwheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	} 
 }

class Auto extends VehicleFactory{
	private int wheels;

	Auto(int wheels){
		this.wheels=wheels;
		
	}

	@Override
	public int getwheels() {
		
		return this.wheels;
	}
 }
class Car extends VehicleFactory{
	private int wheels;

	Car(int wheels){
		this.wheels=wheels;	
	}
	@Override
	public int getwheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}
	 
}

//////////////////////////// Static Factory Method////////////////////////////////////////////////////////

  class StaticFactoryMethod{
	  
	  public  static VehicleFactory getIntance(String type,int wheels) {
		  if(type=="car") {
			  return new Car(wheels);
			  
		  }else if(type=="bike"){
			  return new Bike(wheels);
			  
		  }else{
			  return new Auto(wheels);
			  
		  }
		  
		  
	  }
	
}


///////////////////Implementation classes/////////////////////////////////////////////////////////////////
  

class Main {
	
	public static void main(String[] args) {
			
		 VehicleFactory i=StaticFactoryMethod.getIntance("bike", 2);
		System.out.println(i +" for Bike");
		
		
	}
}