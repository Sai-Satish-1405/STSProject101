package com.designPattern.behavioural;

import java.util.HashMap;

public interface FlyWeight_Shape {
	void setSides(int sides);
	void draw(String shape);

}

enum types{
	Triangle,Square,Pentagon
}

class Triangle implements FlyWeight_Shape{

	private int sides;

	@Override
	public void setSides(int sides) {
		this.sides=sides;
		
	}

	@Override
	public void draw(String shape) {
		System.out.println("Shape with "+ sides +" is = Triangle" );
		
	}
	
}

class Square implements FlyWeight_Shape{

	private int sides;

	@Override
	public void setSides(int sides) {
		this.sides=sides;
		
	}

	@Override
	public void draw(String shape) {
		System.out.println("Shape with "+ sides +" is = Square" );
		
	}
	
}

class Pentagon implements FlyWeight_Shape{

	private int sides;

	@Override
	public void setSides(int sides) {
		this.sides=sides;
		
	}

	@Override
	public void draw(String shape) {
		System.out.println("Shape with "+ sides +" is = Pentagon" );
				
	}
	
}

///////////////////////////FactoryClass////////////////////////////////

class ShapeFactory{
	
	static final HashMap <String,FlyWeight_Shape> shapeMap= new HashMap<>();
	
	
	public static FlyWeight_Shape getTriangle(int sides){
		
		String key = sides+"Triangle";
		 FlyWeight_Shape shape=shapeMap.get(key);
		
		if(shape!=null) {
			return shape;
			
		}else {
			 shape=new Triangle();
			 shape.setSides(sides);
			shapeMap.put(key, shape);
			
		}
		
		
		return shape;
		
	}
	
	public static FlyWeight_Shape getSquare(int sides){
		String key=sides+"Square";
		FlyWeight_Shape shape=shapeMap.get(key);
		
		if(shape!=null) {
			return shape;
			}else {
			shape=new Square();
			shape.setSides(sides);
			shapeMap.put(key, shape);
			
		}
		
		return shape;
		
	}
	
	public 	static FlyWeight_Shape getPentagon(int sides){
		String key=sides+"Pentagon";
		FlyWeight_Shape shape=shapeMap.get(key);
		if(shape!=null) {
			return shape;
			
		}else {
			shape=new Pentagon();
			shape.setSides(sides);
			shapeMap.put(key, shape);
			
		}
		
		return shape;		
	}
	
}

//////////////////////Client Class//////////////////////////////////////
class ShapeExample{
	
	public static void main(String[] args) {
		
		FlyWeight_Shape tri =ShapeFactory.getTriangle(3);
		System.out.println(tri.hashCode());
		tri.draw("Drawing");
		
		FlyWeight_Shape tri2 =ShapeFactory.getTriangle(3);
		System.out.println(tri2.hashCode());
		tri2.draw("Drawing");
		
		FlyWeight_Shape square =ShapeFactory.getSquare(4);
		System.out.println(square.hashCode());
		square.draw("Drawing");
			
		
		FlyWeight_Shape pentagon=ShapeFactory.getPentagon(5);
		System.out.println(pentagon.hashCode());
		pentagon.draw("Drawing");
		
		FlyWeight_Shape pentagon2=ShapeFactory.getPentagon(5);
		System.out.println(pentagon2.hashCode());
		pentagon2.draw("Drawing");
		
	}
	
	
	
}




