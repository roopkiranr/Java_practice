package introduction;

public class function {

	public static void main(String[] args) {
		int i=3, a=10, b=20, c;
		switch (i) {
		case 1:
			c=a+b;
			System.out.println("sum="+c);
			break;
		case 2:
			c=a-b;
			System.out.println("difference="+c);
			break;
		case 3:
			c=a*b;
			System.out.println("product="+c);
			break;
		case 4:
			c=a/b;
			System.out.println("divide="+c);
			break;
			default:
				System.out.println("invalid input");
			
		}

	}

}
