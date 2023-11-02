package SortChar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortOnLastName {

	public static void main(String[] args) {
		
		List<Person> per =Person.personList();
		
		//per.forEach((e)->System.out.println(e.getLname()));
		
	
	per.stream().map(Person::getLname).distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
	///map  why ??

	}

}

class Person{
	String fname,lname;
	int age;
	
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	public static List<Person> personList(){
		
		List<Person> al =new ArrayList<Person>();
					 al.add(new Person("sai", "satish", 24));
					 al.add(new Person("sai ", "charan", 22));	
					 al.add(new Person("sasi","charan" , 25));
					 al.add(new Person("srikanth", "satish", 21));
					 al.add(new Person("sasikanth", "satish", 30));
					 al.add(new Person("sasikanth", "ajay", 30));	
		return al;
		
	}
	
}