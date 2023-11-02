package CodingQues;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountOfCharOccur {
	
	static String str="COMMITTEE";
	
	static void charOccurance() {
		
		Map<Object, Long>  result = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting())) ;
		System.out.println(result);	
	}
	
	
	
	void vowelCharOccurance(String str) {
			
		Map<Object, Long>  result1 = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting())) ;
		
		List<Entry<Object,Long>> resultVowel=result1.entrySet().stream().filter(x->x.getKey().equals("e")).collect(Collectors.toList());
		
		System.out.println(resultVowel);
	
	}
	
	
	

	


	public static void main(String[] args) {
		
		CountOfCharOccur c= new CountOfCharOccur();
		c.charOccurance();
		c.vowelCharOccurance("COMMITTEE");
		
		
		
	
	
	}

}
