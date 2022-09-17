import java.util.*;
public class Options 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter what you want to do, 1 for add, 2 for subtract, 3 for multiply: ");
        int type = num.nextInt();
        System.out.println("Enter the first number: ");
        int num1 = num.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = num.nextInt();
        int total;
        if (type == 1)
        {
            total = num1 + num2;
        }
        else if (type == 2)
        {
            total = num1 - num2;
        }
        else
        {
            total = num1 * num2;
        }
        System.out.println("The final answer is: " + total);
        num.close();
        
    }
    
}
