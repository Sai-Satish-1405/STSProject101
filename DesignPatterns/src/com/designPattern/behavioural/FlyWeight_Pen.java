package com.designPattern.behavioural;

import java.util.HashMap;

/////////////////Interface Pen//////////////////
 interface Pen {
	void setColor(String color);
	void draw(String Content);
}
 //////////////Varieties ////////////////////////////
 
 enum Brushsize{
	 Thin,Thick,Medium
 }
 
 ////////////////SubClasses///////////////////////////
 class ThinPen implements Pen{

	private String color;                       //Intrinsic State

	@Override
	public void setColor(String color) {
		this.color=color;
		
	}

	@Override
	public void draw(String Content) {
		System.out.println(" Draw ThinBrush with "+ color);
		
	}
	 
 }
 
 class ThickPen implements Pen{

	private String color;

	@Override
	public void setColor(String color) {
		this.color=color;
		
	}

	@Override
	public void draw(String Content) {
		System.out.println(" Draw ThickBrush with "+ color);
		
	}
	 
 }
 
 class MediumPen implements Pen{

	private String color;

	@Override
	public void setColor(String color) {
		this.color=color;
		
	}

	@Override
	public void draw(String Content) {
		System.out.println(" Draw MediumBrush with "+ color +"Brush");
		
	}
	 
 }
 /////////////// FactoryClass //////////////////////

 class PenFactory{
	 
	 static  final HashMap<String,Pen> penMap=new HashMap<>();
	 		
	 
	 		public static	Pen getThinPen(String color) {
	 				String key=color+"-Thin";
	 				
	 			Pen pen=penMap.get(key);
	 				
	 				if(pen !=null) {
	 					return pen;
	 				}else {
	 					pen=new ThinPen();
	 					pen.setColor(color);
	 					penMap.put(key, pen);
	 				}
	 				
					return pen;
	 				
	 			}
	 			
	 			public static	 Pen getThickPen(String color) {
	 				String key=color+"-Thick";
	 			
	 				Pen pen =penMap.get(key);
	 				
	 				if(pen!=null) {
	 					return pen;
	 				}else {
	 					pen =new ThickPen();
	 					pen.setColor(color);
	 					penMap.put(key, pen);
	 					
	 					
	 				}
	 				
	 				
	 				return pen;
	 				
					
	 				
	 			}
	 			 
	 		public static	 Pen getMediumPen(String color) {
	 				 
	 				String key=color+"Thin";
	 				Pen pen=penMap.get(key);
	 				
	 				if(pen!=null) {
	 					return pen;
	 					
	 				}else {
	 					pen=new MediumPen();
	 					pen.setColor(color);
	 					penMap.put(key, pen);
	 				}
					return pen;
	 				
	 			} 
	 
 }
 
 
 /////////////ClientClass///////////////////////////
 
 class PenFactoryExample {
	 
	 public static void main(String[] args) {
		 
		Pen thinyellow = PenFactory.getThinPen("Yellow");
		thinyellow.draw("hello");System.out.println("|| HashCode :" +thinyellow.hashCode());
		Pen thinyellow2 = PenFactory.getThinPen("Yellow");
		thinyellow2.draw("hello");System.out.println("|| HashCode :" +thinyellow.hashCode());
		Pen thinyellow3 = PenFactory.getThinPen("Yellow");
		thinyellow3.draw("hello");System.out.println("|| HashCode :" +thinyellow.hashCode());
		
		Pen thingreen=PenFactory.getThinPen("Green");
		thingreen.draw("hello"); System.out.println("|| HashCode :"+thingreen.hashCode() );
		
		 Pen yellowthick =PenFactory.getThickPen("Yellow");
		 yellowthick.draw("hello");System.out.println("|| Hashcode :"+yellowthick.hashCode());
		 
		 Pen yellowthick2 =PenFactory.getThickPen("Yellow");
		 yellowthick2.draw("hello");System.out.println("|| Hashcode :"+yellowthick.hashCode());
		 
		 
		 
		 
	 }
	 
 }
 