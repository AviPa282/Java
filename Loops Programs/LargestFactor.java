import java.util.*;
public class LargestFactor
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to find the last factor for: ");
        int num1 = num.nextInt();
        int k = num1 - 1;
                
        for (int i = k; i >= 0; i--)
        {
            try 
            {
               if (num1 % i == 0)
                {
                System.out.println("The last factor is: " + i);
                //break;
                } 
            }
            catch(Exception e)
            {
                System.out.println("I value should not be zero");
            }
            
        }
        num.close();
        
    }
    
}
