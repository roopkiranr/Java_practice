package introduction;

import java.util.Scanner;

public class methods {
	int a , b ,c;
	
	public void inp() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a");
		a=s.nextInt();
		System.out.println("enter the value of b");
		b=s.nextInt();
	}
	public void sum()
	{
		c = a+b;
	}
	public void display()
	{
		System.out.println(c);
	}
	public int sub()
	{
		c=a-b;
		return c;
	}
	public static void main(String [] args)
	{
		methods  m = new methods();
		m.inp();
		m.sum();
		m.display();
	int z=	m.sub();
	System.out.println(z);
	}

}
