import java.util.*;
public class Natural
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 100 ;i++)
        {
                sum = sum + i;
        }
        System.out.println("The sum of the first 100 natural numbers is: " + sum);
        num.close();
        
    }
    
}
