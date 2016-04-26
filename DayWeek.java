/**
*Author: Michael Schreiber Assignment 7.2/EC 6
*Date: April 25th, 2016 CSC200
*Contact Email: mxs744@gmail.com 
*This Program is designed to tell the user what day of the week by parameter
 * 
 * @author Michael Schreiber
 *
 */

public class DayWeek {
	
	//Done as enumerated, declare
	public enum weekDay {MON,TUE,WED,THU,FRI,SAT,SUN};
	
	weekDay Day;
	int Index;
	
	//Begin with Monday as default
	public DayWeek() {
		this.Day = weekDay.MON;
		Index = 0;
	}
	
	public DayWeek(weekDay day) {
		this.Day = day;
		Index = getIndex(day);
	}
	
	//Starting with Mon as 0
	public int getIndex(weekDay day) {
		int i = 0;
		switch (day) {
		case MON: i = 0; break;
		case TUE: i = 1; break;
		case WED: i = 2; break;
		case THU: i = 3; break;
		case FRI: i = 4; break;
		case SAT: i = 5; break;
		case SUN: i = 6; break;
		}
		return i;
	}
	
	//Case break here
	public weekDay getDay(int Index1) {
		weekDay day1 = weekDay.MON;
		switch (Index1) {
		case 0: day1 = weekDay.MON; break;
		case 1: day1 = weekDay.TUE; break;
		case 2: day1 = weekDay.WED; break;
		case 3: day1 = weekDay.THU; break;
		case 4: day1 = weekDay.FRI; break;	
		case 5: day1 = weekDay.SAT; break;
		case 6: day1 = weekDay.SUN; break;
		}
		return day1;
	}
	
	//Resets the day
	public void setDay(weekDay nday) {
		this.Day = nday;
	}
	
	
	public static String printDay(weekDay day) {
		String day2 = "Monday";
		switch (day) {
		case MON: day2 = "Monday"; break;
		case TUE: day2 = "Tuesday"; break;
		case WED: day2 = "Wednesday"; break;
		case THU: day2 = "Thursday"; break;
		case FRI: day2 = "Friday"; break;
		case SAT: day2 = "Saturday"; break;
		case SUN: day2 = "Sunday"; break;
		}
		return day2;
	}
	
	//Returns selected day
	public weekDay returnDay() {
		return this.Day;
	}
	
	//Returns Next day
	public weekDay returnNextDay() {
		return getDay((getIndex(this.Day)+1)%7);
	}
	
	//Returns previous day
	public weekDay returnPreviousDay() {
		return getDay((getIndex(this.Day)+6)%7);
	}
	
	//Returns the day based on number added
	public weekDay returnAddDay(int num) {
		return getDay((getIndex(this.Day)+num)%7);
	}
	
}