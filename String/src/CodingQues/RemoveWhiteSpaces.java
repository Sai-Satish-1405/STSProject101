package CodingQues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RemoveWhiteSpaces {
	
		static long count =0;
		
	
static	long whiteSpace(String str){
	
		//to print 
		    System.out.println( str.replaceAll("\\s+", "") );
		
		    char[] chArr=str.toCharArray();
		//to count 
				for(char c:chArr) {
					if(c==' ') {
						count++;
					}	
				}
				
		//java 9
				
			Long count8=str.chars().filter(c -> c ==(int)' ').count()	;
			
		//pattern match	
			Pattern pattern = Pattern.compile(" ");
			Matcher matcher=pattern.matcher(str);
			
			if(matcher.find()) {
				++count;
				long count2=count;
					System.out.println(count2);
			}
			
				
						
				System.out.println(count +" "+count8+" ");	
	return count;
		 
	}
		

static	String whiteSpaceReplace(String str) {
	
	String res=str.replaceAll("\\s", "_");
	System.out.println(res);
	
	return res ;
	
}


		

	public static void main(String[] args) {
		
		whiteSpace("The name is Bond ! JamesBond  .");
		whiteSpaceReplace("The name  is Bond! JamesBond ");
			
		
		
		
		
		
		

	}

}
