package Interview;

import java.util.function.Predicate;

public class IfContains {
	
	static boolean checkString(String s){
		
		
		Predicate<String> alphaNum = st -> st.matches("\\d+");
		
		boolean testalpN=alphaNum.test("123");
		System.out.println(testalpN);
		
		return testalpN;
		
	}
	
	public static void main(String[] args) {
		checkString("SaiSatish123");
		
		
		
	}

}
