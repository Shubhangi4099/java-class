package test;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


 
public class Test {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
   //System.out.println("this is shubhangi ");
		//int a = 5;
		//System.out.println(a);
		//float a = 2000f;
		//System.out.println(a);
		//boolean  a = true;
		//System.out.println(a);
		//String a = "this is shubahngi ganbas";
		//System.out.println(a);
		//arithmatic opretors +,-,*,/
		//int a = 30;
		//int b = 60;
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		
		
		
		//grate lerning test
	  /*double a , b;
	   a= 3.0;
	    b = 4.0;
	     double d = Math.sqrt(a *a+b*b);
	     System.out.println(d);*/
		
		
		
		//relational opretors <,>,==,!=
		
		/*
		 int a = 20;
		int b = 50;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
	   */
		
		
		
		
		// logical opretors & | 
		
		/*
		 boolean a = true;
		 boolean b = false;
		  System.out.println(a&b);
		  System.out.println(b&a);
		  System.out.println(a|b);
		  System.out.println(b|a);
		  System.out.println(a&a);
		  System.out.println(b&b);
		 */
		
		
		
		// dision macking statement 
		// if -- statement 
		 //int a = 10;
		 //int b = 20;
		/* if(10<20) {
			 System.out.println("b is grater than a");
		 }*/
		 
		
		
		 // if else stasement 
		 
		 /*
		   if (10>20) {
			   System.out.println("b is grater than a");
		   }
		   else {
			   System.out.println("a is grater than b");
		   }
		*/
		 
		
		
		
		 // if - else if statement(ladder)
	 // exmample 1
		/*
		 int marks = 65;
		 if(marks<50) {
			 System.out.println("fail");
			 
		 }
		 else if (marks>=50 && marks>60) {
			 System.out.println("grate c");
		 }
		 else if (marks>=60 && marks<75) {
			 System.out.println("grate b");
		 }
		 else if (marks>=75 && marks<95) {
			 System.out.println("grate A");
		 }
		 else if (marks>=95 && marks<100) {
			 System.out.println("grate A++");
		 }
		 else {
			 System.out.println("not valid/ invalid");
		 }  */
		
		
		
		// example2
		
		/*
		int number=  12;
		 if(number>0) {
			 System.out.println("POSITIVE");
		 }else if (number<0) {
			 System.out.println("NEGETIVE ");
		 }else {
			 System.out.println("ZERO");
		 }
		 */
		
		
		
		 // LOOPING STATEMENT 
		// two types of looing statement 
		//while loop
		/*int x= 1;
		while(x<=10) {
			System.out.println(x*2);
			x++;
		}
		*/
		
		
		//for loop
		/*for(int i = 0; i <=10;i++) {
			System.out.println(i);
		}
		*/
		
		
		// nested for loop
		/*int n=5;
		
		for(int i=0;i<5;i++) { 
			
			for(int j=0;j<=i;j++) {
				
				System.out.println("***");
			}
			System.out.println();
		}*/
		
		
		// function call in main function
		//shubhu();
		
		// fuction call add
		//add(5,15);
		
		
		//with out static us oject 
		/*
	Test  obj=new Test();
			int x =10;
			int y =20;
			int get_result = obj.add(x,y);
			System.out.println(get_result);
			*/
		
		
		// swapping statement function call
		/*
		int a =10;
		int b =20;
		swap(a,b);
		*/
		
		
		
		// mrthod overloading invok
		
		/*
		int l = 20;
		int w = 30;
		float r = 2.23f;
		int rectangle=area(20,30);
		float circule=area(r);
		System.out.println("area of reacangle i s : "+ rectangle);
		System.out.println("area of circule is :"+ circule);
			*/
		
		
		
		//array in java
		
		/*
		char[] a= new char [5];
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		for(int i = 0;i<5 ; i++) {
			System.out.println(a[i]);
			
		}
		//numerical array 
		int[] b =new int[10];
		for(int i = 0 ;i<10;i++) {
			b[i]=i;
		}
		for (int i = 0 ;i<10 ; i++) {
			System.out.println(b[i]);
		}*/
		
		
		
		//adding 2 array in java
		/*
		int num = 5;
		int a[] = new int[5];
		int b[]= new int[5];
		int c[]=new int [5];
		for(int i=0;i<5;i++) {
			 a[i]=i;
		}
		for (int i=0;i<5;i++) {
			b[i]=num;
			++num;
		}
		System.out.println();
		System.out.println("array of A");
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("array of B");
		for(int i=0;i<5;i++) {
			System.out.println(b[i]+" ");
			
		}
		System.out.println();
		System.out.println("array of C");
		for(int i=0;i<5;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(c[i]+" ");
		}*/
		//multi-dimensioonal array
		/*int num=1;
		int[][] a=new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=num;
				++num;
			}
		}
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" ");
		}*/
		
		
		
		//array list in java 
		/*ArrayList<String> color=new ArrayList<String>();
		color.add("red");
		color.add("yellow");
		color.add("black");
		color.add("green");
		color.add("blue");
		color.add("orange");
		color.set(0, "sky blue");
		System.out.println(color);
		color.remove(4);
		System.out.println(color);
		System.out.println(color.get(0));
		*/
		
		
		//LinkedList in java
		LinkedList<String> shubhu = new LinkedList<String>();
		shubhu.add("shubhangi");
		shubhu.add("rajendra");
		shubhu.add("ganbas");
		shubhu.add("father name");
		shubhu.add("rajendra");
		shubhu.add("motiram");
		shubhu.add("ganbas");
		System.out.println(shubhu);
		shubhu.addFirst("sam");
		System.out.println(shubhu);
		shubhu.addLast("ayush");
		System.out.println(shubhu);
		shubhu.removeFirst();
		System.out.println(shubhu);
		shubhu.removeLast();
		System.out.println(shubhu);
	}
	
	
	// function decraction main k bahar shubhu is non para meteraized function
	/*public static void shubhu() {
		System.out.println("this is shubhangi");
	}*/
      
	
	
	//prarametraized function 
              /*public static	 void add(int num1, int num2) {
            	  System.out.println(num1+num2);
              }*/
	
	
	
	
	//with out static use object
	/*
	public int add(int num1, int num2) {
		int result =num1+num2;
		return result;
	}
	*/
	
	//swapping method 
	/*
	public static void swap(int num1,int  num2) {
		System.out.println("befor swaping a :"+num1+"b :"+num2 );
		int c = num1;
		num1=num2;
		num2=c;
		System.out.println("after swapping a : " + num1 +"b :"+num2);
		
	}
	*/
	//method over loading 
	
	/*
	public static int area(int n1,int n2) {
		int result =n1*n2;
		return result;
	}
	public static float area(float n) {
		float result = 3.14f*n*n;
		return result;
	}
	*/
	

}
