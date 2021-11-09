import java.util.Scanner;

public class Even 
{
	public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
		System.out.println("enter an integer");
		int num = obj. nextInt();
		switch(num%2)
		{
		case 0:
		    System.out.println(num +  "is a even number");
		    break;
		case 1:
			System.out.println(num +  "is a odd number");
			break;
		default:
			System.out.println("is not an odd or even");
			
		}
	}

}
