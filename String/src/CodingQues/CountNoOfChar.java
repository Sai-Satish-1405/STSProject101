package CodingQues;



public class CountNoOfChar {
	
	
static void vowelAndconso_Count(String str){
	
	long vow=str.chars().filter(ch ->(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='U'||ch=='u')).count();
	
	long tot=str.chars().count(); //total no of 
	
	long woWhiteSpace=str.chars().filter(c -> c==' ').count();  //remove white space
	
	
	
		System.out.println("Totals vowels are : " + vow);
		System.out.println("Total Characters are : "+tot +" "+" Total whitespaces are : "+woWhiteSpace +"\nSo, Consonants are : "+(tot-woWhiteSpace-(vow)));
		
		
	}



	public static void main(String[] args) {
		String str="The name is Bond ! JamesBond  .";
		
		vowelAndconso_Count(str);	

	
		
	}

}
