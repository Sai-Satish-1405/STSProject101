package com.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
	
		
		 List<String>arrList=	Arrays.asList("hur6ray","Key:","","","Konsumer?","///","-");  // Array to List-Arrays.asList();
		 System.out.println(arrList);
		 Object[] arrList1=arrList.toArray();							//list to Array-var.toArray();
		 System.out.println(Arrays.deepToString(arrList1));				// print Arrays.toString(arrVariable);    2d Array
		 																//	     Arrays.deepToString(arrVariable);	 Multi Dimension Array			
//Counting Empty String							
		  long countEmpty=arrList.stream().filter(x->x.isEmpty()).count();
		  System.out.println("empty count is : " +countEmpty);
		  
//Count String whose length is more than three	
	long	countarrList3= arrList.stream().filter(x->x.length()<3).count();
	System.out.println("greater than 3 size is :"+countarrList3);
	
//Count number of String which starts with "a"	
	long countarrListwitha=arrList.stream().filter(x->x.startsWith("K")).count();
	System.out.println("Count Array starts with A  : " + countarrListwitha);
//Remove Empty String							
	  List<String> RemoveEmpty= arrList.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
	  System.out.println("Remove are is : " +RemoveEmpty);
//Create a List with String more than 2 characters
	  List<String> arrlistmore2char =arrList.stream().filter(x->x.length()>2).collect(Collectors.toUnmodifiableList());
	  System.out.println(arrlistmore2char); 
// Convert String to uppercase and Join them with coma	  
	 String  arrlistUpper=arrList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
	 List<String>  arrlistUpper2=arrList.stream().map(x->x.toUpperCase()).filter(x->!x.isEmpty()).collect(Collectors.toList());
	 System.out.println("Upper Case  no empties :"+arrlistUpper2+ "upper case with empties"+arrlistUpper);
//Create a List of the square of all distinct numbers	 
	 List<Integer> arryNumList=	Arrays.asList(9,10,22,22,25,25,18,91,20);
	 List<Integer> squareArray=arryNumList.stream().map(x->x*x).distinct().collect(Collectors.toUnmodifiableList());
	 System.out.println(squareArray);
//summary statistics	
	 IntSummaryStatistics  maxval=arryNumList.stream().mapToInt(x->x).summaryStatistics();
	 System.out.println(maxval+" " +maxval.getSum());
	 

	 
	 
	 
//Flat Map to show even odd,primes
	 
List<Integer>even=Arrays.asList(2,4,6,8,10,12,14,16,18,20,22);
List<Integer>odd=Arrays.asList(1,3,5,7,9,11,13,15,17,19);
List<Integer>primes=Arrays.asList(2,3,5,7,11,13,17,19,23);

Set<Integer> numbers=Stream.of(even,odd,primes).flatMap(x->x.stream()).sorted().collect(Collectors.toSet());

Set<Integer> oddeven=Stream.concat(even.stream(), odd.stream()).collect(Collectors.toSet());  //or .distinct

System.out.println(numbers);
System.out.println(oddeven);

List<Integer>unsorted=Arrays.asList(82,07,36,50,17,181,130,17,119,293);
Set<Integer> sortred=unsorted.stream().sequential().collect(Collectors.toSet()); ////r&d
List<Integer> sorted1=unsorted.stream().sorted().distinct().collect(Collectors.toList());

System.out.println(sorted1);


 new Thread(()->System.out.println("ThreadStarted")).start();

 
 
 //3  ways to convert stream to Array
 
 
 //1.Stream to Object Array.
        Stream<String> loans =Stream.of("Car Loan","BikeLoan","HomeLoan","Personal Loan");
    Object[] objArray =loans.toArray();
 System.out.println(Arrays.toString(objArray));
 
 //2. A stream of T to an array of T via Stream.toArray() and lambda expression. (Stream to Integer arr)
 //Stream of Integers is converted into Integer array

  Stream powerOfTen=Stream.of(1,10,100,1000,10000,100000);
      // Object[]  tenArray=powerOfTen.toArray();
  Integer [] tenArray=(Integer[]) powerOfTen.toArray(x->new Integer[x]);
  System.out.println(Arrays.toString(tenArray));
  
 
  //3.Stream of Integer to int[]
  
 ///////////// int[] intArray = powerOfTen.mapToInt(x->x).toArray();
