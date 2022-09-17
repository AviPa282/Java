import java.util.*;
public class Factors
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to find the factors for: ");
        int num1 = num.nextInt();
        for (int i = 1; i <= num1/2 ; i++)
        {
            if (num1 % i == 0)
            {
                System.out.println("One factor is: " + i);
            }
        }
        System.out.println("One factor is: " + num1);
        num.close();
        
    }
    
}
