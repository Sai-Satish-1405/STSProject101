package com.designPattern.behavioural;

interface Shape_Facade {
	void draw();

}
/////////.............Implementations..........//////////////
class Rectangle implements Shape_Facade{

	@Override
	public void draw() {
	System.out.println("Rectangle is drawn");	
			
	}
}

class Parallelogram implements Shape_Facade{

	@Override
	public void draw() {
	System.out.println("Parallelogram is drawn");			
	}	
}

class Rhombus implements Shape_Facade{

	@Override
	public void draw() {
		System.out.println("Rhombus is drawn");
	}	
}

class Kite implements Shape_Facade{

		@Override
		public void draw() {
			System.out.println("Kite is drawn");
		}			
}

class Trapezium implements Shape_Facade{

			@Override
			public void draw() {
				System.out.println("Trapezium is drawn");
				
			}
}			

/////////.......FACADE Class..........////////////////
class ShapeFactoryFacade{
	Shape_Facade rectangle=new Rectangle();
	Shape_Facade parallelogram=new Parallelogram();
	Shape_Facade Rhombus =new Rhombus();
	Shape_Facade Kite=new Kite();
	Shape_Facade Trapezium=new Trapezium();
	
	void drawRectangle(){ System.out.println("Draw Rectangle");   }
	void Parallelogram(){ System.out.println(" Draw Parallelogram");   }
	void drawTrapezium(){  System.out.println("Draw Trapezium");  }
	void drawKite(){   System.out.println("Draw Kite"); }
	void drawRhombus(){ System.out.println("Draw Rhombus");   }

}
///////Client Class///////////////////		
class shapeFactoryClient{
	
	public static void main(String[] args) {
		ShapeFactoryFacade sf =new ShapeFactoryFacade();
		sf.drawKite();
		sf.drawRectangle();
		sf.drawRhombus();
		sf.drawTrapezium();		
		
	}
}

	
	
