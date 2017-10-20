package task;
import java.util.Scanner;
public class Schoolpatern
{
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter any word: ");
		Scanner sc= new Scanner(System.in);
		s= sc.nextLine();
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println(s.charAt(j)+ "");
			}
			System.out.println("");
			}
		sc.close();
		}
	

	}

	
