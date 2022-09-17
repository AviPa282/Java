import java.util.*;
public class Difference 
{

    public static void main(String[] args) 
    {

        int max = 0,total;
        int min = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = num.nextInt();
        System.out.println("Enter another number:");
        int num2 = num.nextInt();
        System.out.println("Enter another number:");
        int num3 = num.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            max = num1;
        }
        
        else if (num2 >= num3 && num2 >= num1)
        {
            max = num2;
        }
        
        else if (num3 >= num2 && num3 >= num1)
        {
            max = num3;
        }
        
        if (num1 <= num2 && num1<= num3)
        {
            min = num1;
        }
        
        else if (num2 <= num3 && num2 <= num1)
        {
            min = num2;
        }
        
        else if (num3 <= num2 && num3 <= num1)
        {
            min = num3;
        }
            total = max - min;
        System.out.println("The difference between the max and the min is:" + (total));
        num.close();
        
    }
    
}
