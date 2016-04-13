import javax.swing.JOptionPane;

public class CarDriver1 {
	public static void main(String [] args) {
		CarCount myCar = new CarCount();
		CarCount hisCar = new CarCount("Black ", 400, 3.5, "Honda");
		CarCount herCar = new CarCount("Pink ", 300, 2.5, "Volks");
		CarCount UserCar = new CarCount();
		
		UserCar.setColor(JOptionPane.showInputDialog("Set Color: "));
		UserCar.setHorsePower(Integer.parseInt(JOptionPane.showInputDialog("Choose HorsePower: ")));
		UserCar.setEngineSize(Double.parseDouble(JOptionPane.showInputDialog("Select EngineSize: : ")));
		UserCar.setMake(JOptionPane.showInputDialog("Select Make: "));
		
		JOptionPane.showMessageDialog(null, UserCar.toString());
		System.out.println("Number of cars so far: " + CarCount.Count);
		System.out.println("UserCar equal to my Car? " + UserCar.equals(myCar));
		System.out.println("UserCar equals to his Car? " + UserCar.equals(hisCar));
		System.out.println("UserCar equals to her Car? " + UserCar.equals(herCar));
		
	}
}
