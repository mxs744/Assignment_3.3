
public class Person {
	String Name;
	int Age;
	
public Person() {
	Name = "Jericho Kane";
	Age = 30;
}
	public Person(String Name, int Age) {
		this.Name = Name;
				this.Age = Age;
			}
			
			public void setName(String newName) {
				this.Name = newName;
			}
			
		
			public String getName() {
				return this.Name;
			}
			
			public void setAge(int newAge) {
				this.Age = newAge;
			}
			
			public int getAge() {
				return this.Age;
			}
		
	}

