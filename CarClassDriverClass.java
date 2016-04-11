
public class CarClassDriverClass {
	
	String Color;
	int HorsePower;
	Double EngineSize;
	String Make;
	

	public CarClassDriverClass() {
			Color = "White ";
			HorsePower = 250 ;
			EngineSize = 4.0 ;
			Make = "Toyota ";
	}


	public CarClassDriverClass(String Color, int HorsePower, double EngineSize, String Make) {
			this.Color = Color;
			this.HorsePower = HorsePower;
			this.EngineSize = EngineSize;
			this.Make = Make;
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
	public String toString() {
			return "Color: " + this.Color + "HorsePower: " + this.HorsePower + "EngineSize: " + this.EngineSize + "Make: " + this.Make;
	}
}