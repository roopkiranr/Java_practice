package introduction;

import java.util.Scanner;

public class transfer {
	int a2,b2,d,c,t,n;
	int acc1=123; int acc2=567;
	int a1=10000; int b1=20000;
	
	Scanner s=new Scanner(System.in);
	
	public void details() {
		System.out.println("Enter debit account number");
		d=s.nextInt();
		validdebit();
		
		
		
	}
	
	public void validdebit() {
		if(d==acc1) {
			System.out.println("Enter credit account number");
			c=s.nextInt();
			validcredit();
			
		}
		else {
			System.out.println("Invalid acc no");
		}
	}
	
	public void validcredit() {
		if(c==acc2) {
			transf();
		}
		else {
			System.out.println("Invalid acc no");
		}
	}
	
	public void transf() {
		System.out.println("Enter amount to be transferred");
		t=s.nextInt();
		if(t>a1) {
			System.out.println("Not enough amount in account A");
		}
		else {
			System.out.println("Transfer successful");
		}
	}
	
	public void switching() {
		System.out.println("Enter 1 for new transfer");
		System.out.println("Enter 2 to exit");
		n=s.nextInt();
		switch(n) {
		case 1:
			details();
			break;
		case 2:
			break;
			default:
				System.out.println("Invalid input");
		}
		
	}
	
	public void newbalance() {
		System.out.println("Balance in account A "+(a1-t));
		System.out.println("Balance in account B "+(b1+t));
	}
	

	public static void main(String[] args) {
		transfer o=new transfer();
		o.details();
		o.newbalance();
		o.switching();

	}

}
