package CodingQues;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class CountNoOfRepeatedWords {

	public static void main(String[] args) {
		String str="Sai Satish Pallapolu Sai Satish Pallapolu Sai Satish";
		
	Map<Object, Long>	repWords=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));

	Map repwords1=Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	
	Map<Object, Long>	repwords2= Arrays.stream(str.split(" ")).map(String::toLowerCase).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	
	
	System.out.println(repWords +"\n"+ repwords1 +"\n"+repwords2);
	}
	
	
	
	

}
