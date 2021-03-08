abstract class Animal
{
    public abstract void sound();
    }
    public class Dog extends Animal{
        public void sound()
        {
            System.out.println("woooooffff");
        }
        public static void main(String[]args){
            Animal m=new Dog();
            m.sound();
        }
    }