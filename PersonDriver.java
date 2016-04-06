
public class PersonDriver {
	public static void main(String args[]) {
		
		Person p1 = new Person("Mike Schreiber", 31);
		Person p2 = new Person("Mike Schreiber", 30);
		Person person = new Person();
		
		System.out.println("Object equal? " + samePerson(p1,p2));
		System.out.println("Same name? " + sameName(p1,p2));
		System.out.println("Same age? " + sameAge(p1,p2));
		System.out.println("First person is older? " + olderAge(p1,p2));
		System.out.println("First person is younger? " + youngerAge(p1,p2));
	}
	public static boolean samePerson(Person person1, Person person2) {
		return (person1.Name.equals(person2.Name)
				&& person1.Age == person2.Age)? true:false;
	}
	
	public static boolean sameName(Person person1, Person person2) {
		return (person1.Name.equals(person2.Name));
	}
	
	public static boolean sameAge(Person person1, Person person2) {
		return (person1.Age == person2.Age)? true:false;
	}
	
	public static boolean olderAge(Person person1, Person person2) {
		return (person1.Age > person2.Age)? true:false;
	}
	
	public static boolean youngerAge(Person person1, Person person2) {
		return (person1.Age < person2.Age)? true:false;
	}
	
	
	
	
}
