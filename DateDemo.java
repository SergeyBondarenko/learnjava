import java.util.Date;

public class DateDemo{
	public static void main(String[] args){
		Date myDate = new Date();
		//System.out.println(myDate.toString());
		String strDate = String.format("Current date is %tc\n", myDate);
		System.out.printf(strDate);
	}
}
