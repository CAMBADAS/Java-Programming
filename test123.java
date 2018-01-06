public class test123
{
	public static void main(String args[])
	{
		String day="Monday";

		switch (day) {
		        case "MONDAY": System.out.println("Mondays are bad.");
		                     break;

		        case "FRIDAY": System.out.println("Fridays are better.");
		                     break;

		        case "SATURDAY":
		        case "SUNDAY": System.out.println("Weekends are best.");
		                     break;

		        default:     System.out.println("Midweek days are so-so.");
		                     break;
		    }
	}

}