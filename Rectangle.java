public class Rectangle
{
int l,b;
Rectangle()
{
l=10;
b=20;
}
Rectangle(int x,int y)
{
l=x;
b=y;
}
int area()
{
return(l*b);
}
}
class Area
{
public static void main(String[ ] args)
{
Rectangle rect1=new Rectangle();
int a1=rect1.area();
System.out.println("Area of rectangle 1= "+a1);
Rectangle rect2=new Rectangle(5,10);
System.out.println("Area of Rectangle 2="+rect2.area());
}
}
