package Arrays;

import java.util.Arrays;

public class ArrayChunks {
	
public static void main(String [] args) {
	
	
	int [] original= {0,1,2,3,4,5,6,7,8,9};
	int ol=original.length;
	int givenIndex=7;
	
	System.out.println("Given index :" +givenIndex );
	
	System.out.println("At given Index");
	int []arraypartone=Arrays.copyOfRange(original, 0, givenIndex);
	int []arrayparttwo=Arrays.copyOfRange(original,givenIndex , ol);
	
	System.out.println(Arrays.toString(arraypartone) +" "+Arrays.toString(arrayparttwo));
	
	System.out.println("At Half Index");
	System.out.println(ol/2);
	int []arrayPartone_Half =Arrays.copyOfRange(original, 0, ol/2);
	int []arrayParttwo_Half =Arrays.copyOfRange(original, ol/2, ol);
	System.out.println(Arrays.toString(arrayPartone_Half)+" "+ Arrays.toString(arrayParttwo_Half));
	
	
	System.out.println("into N parts");
	
	 
	
	
	
	
}




	
	
	
	 
	 
	
	

}
