package introduction;

import java.util.Scanner;

public class functions_runtime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter function");
		int i=s.nextInt();
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("sum="+(a+b));
			break;
		case 2:
			System.out.println("difference="+(a-b));
			break;
		case 3:
		    System.out.println("product="+(a*b));
		break;
		case 4:
			System.out.println("division="+(a/b));
			default:
				System.out.println("invalid input");
		}
		
		
		
		
	}

}
