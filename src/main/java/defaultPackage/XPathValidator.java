package defaultPackage;

public class XPathValidator {

	public static void main(String[] args) {
		
		System.out.println(xPath(24));

	}

	public static String xPath(int day){
		
		String dateSelection = "//android.widget.TextView[resource-id='com.saudia.SaudiaApp:id/calendar_tv' and text='"+day+"']";
		
		return dateSelection;
	}
}
