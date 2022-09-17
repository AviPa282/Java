import java.util.*;
public class EvenOrOdd 
{

    public static void main(String[] args) 
    {

       
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = num.nextInt();
        if (number%2 == 0)
        {
             System.out.println("The number is even");
        }
        
        else 
        {
             System.out.println("The number is odd");
        }
        
        num.close();
        
    }
    
}
