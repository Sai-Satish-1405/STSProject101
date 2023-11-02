package CodingQuesSort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortMalesEmployeesonAvgAge {

	public static void main(String[] args) {
		
		List<Person> roster=	Person.createRoster();
		
		Collections.sort(roster, (a,b)->{ return a.pDob.compareTo(b.pDob);});
			
			for( Person r:roster) {
				
				System.out.println(r.getpName());
			}
		
		// or use 
		
		//Collections.sort(roster,Person::compareByAge );
		
		//or
		
		roster.forEach(System.out::println);
		
		//or
		
		Consumer<Person> elist=e->System.out.println(e.getpName());
		roster.forEach(elist);
		
		
		OptionalDouble  avg=roster.parallelStream().filter(e->e.getpSex().equals(Person.Sex.Male)).mapToInt(x->x.getAge()).average();
		
		System.out.println(avg.getAsDouble());
				
	}

}



// http://www.java2s.com/example/java/lambda-stream/java-calculate-average-age-of-male-members-of-the-collection.html


//bday to get age from



class Person {
	
	enum Sex{
		Male,Female
	}
	String pName;
	String pEmail;
	Sex pSex;
	int age;
	LocalDate pDob;
	
	public Person(String pName, String pEmail, Sex pSex, int age, LocalDate pDob) {
		super();
		this.pName = pName;
		this.pEmail = pEmail;
		this.pSex = pSex;
		this.age = age;
		this.pDob = pDob;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public Sex getpSex() {
		return pSex;
	}

	public void setpSex(Sex pSex) {
		this.pSex = pSex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getpDob() {
		return pDob;
	}

	public void setpDob(LocalDate pDob) {
		this.pDob = pDob;
	}
	
//	public static int compareByAge(Person a ,Person b) {
//		
//		return a.pDob.compareTo(b.pDob);
//		
//	}
	
	
	
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pEmail=" + pEmail + ", pSex=" + pSex + ", age=" + age + ", pDob=" + pDob
				+ "]";
	}

	public static List<Person> createRoster() {
		
		List<Person> roster =new ArrayList<Person>();
		roster.add(new Person("Sai", "sai@gmail.com", Person.Sex.Male, 24, LocalDate.of(1999, 2,10)));
		roster.add(new Person("Satish","satish@gmail.com",Person.Sex.Female,25,LocalDate.of(1980, 2, 10)));
		
			return roster;
		
	}
}