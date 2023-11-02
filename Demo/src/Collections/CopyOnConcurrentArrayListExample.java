package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnConcurrentArrayListExample extends Thread{
	
	static CopyOnWriteArrayList<String> l= new CopyOnWriteArrayList<String>();
	 public	void run() {
			l.add("5");
			l.add("4");
		}

//INSERTION	 
	public static void main(String[] args) throws InterruptedException   {
		
		 List<String> al=new ArrayList<String>();
		 al.add("ONE");
		 al.add("TWO");
		 al.add("THREE");
		 
		 l.add("FOUR");
		 l.add("Five");
		 l.addAll(al);
		 
	System.out.println(l  +" Before Adding "+ al); 
	
	CopyOnConcurrentArrayListExample CoCA = new CopyOnConcurrentArrayListExample();
	
									 CoCA.run();
									 
						//Thread.sleep(1000);		
						
						
		System.out.println(l);	
		
		//iteration
	
	  al.stream().iterator().forEachRemaining(System.out::print);
	  l.stream().forEachOrdered(System.out::print);
	
	  
		
//DELETION	
	  
	//  Thread.sleep(1000);
	  al.remove(1);
	  al.remove("ONE");
	  
	  System.out.println("\n"+al);
	  
	  
//UPDATION
	  
	 // Thread.sleep(1000);
	  al.set(0, "Three");
	  
	  
	  System.out.println(al);
		
		
		
	}

}
