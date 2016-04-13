/**
*Author: Michael Schreiber Exercise 5.4 This Static Equals 
*Date: April 13th, 2016 CSC200
*Contact Email: mxs744@gmail.com 
**This Program is designed to add a Count to Assignment 5.3
** 
 * @author Michael Schreiber
 *
 */


public class CarCount {
	String Color;
	int HorsePower;
	Double EngineSize;
	String Make;
	static int Count = 0;
	

	public CarCount() {
		
			Color = "White ";
			HorsePower = 250 ;
			EngineSize = 4.0 ;
			Make = "Toyota ";
	}


	public CarCount(String Color, int HorsePower, double EngineSize, String Make) {
			this.Color = Color;
			this.HorsePower = HorsePower;
			this.EngineSize = EngineSize;
			this.Make = Make;
			Count++;
}
	public void setColor(String Color) {
			this.Color = Color;
}
	public void setHorsePower(int newHorsePower) {
			this.HorsePower = newHorsePower;
}
	public void setEngineSize(double newEngineSize) {
			this.EngineSize= newEngineSize;
}
	public void setMake(String newMake) {
			this.Make = newMake;
}
	public String getColor() {
			return Color;
}
	public int getHorsePower() {
			return HorsePower;
}
	public double getEngineSize() {
			return EngineSize;
}
	public String getMake() {
			return Make;
}
	public static int GetCount() {
		return Count;
}
	public boolean equals(CarCount car){
		return this.Color.equals(car.Color) && this.HorsePower == car.HorsePower && this.EngineSize == car.EngineSize && this.Make == car.Make;
		
	}
	public String toString() {
			
			return "Color: " + this.Color + "HorsePower: " + this.HorsePower + "EngineSize: " + this.EngineSize + "Make: " + this.Make;
	}
}

