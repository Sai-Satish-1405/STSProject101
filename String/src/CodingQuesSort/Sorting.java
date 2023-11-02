package CodingQuesSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sorting {
	
	
	public static void main(String[] args) {
		
//List Sorting
		
	List<Integer> list=Arrays.asList(1,2,999,7,9,99,100,12,16);
		
		Collections.sort(list);    //ASC
		Collections.sort(list,Comparator.reverseOrder());//DSC

		System.out.println(list);
		
//Arrays Sort		
		
	Integer[] num=new Integer[] {1,2,1525,26,26,29,50,70};
			
		
	    Arrays.sort(num);
	
			System.out.println(    Arrays.toString(num)   );	
		
		Arrays.sort(num,Collections.reverseOrder()); //
		
			System.out.println(Arrays.toString(num));
			
		Arrays.sort(num,1,5);
			System.out.println(Arrays.toString(num));   //sorts from Ll to Hl
		
		
	//parallel sorting --divides an array to Sub array in parallel and merged into one back 
			
		
		Arrays.parallelSort(num);
		
			System.out.println(Arrays.toString(num));
			
		Arrays.parallelSort(num,Collections.reverseOrder());
			
		System.out.println(Arrays.toString(num));
			
		
		Arrays.parallelSort(num,1,4);
		
			System.out.println(Arrays.toString(num));
		
//Set Sort
			
			//Set-->List
			//Collections.sort(li);
			//List-->linkedhashset  
			
			Set<Integer> numSet=new HashSet<Integer>();
				numSet.addAll(list);
			System.out.println(numSet);

			List<Integer> sortLi=new ArrayList<Integer>(numSet);
				Collections.sort(sortLi);	
			System.out.println(sortLi);	
			
			Set<Integer> sortSet=new LinkedHashSet<Integer>(sortLi);  //Should be used Linkedhashset
			System.out.println(sortSet);
				
				
	}

}
