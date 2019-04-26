package introduction;

import java.util.Scanner;

public class continueswitch {
	int a,b,i;
	Scanner s=new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter a");
		a=s.nextInt();
		System.out.println("Enter b");
		b=s.nextInt();
		
	}
	
	
	public void sum() {
		i=a+b;
		}
	
	public void minus() {
		i=a-b;
	}
	
	public void product() {
		i=a*b;
	}
	
	public void divide() {
		i=a/b;
	}
	
	public void display() {
		System.out.println("Output is"+i);
	}
	
	public void switching() {
		System.out.println("Enter 1 for sum");
		System.out.println("Enter 2 for minus");
		System.out.println("Enter 3 for product");
		System.out.println("Enter 4 for divide");
		int p=s.nextInt();
		switch(p)
		{
		case 1:
			input();
			sum();
			display();
			switching2();
			break;
		case 2:
			input();
			minus();
			display();
			switching2();
			break;
		case 3:
			input();
			product();
			display();
			switching2();
			break;
		case 4:
			input();
			divide();
			display();
			switching2();
			break;
			default:
				System.out.println("Invalid input");
				switching();
			
			
		}
		
	}
	
	public void switching2() {
		System.out.println("Press 1 to continue");
		System.out.println("Press 2 to exit");
		int r=s.nextInt();
		switch(r) {
		case 1:
			switching();
			break;
		case 2:
			break;
			default:
				System.out.println("Invalid input");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		continueswitch c=new continueswitch ();
		c.switching();
	
	}

}
