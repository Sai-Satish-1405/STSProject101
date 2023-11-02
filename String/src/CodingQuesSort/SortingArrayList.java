package CodingQuesSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortingArrayList {

	public static void main(String[] args) {
		
		
		List<String> al=Arrays.asList("John","James","Farroq","David","Sam","Green","Fergeekson","ashwin","");
		 al.sort(Comparator.naturalOrder());
		// al.sort(Comparator.reverseOrder());

		 System.out.println(al);
		 
		 
		 
		 
		 
		 //
		List<String> skills= Arrays.asList("Java","Spring","Pyton");
	
		System.out.println(skills);
		
		//or
		
		Consumer<String> printSkills= (skill) -> System.out.println(skill);
		
		skills.forEach(printSkills);
					
		 
		 
		 
	}

}
