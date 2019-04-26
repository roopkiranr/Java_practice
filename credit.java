package introduction;

import java.util.Scanner;

public class credit {
	int acc=123;
	int amt=10000;
	int a,p,c,d,r,amt2;
	Scanner s=new Scanner(System.in);
	
	public void details() {
		System.out.println("Enter account no");
		a=s.nextInt();
			
	}
		
	
	
	public void select(){
		System.out.println("Enter 1 for credit");
		System.out.println("Enter 2 for debit");
		System.out.println("Enter 3 to check balance");
		p=s.nextInt();
		switch(p)
		{
		case 1:
			details();
			credit1();
			balance();
			select2();
			break;
		case 2:
			details();
			debit();
			balance();
			select2();
			break;
		case 3:
			details();
			balance();
			select2();
			break;
			default:
				System.out.println("Invalid input");
			
		}
		
	}
	
	public void credit1() {
		if(a==acc) {
		System.out.println("Enter amount to be credited");
		c=s.nextInt();
		amt=amt+c;
		}
		else {
			System.out.println("Invalid account no");
		}

		}
	
	public void debit() {
		if(a==acc) {
		System.out.println("Enter amount to be debited");
		d=s.nextInt();
			if(d>amt) {
				System.out.println("Enter valid amount");
			}
			else
			{
				amt = amt-d;
			}
		
		}
		else {
			System.out.println("Enter valid account number");
		}
	
		
	}
	public void balance() {
		System.out.println("new balance  = "+amt);
	/*	if (p==1) {
			
			System.out.println("New balnce is "+amt2);
		}
		else if(p==2) {
			amt2=amt-d;
			System.out.println("New balance is "+amt2);
		}
		else {
			amt2=amt;
			System.out.println("New balance is "+amt2);
		}*/
	}
	
	public void select2() {
		System.out.println("Enter 1 to continue");
		System.out.println("Enter 2 to exit");
		r=s.nextInt();
		switch(r) {
		case 1:
			select();
			break;
		case 2:
			break;
			default:
				System.out.println("Enter valid input");
		}
		
	}
	

	public static void main(String[] args) {
		credit o=new credit();
		o.select();

	}

}
