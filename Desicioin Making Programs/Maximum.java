import java.util.*;
public class Maximum 
{

    public static void main(String[] args) 
    {

       
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = num.nextInt();
        System.out.println("Enter another number:");
        int num2 = num.nextInt();
        System.out.println("Enter another number:");
        int num3 = num.nextInt();
        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("The greatest number is: " + num1);
        }
        
        else if (num2 >= num3 && num2 >= num1)
        {
            System.out.println("The greatest number is: " + num2);
        }
        
        else if (num3 >= num2 && num3 >= num1)
        {
            System.out.println("The greatest number is: " + num3);
        }
        
        num.close();
        
    }
    
}
