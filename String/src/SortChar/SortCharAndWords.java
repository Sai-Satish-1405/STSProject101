package SortChar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

  
public class SortCharAndWords {

	public static void main(String[] args) {
		
	String str= "The quick brown fox jumps over the lazy dog";
		
	int count=0;	
	int count1=0;
		//Spaces Removval
		//Split with each character
		//Change to LowerCase
		//Remove duplicates
		//Sort ASC
		//Sort DESC sorted(Comparator,reverseOrder())
		
		
	List<String> st=Arrays.stream(str.replaceAll("\\s+", "").split(""))
						  .map(String::toLowerCase)
						  .distinct()
						  .sorted(Comparator.reverseOrder())
						  .collect(Collectors.toList());
	
	System.out.println(st);
							
							
	
							for(String s:st) {
								count++;
								
							}
							System.out.println(count);
							
							
	
	
							
	//sort words in order
							
							
List<String> words=	Arrays.stream(str.split(" "))
						  .map(String::toLowerCase)
						  .sorted()   //ASC
						 // .distinct()
						 // .sorted(Comparator.reverseOrder())
					      .collect(Collectors.toList());
			
	System.out.println(words);	
	
	
						for(String s:words) {
							count1++;
						}

						System.out.println(count1);
						
}
	
}