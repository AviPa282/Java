import java.util.*;
public class PrimNo
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to see if prime: ");
        int num1 = num.nextInt();
        int flag = 0;
        for (int i = 2; i <= num1/2 ; i++)
        {
            if (num1 % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("The number is prime");
        }
        else 
        {
            System.out.println("The number is not prime");
        }
        num.close();
        
    }
    
}
