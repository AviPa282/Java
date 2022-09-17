import java.util.*;
public class EvenFactors
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to find the factors for: ");
        int num1 = num.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= num1/2 ; i++)
        {
            if (num1 % i == 0)
            {
                if (i%2 == 0)
                {
                    count += 1;
                    sum += i;
                    System.out.println("One of the even factors is : " + i);
                }   
            }
        }
        System.out.println("The count of factors is: " + (count + 1));
        System.out.println("The sum of factors is: " + (sum + num1));
        num.close();
        
    }
    
}
