package CodingQuesNum;

import java.util.Arrays;
import java.util.List;


public class SumOfEven {

	public static void main(String[] args) {
	//Sum of Even Integers	
		List<Integer> al =Arrays.asList(1,2,3,4,5);
		int sum=al.stream().filter(x->x%2!=0).mapToInt(x->x).sum();
		System.out.println(sum);
		
		
	//sum of Min and Max 
		 int max=al.stream().mapToInt(x->x).summaryStatistics().getMax();
		 int min=al.stream().mapToInt(x->x).summaryStatistics().getMin();
		 int sumofMaxMin=max+min;
		 
		 System.out.println(sumofMaxMin);
		
	
	}

}
