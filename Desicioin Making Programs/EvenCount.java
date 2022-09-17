import java.util.*;
public class EvenCount 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = num.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = num.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = num.nextInt();
        int count = 0;
        int sum = 0;
        if (num1%2 == 0)
        {
            count = count + 1;
            sum = sum + num1;
        }
        if (num2%2 == 0)
        {
            count = count + 1;
            sum = sum + num2;
        }
        if (num3%2 == 0)
        {
            count = count + 1;
            sum = sum + num3;
        }
        System.out.println("The count of even numbers is: " + count);
        System.out.println("The sum of the even number is: " + sum);
        num.close();
        
    }
    
}
