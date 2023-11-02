package DateTimeAPI;

import java.lang.System.Logger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String[] args) {
		
		
		LocalDateTime today=LocalDateTime.now();
		LocalDateTime today1=LocalDateTime.of(LocalDate.now(), LocalTime.now());
		LocalDateTime today2=LocalDateTime.of(2014, 07, 7, 20, 52);
		LocalDateTime today3=LocalDateTime.of(2014, Month.JULY, 7, 20, 52);
			LocalDate today4=LocalDate.ofEpochDay(365);	
			int DormantDate=LocalDate.now().plusDays(180).getDayOfYear();
			LocalDate DormantDate1=LocalDate.now().ofYearDay(LocalDate.now().getDayOfYear(), 1 )	;
		
		
		
		
		
		
		System.out.println(today +"		Today's Time \n" + today1 +" \n" +today2 +"\n"+today3 +"\n"+today4 +"\n"+DormantDate1);
		
		

	}

}
