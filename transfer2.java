package introduction;

import java.util.Scanner;

public class transfer2 {
	
	int a1,a2,send1,rec1,amt,o,x;
	int send=123; int rec=567;
	int amts=10000;
	int amtr=20000;
	Scanner s=new Scanner(System.in);
	
	public void sender() {
		System.out.println("Enter sender's account number");
		send1=s.nextInt();
		if(send1==send) {
			System.out.println("Enter receiver's account number");
			rec1=s.nextInt();
			if(rec1==rec)
			{
				System.out.println("Enter amount to be transferred");
				amt=s.nextInt();
				if(amt<=amts) {
					amts=amts-amt;
					amtr=amtr+amt;
					newbalance();
					switching();
				}
				else {
					System.out.println("Not enough amount in the account");
				}
			}
			else {
				System.out.println("Invalid acc no");
			}
		}
		else if(send1==rec) {
			System.out.println("Enter receiver's account no");
			rec1=s.nextInt();
			if(rec1==send) {
				System.out.println("Enter amount to be transferred");
				amt=s.nextInt();
				if(amt<=amtr) {
					amtr=amtr-amt;
					amts=amts+amt;
					newbalance();
					switching();
				}
				else {
					System.out.println("Not enough amount in the account");
				}
			}
		}
		else {
			System.out.println("Invalid acc no");
		}
		
	}
	
	public void newbalance() {
		System.out.println("Amount in account 1 "+amts);
		System.out.println("Amount in account 2 "+amtr);
	}
	
	public void switching() {
		System.out.println("Enter 1 to continue");
		System.out.println("Enter 2 to exit");
		x=s.nextInt();
		switch(x)
		{
			case 1:
				sender();
				break;
			case 2:
				break;
				default:
					System.out.println("Invalid input");
		}
		
	}

	public static void main(String[] args) {
		transfer2 o=new transfer2 ();
		o.sender();
		
		

	}

}