///////////// System.out.println(Arrays.toString(intArray));
  
   //4.Stream of String which is numbers e.g. "1", "2", or "3" then also you can use mapToInt() to first convert String to int and then into an int array  
   // Stream of String ->int->intArray
   
  Stream<String> stringNum = Stream.of("1","2","3","4","5","6","7","8","9");
  				 int[] intarr =stringNum.mapToInt(Integer::parseInt).toArray();
  				 System.out.println(Arrays.toString(intarr));
  


	 /*  Stream to Array in Java 8 using Collector  */ //(old method)
  			Stream powerOfTen2=Stream.of(1,10,100,1000,10000,100000);
  			ArrayList list=(ArrayList) powerOfTen2.collect(Collectors.toCollection(ArrayList::new));
  			Integer [] al=(Integer[]) list.toArray(new Integer[list.size()]); //or .toArray(x->new Integer[x]); or .toArray(Integer[]::new);
  			System.out.println(Arrays.toString(al));
  				 
  			
  			
  			
  			
  			
  	 /*Java 8 Stream to Array via - method reference */

  			Stream<String> cities = Stream.of("London", "Paris", "Tokyo");
  			 String [] citiesArr=cities.toArray(String[]::new);                  //method reference
  			 System.out.println(Arrays.toString(citiesArr));
  			 
  			 
  			 
  			 
  			 
  			/*Java 8 Stream to Array via - method reference */	// FlatMap
  			
  			 List<List<Integer>>  ListofList =Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,10,11,12)); 
  			 List<Integer>  flatlist=ListofList.stream().flatMap(List::stream).collect(Collectors.toList());
  			 
  			System.out.println(flatlist);
  			
  			
  			
  			/* NestedList Arrays-->flattening-->array of integer type   */
  			
  			List<List<Integer>>  ListofList1 =Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,10,11,12)); 
  			Integer[] flatintarr=ListofList1.stream().flatMap(s ->s.stream()).distinct().toArray(Integer[]::new);	
  
  			System.out.println(Arrays.toString(flatintarr));	
  			
  			
  			
  			/* Reduce Vs SummmaryStstistics  */
  			
  			System.out.println("Reduce Vs SummmaryStstistics \n----------------------------- \n");
  			
  			List<Integer> num=Arrays.asList(80,90,100,110,120,130);
  	//list to IntStream	or maptoX needed for summarystats				  	
  					 IntSummaryStatistics  ss=num.stream().mapToInt(x->x).summaryStatistics();
  							 double avg=ss.getAverage(); ;
  							   long sum=ss.getSum();
  			
  							 System.out.println(avg +","+sum + "  With SummaryStatisc terminal operator");
  			
  			
  							 
  			int sum1=num.stream().mapToInt(x->x).reduce(0, (a,b)-> a+b);System.out.println(sum1);
  			int min=num.stream().mapToInt(x->x).reduce(0,(a,b)->a < b ?a:b);System.out.println(min);
  			
  			 
  			
  			
  				Optional<Integer> optionalValue = Optional.ofNullable(10);
  				Optional<Integer> filteredValue= optionalValue.filter(x -> x%2==0);
  				
  				if(filteredValue.isEmpty()) {
  					System.out.println(filteredValue);}
  				else {
  					System.out.println("even");
  				
  				}
  								  
  					
  				
  				Map<String,Integer>map=new HashMap<>();

						
										
									

  				
  				
  				
  				
  				
  			 
	 
	 
	}

}
