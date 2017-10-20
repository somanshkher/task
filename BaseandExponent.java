package task;
import java.util.*;
public class BaseandExponent
{
	public static void main(String[] args)
	{
		  int n,i,j,s=0,exp;

		    Scanner r = new Scanner (System.in);

		    System.out.println("Value of n: ");
		    n = r.nextInt();

		    for(i=1;i<=n;i++)
		    {
		        s = 0;

		        for(j=1;j<=i;j++)
		        {
		            exp = n * n;
		            s = s + exp;
		        }
		    }

	}

}
