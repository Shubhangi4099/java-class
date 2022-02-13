public class Person{
	int  age = 20;
	String name = "shubhangi";
	public void dispaly(){
		System.out.println(age+" "+name);
	}
	//main method
	public static void main( String[] args){
		Person p = new Person();
		p.dispaly();
	}
}