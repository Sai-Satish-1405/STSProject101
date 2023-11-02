package com.designPattern.behavioural;

interface  Dress {
	public void assemble();
}


class BasicDress implements Dress{

	@Override
	public void assemble() {
		System.out.print("Basic Dress Features &");	
	}
}

//////////////Decorated//////////////

class DecoratedDress extends BasicDress{
	
	protected Dress dress;

	public DecoratedDress(Dress d) {
		super();
		this.dress=d;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}
	
}
///////////Fancy ,Sports ,Party////

class Facncy extends DecoratedDress {

	public Facncy(Dress d) {
		super(d);
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Fancy Dress");
	}
	
	
}

class Sports extends DecoratedDress{

	public Sports(Dress d) {
		super(d);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Sports Dress");
	}
	
}

class Party extends DecoratedDress{

	public Party(Dress d) {
		super(d);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" & Party Dress");
	}
	
}


class DecoratorTest{
	public  static void main(String [] args) throws InterruptedException  {
		
		 Dress basicsportsdress =new Sports(new BasicDress());
		 basicsportsdress.assemble();
		 
		 Thread.sleep(5000); System.out.println("--------------------------");
		 
		 Dress basicSportsParty= new Party(basicsportsdress);
		 basicSportsParty.assemble();

	}
}




















//Structural ::

//Improve code quality 
//Modify object at run time

//Dress
//BasicDress
//Party ,Casual , Sport


//If we want Party ,Casual
//If we want Party ,Sport
//If we want Casual ,Sport  

//We should change at run time

//To decorate on existing object