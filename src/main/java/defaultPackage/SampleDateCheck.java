package defaultPackage;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;



public class SampleDateCheck {

	public static void main(String[] args) {

		System.out.println(currentDate()+3);
		System.out.println(currentMonth());
	}
	public static int currentDate(){
		
		
		
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		return date;
		
	}
	public static String currentMonth(){
		
		DateTimeFormatter year = DateTimeFormatter.ofPattern("YYYY");
		DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
		
		LocalDate localDate = LocalDate.now();
		String yCount=year.format(localDate);
		String mCount=month.format(localDate);
		
		String monthFormat= monthOutput(mCount, yCount);
		
		return monthFormat;
	}
	
	public static String monthOutput(String months, String year){
		

		
		if(months.equals("01")){
			months="January"+" "+year;	
		}if(months.equals("02")){
			months="February"+" "+year;	
		}if(months.equals("03")){
			months="March"+" "+year;	
		}if(months.equals("04")){
			months="April"+" "+year;	
		}if(months.equals("05")){
			months="May"+" "+year;	
		}if(months.equals("06")){
			months="June"+" "+year;	
		}if(months.equals("07")){
			months="July"+" "+year;	
		}if(months.equals("08")){
			months="August"+" "+year;	
		}if(months.equals("09")){
			months="September"+" "+year;	
		}if(months.equals("10")){
			months="October"+" "+year;	
		}if(months.equals("11")){
			months="November"+" "+year;	
		}if(months.equals("12")){
			months="December"+" "+year;	
		}
		
		return months;
	}
	private static String months(boolean equals, String j) {
		// TODO Auto-generated method stub
		return null;
	}

}
