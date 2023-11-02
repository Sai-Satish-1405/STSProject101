package SortChar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfIntegersInString {
	
	public static void main(String[] args) {
		
		//remove digits [Th quck brn ox ju over the lay d ]
		
		String str="Th3 qu1ck br03n 9ox ju365 over the la5y d09 ";
		int sum=0;
			 
			  char[] charStr=str.toCharArray();
				  for(char ch:charStr) {
					  if( Character.isDigit(str.charAt(ch)) ) {
						 sum=sum+Character.getNumericValue(ch); 
					  }
					 
					  
				  }
					
				
					 
		System.out.println(charStr);
		
	
		
	}
	

}
