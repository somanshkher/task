package task;
import java.util.Scanner;
public class evenodd
{
	public static void main(String[] args)
	{
	    int number;
	    Scanner in= new Scanner(System.in);
	 
	    System.out.println("Enter a number to check even or odd");
	    number=in.nextInt();
	 
	    if((number & 1)==0){
	        System.out.println(+number+" is Even number");
	    }
	    else
	    {
	        System.out.println(+number+" is Odd Number");
	    }
	
	}
}
		

	


