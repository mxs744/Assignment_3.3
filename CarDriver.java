
public class CarDriver {
	public static void main(String [] args) {
		CarClassDriverClass myCar = new CarClassDriverClass();
		CarClassDriverClass hisCar = new CarClassDriverClass("Black ", 400, 3.5, "Honda");
		CarClassDriverClass herCar = new CarClassDriverClass("Pink ", 300, 2.5, "Volks");
		
		System.out.println("My Car: " +myCar);
		System.out.println("His Car: " +hisCar);
		System.out.println("Her Car: "+herCar);
		
		myCar.setColor("Blue");
		myCar.setHorsePower((650));
		myCar.setEngineSize((6.0));
		myCar.setMake("Ford");
		
		System.out.println("My New Car: " + myCar.getColor() + myCar.getHorsePower() + myCar.getEngineSize() + myCar.getMake());

	}
}
