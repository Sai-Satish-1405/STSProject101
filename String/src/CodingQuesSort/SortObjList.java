package CodingQuesSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Product{
	 
	 String pName;
	 int id;
	 float pPrice;
	 
	 
	public Product(String pName, int id, float pPrice) {
		super();
		this.pName = pName;
		this.id = id;
		this.pPrice = pPrice;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getpPrice() {
		return pPrice;
	}


	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	
	
	
	
	
}

 class SortObjList {
	 
	    public static int compareByValue(Product a, Product  b){
	    	

	        return  Float.valueOf(a.getpPrice()).compareTo(Float.valueOf(b.getpPrice()));
	    }
	    
 
	 
	 public static void main(String[] args) {
		 
		 List<Product> li=new ArrayList<Product>();
		 			   li.add(new Product("Portable TV", 1, 62000));
		 			   li.add(new Product("SonyTV", 2, 60000));
		 			   li.add(new Product ("SamsungTv", 99, 90000));
		 			   
		 			   
		System.out.println("Sorting on basis of Price");
		
				//Collections.sort(li, (p1,p2)->{return p1.pName.compareToIgnoreCase(p2.pName);});
			Collections.sort(li, SortObjList::compareByValue);   //by using MR
				
				
		 		for(Product p:li)	{
		 			System.out.println(p.id +" "+p.pName+" "+p.pPrice);
		 		}
		 		
		 	//	li.forEach(System.out.println(p));
		 			  
		 		
		 		
		
	}
	 
		
		
		
					  
		
		
}