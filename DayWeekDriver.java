import javax.swing.JOptionPane;

public class DayWeekDriver {
	
	public static void main(String[] args) {
		
		
		//Lists choices here
		DayWeek.weekDay[] choices = {DayWeek.weekDay.MON, DayWeek.weekDay.TUE,DayWeek.weekDay.WED, DayWeek.weekDay.THU, DayWeek.weekDay.FRI,DayWeek.weekDay.SAT, DayWeek.weekDay.SUN};
		
		DayWeek.weekDay day = (DayWeek.weekDay) JOptionPane.showInputDialog(null,"Select day","Day",
				
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		
		//Add number of days based on user input as an integer
		int addDay = (Integer.parseInt(JOptionPane.showInputDialog("Enter number of day to add: ")));
		
		DayWeek weekday = new DayWeek(day);
		
		//Output here
		System.out.println("Day chosen: " + DayWeek.printDay(weekday.returnDay()));
		System.out.println("Next day: " + DayWeek.printDay(weekday.returnNextDay()));
		System.out.println("Previous day: " + DayWeek.printDay(weekday.returnPreviousDay()));
		System.out.println(addDay + " Day(s) from now/previous : " + DayWeek.printDay(weekday.returnAddDay(addDay)));
		
		
	}
}