package CodingQues;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CountOccurance {
	
	
		
	
public boolean myMethod(String s) {

	if(s.matches("[1-9]")) {
		Arrays.stream(s.split("")).distinct();
		return true;
	}
	
	else	
		return false;
	
}
	
	
	public static void main(String[] args) {
		
		String str="committee";
		
		Map<Object, Long> result=Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s->s,Collectors.counting())); 
		
		 System.out.println(result);
		
		
		 CountOccurance c= new CountOccurance();
		 c.myMethod("Satish123");

		 
		 
		 
	}

}
