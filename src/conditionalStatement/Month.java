package conditionalStatement;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) 
	{
		    Scanner in = new Scanner(System.in);
	        System.out.print("Input month number: ");
	        int month = in.nextInt();

	        System.out.println(getNumberDays(month));
	    
	}
	    // Get the name for the Week
	       public static String getNumberDays(int month) {
	        String dayNumber = "";
	        switch (month) {
	            case 1: dayNumber = "Monday"; break;
	            case 2: dayNumber = "Tuesday"; break;
	            case 3: dayNumber = "Wednesday"; break;
	            case 4: dayNumber = "Thursday"; break;
	            case 5: dayNumber = "Friday"; break;
	            case 6: dayNumber = "Saturday"; break;
	            case 7: dayNumber = "Sunday"; break;
	            default:dayNumber = "Invalid day range";
	        }
	        return dayNumber;

	}

}
