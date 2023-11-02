package CodingQuesNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DoubleOddEven {

	public static void main(String[] args) {
		
	List<Integer> al= Arrays.asList(1,2,3,4,5,6,6,6,7,8,9,10);
	//double even
	
	 List<Integer> doubleEven=al.stream().filter(x ->x%2==0).map(x->x*2).collect(Collectors.toList());
	 System.out.println(doubleEven);
	 
	 //get distinct
	Set<Integer> dis= al.stream().collect(Collectors.toSet());
	 List<Integer> dis1= al.stream().distinct().collect(Collectors.toList());
	
	System.out.println(dis);
		
		
	}

}
