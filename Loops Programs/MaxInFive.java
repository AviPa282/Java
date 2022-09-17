//17. Display maximum marks after reading marks of a student in 5 subjects
import java.util.*;
public class MaxInFive
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        for (int j = 1; j <= 10; j++)
        {
            int max = 0;
            for (int i = 1; i <= 5 ; i++)
            {
               System.out.println("Enter a marks: ");
                int num1 = num.nextInt();
                if ( max <= num1)
                {
                    max = num1;
                }
            }
            System.out.println("The max of the marks in  this subject is : " + max);
        }
        num.close();
        
    }
    
}
