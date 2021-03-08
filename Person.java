public class Person{
	int age;
	

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
	public static void main(String[] args){
		Person p1 = new Person(18, "shubhangi");
		Person p2 = new Person(16, "sanju");

		p1.drive();
		p2.drive();
	}
}
