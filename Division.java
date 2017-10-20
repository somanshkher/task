package task;
public class Division

{
	public static void divide(int N, int D)
	{
    int result = 0;

    if (D == 0) 
    {
        System.out.println("Cannot divide by 0");
    }
    else if (N == 0) 
    {
        System.out.println(0);
    }
    else if (N == D)
    {
        System.out.println(1);
    }
    else if (N > 0 && D > 0 && N < D)
    {
        System.out.println(0);
    }
    else
    {
        // both negative
        if (N < 0 && D < 0)
        {
            while (N <= D)
            {
                N += -1 * D;
                result++;
            }
            System.out.println(result);
        }
        // either N or D negative
        else if (N < 0 || D < 0) 
        {
            if (N < 0) 
            {
                N = -1 * N;
            }
            else
            {
                D = -1 * D;
            }
            while (N >= D)
            {
                N -= D;
                result--;
            }
            System.out.println(result);
        }
        // both positive
        else {
            while (N >= D)
            {
                N -= D;
                result++;
            }
            System.out.println(result);
        }
    }
}
	

public static void main(String[] args){ 
}
	
}

