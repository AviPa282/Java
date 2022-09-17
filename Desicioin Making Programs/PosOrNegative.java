import java.util.*;
public class PosOrNegative 
{

    public static void main(String[] args) 
    {

       
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = num.nextInt();
        if (number > 0)
        {
            System.out.println("The number is positive");
        }
        
        else if (number < 0)
        {
            System.out.println("The number is negative");
        }
        
        else 
        {
            System.out.println("The number is zero");
        }
        num.close();
        
    }
    
}
