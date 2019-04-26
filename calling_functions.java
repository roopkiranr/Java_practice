package introduction;

import java.util.Scanner;

public class calling_functions {
	int x,y,s,m,p,d;
	
	public void inp() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x");
		x=s.nextInt();
		System.out.println("Enter value of y");
		y=s.nextInt();
		}
	
	public void sum() {
		s=x+y;
	}
	
	public void minus() {
		m=x-y;
	}
	
	public void product() {
		p=x*y;
	}
	
	public void divide() {
		d=x/y;
	}
	
	public void display() {
		System.out.println("sum="+s);
		System.out.println("difference="+m);
		System.out.println("product="+p);
		System.out.println("divide="+d);
	}
	
	

	public static void main(String[] args) {
		calling_functions c=new calling_functions();
		c.inp();
		c.sum();
		c.minus();
		c.product();
		c.divide();
		c.display();
		

	}

}
