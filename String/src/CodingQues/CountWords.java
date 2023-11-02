package CodingQues;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Alive is awesome I feel alive";
	//Counting no of words in aString	
		
		long wordsStream=Arrays.stream(str.split("\\s+")).count();
   
   			System.out.println("Total no of words are " +wordsStream);
   	//Counting no of spaces in a String	
   			
   		long whiteSpaces=str.chars().filter(c->c==' ').count();	
   		
   			System.out.println("Total no of white spaces are "+whiteSpaces);
   			
   	//String without spaces
   			
   			 String noSpaceString=str.replaceAll("\\s+","");
   			 System.out.println(noSpaceString);

	}

}
