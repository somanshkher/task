package task;
import java.util.Scanner;
public class PrimeRange
{
	public static void main(String[] args)
	{
		int a, b, c, flag = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter the lower limit :"); 
        a = s.nextInt();
        System.out.println ("Enter the upper limit :"); 
        b = s.nextInt();
        System.out.println ("The prime numbers in between the entered limits are :");
        for(i = a; i <= b; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
	}
}