import java.util.*;
public class FirstLast
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to find the factors for: ");
        int num1 = num.nextInt();
        for (int i = 2; i <= num1/2 ; i++)
        {
            if (num1 % i == 0)
            {
                System.out.println("The first factor is: " + i);
                break;
            }
        }
        int k = num1 - 1;
                
        for (int j = k; j >= 0; j--)
        {
            if (num1 % j == 0)
            {
                System.out.println("The last factor is: " + j);
                break;
            }
        }
        num.close();
        
    }
    
}
