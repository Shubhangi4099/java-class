
public class Person{
	int age;
	String name;

	public Person(int a, String n) {
		age = a;
		name = n;
	}

	public void drive(){
		if  (age < 18) {
			System.out.println("Can Drive");
		}
		else {
			System.out.println("Learn Driving");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Person p1 = new Person(20, "Shubhangi");
		Person p2 = new Person(20, "Sanjana");
		Person p3 = new Person(20, "Vaishnavi");
    Person p4 = new Person(20, "Priyanka");
    Person p5 = new Person(20, "Kajal");
    Person p6 = new Person(20, "Sayli");
    Person p7 = new Person(20, "Ashwini");
    Person p8 = new Person(19, "Sejal");

		p1.drive();
		p2.drive();
		p3.drive();
    p4.drive();
    p5.drive();
    p6.drive();
    p7.drive();
    p8.drive();
	}
}