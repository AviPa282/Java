import java.util.*;
public class PerfectNo
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to see if it is perfect number ");
        int num1 = num.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= num1/2 ; i++)
        {
            if (num1 % i == 0)
            {
                sum += i;
            }
        }
        if (num1 == sum)
        {
            System.out.println("This is perfect number");
        }
        else
        {
            System.out.println("This is not a perfect number");
        }
        num.close();
        
    }
    
}
