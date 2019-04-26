package introduction;

import java.util.Scanner;

public class callingswitch {
int x,y,m,p,d;
Scanner s=new Scanner(System.in);
	public void inp() {
		
		System.out.println("Enter value of x");
		x=s.nextInt();
		System.out.println("Enter value of y");
		y=s.nextInt();
		}
	
	public void sum() {
		m=x+y;
	}
	
	public void minus() {
		m=x-y;
	}
	
	public void product() {
		m=x*y;
	}
	
	public void divide() {
		m=x/y;
	}
	
	public void display() {
		System.out.println("output is :="+m);
			}

	public void switching() {
		System.out.println("press 1 for sum");
		System.out.println("press 2 for minus");
		System.out.println("press 3 for product");
		System.out.println("press 4 for divide");
	int	f = s.nextInt();
		switch(f)
		{
		case 1:
			inp();
			sum();
			display();
			break;
		case 2:
			inp();
		minus();
		display();
		    break;
		case 3:
			inp();
			product();
			display();
			break;
		case 4:
			inp();
			divide();
			display();
			break;
			default:
				System.out.println("Invalid input");
		}
			
	}

	public static void main(String[] args) {
		callingswitch c=new callingswitch();
	
		c.switching();
	}

}
