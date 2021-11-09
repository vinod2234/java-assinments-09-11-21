import java.util.Scanner;
public class Month 
{
	public static void main(String[] args)
	{
		Scanner me=new Scanner(System.in);
		System.out.println("enter the first three letters of month");
		String month=me.next();
		switch (month)
		{
	    case "jan":
		    System.out.println("january");
		    break;
	    case "feb":
		    System.out.println("february");
		    break;
	    case "mar":
	    	System.out.println("march");
	    	break;
	    case "apr":
	    	System.out.println("april");
	    	break;
	    case "may":
	    	System.out.println("may");
	    	break;
	    case "jun":
	    	System.out.println("june");
	    case "jul":
	    	System.out.println("july");
	    	break;
	    case "aug":
	    	System.out.println("august");
	    	break;
	    case "sep":
	    	System.out.println("sepember");
	    	break;
	    case "oct":
	    	System.out.println("octomber");
	    	break;
	    case "nov":
	    	System.out.println("november");
	    	break;
	    case "dec":
	    	System.out.println("december");
}
	}

}
