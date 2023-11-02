package CodingQuesSort;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;


public class MaleStudentAvgAge {
	
				public static int comparebyEmail(Student a,Student b) {
					
					return a.sEmail.compareTo(b.sEmail);
					
				}

	public static void main(String... args) {
		
		List<Student> roster=Student.createRoster();
		roster.forEach(System.out::println);
		
System.out.println("---------------------------------------");
		
		// before sort
	    roster.forEach((e)-> System.out.println(e.getsName()));
	    
System.out.println("---------------------------------------");	    
	    // after sort in Desc
						
		Collections.sort(roster, Student::compareByage);
		
		roster.forEach((e)-> System.out.println(e.getsName()));
		
		
		 OptionalDouble avgAge=roster.
				 				stream().
				 				filter(x->x.sGender.equals(x.sGender.Male)).
				 				mapToInt(x->x.getAge()).average();
		 System.out.println(avgAge.getAsDouble());
		 
		 //sort by name in built lambda
		 
		 Collections.sort(roster, (a,b)->{ return a.sName.compareTo(b.sName);});
		 
		 roster.forEach((e)->System.out.println(e.getsName()));
		 
		 
		 //sort by email
		 
		 
		 Collections.sort(roster, MaleStudentAvgAge::comparebyEmail);
		 
		 roster.forEach((e)->System.out.println(e.getsEmail()));
		 
   
	}

	
}

class Student{
	
		enum Gender{
			Male,Female
		}
		
	String sName,sEmail;
	LocalDate sBirthday;
	Gender sGender;
	
	public Student(String sName, String sEmail, LocalDate sBirthday, Gender sGender) {
		super();
		this.sName = sName;
		this.sEmail = sEmail;
		this.sBirthday = sBirthday;
		this.sGender = sGender;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public LocalDate getsBirthday() {
		return sBirthday;
	}

	public void setsBirthday(LocalDate sBirthday) {
		this.sBirthday = sBirthday;
	}

	public Gender getsGender() {
		return sGender;
	}

	public void setsGender(Gender sGender) {
		this.sGender = sGender;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sEmail=" + sEmail + ", sBirthday=" + sBirthday + ", sGender=" + sGender
				+ "]";
	}
	
	
	//To extract age in years from birthday
	
	public  int getAge(){
		
		return sBirthday.until(IsoChronology.INSTANCE.dateNow()).getYears();		
	}
	
	public static int compareByage(Student a,Student b) {
		
		return  a.sBirthday.compareTo(b.sBirthday);
		
	}
	
	public static List<Student> createRoster(){
		
		List<Student> sList=new ArrayList<Student>();
					  sList.add(new Student("Sai", "sai@gmail.com", IsoChronology.INSTANCE.date(1999, 05, 14), Student.Gender.Male));
					  sList.add(new Student("Satish", "satish@gmail.com", IsoChronology.INSTANCE.date(1998, 10, 14), Student.Gender.Male));
					  sList.add(new Student("Hedge", "hedge@gnail.com", IsoChronology.INSTANCE.date(1980, 8, 18), Student.Gender.Female));
					  sList.add(new Student("Pooja", "pooja@email.com", IsoChronology.INSTANCE.date(1970, 06, 12), Student.Gender.Female));
					  sList.add(new Student("Hari", "hari@gmail.com", IsoChronology.INSTANCE.date(1990, 9, 15), Student.Gender.Male));
						
		return sList;	
	}
	
	
}