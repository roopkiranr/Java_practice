package introduction;

import java.util.Scanner;

public class student {
	int m,e,h,g,t;
	Scanner s=new Scanner(System.in);
	String name;
	public void rollno() {
		System.out.println("Enter roll no:");
		s.nextInt();
		name =s.next();
	    }
	
	public void marks() {
		System.out.println("Enter English marks:");
		e=s.nextInt();
		if(e>100) {
			System.out.println("Invalid input");
		}
		
		System.out.println("Enter Maths marks:");
		m=s.nextInt();
		if(m>100) {
			System.out.println("Invalid input");
		}
		
		System.out.println("Enter History marks:");
		h=s.nextInt();
		if(h>100) {
			System.out.println("Invalid input");
		}
		
		System.out.println("Enter Geography marks:");
		g=s.nextInt();
		if(g>100) {
			System.out.println("Invalid input");
		}
		}
	
	public void total() {
		t=m+e+h+g;
		}
	
	public void remarks() {
		if(t>=350)
		{
			System.out.println("Excellent");
		}
		else if(t>=250 && t<350)
		{
			System.out.println("Good");
		}
		else if(t>=150 && t<250)
		{
			System.out.println("Fair");
		}
		else
		{
			System.out.println("Poor");
		}
	}
	
	public void promoted() {
		if(t>100) {
			System.out.println("Promoted to next class");
		}
		else {
			System.out.println("Detained");
		}
		
	}
	public void switching() {
		System.out.println("Enter 1 for remarks");
		System.out.println("Enter 2 for promoted/detained");
		int p=s.nextInt();
		switch(p)
		{
		case 1:
			rollno();
			marks();
			total();
			remarks();
			switching2();
			break;
		case 2:
			rollno();
			marks();
			total();
			promoted();
			switching2();
			break;
			default:
				System.out.println("Invalid input");
			
			
		}
	}
	
	public void switching2() {
		System.out.println("Enter 1 to continue");
		System.out.println("Enter 2 to exit");
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
		student o=new student();
		o.switching();

	}

}
