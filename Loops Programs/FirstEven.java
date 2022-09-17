import java.util.*;
public class FirstEven
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        for (int i = 1; i <= 20 ;i++)
        {
            if (i%2 == 0)
            {
                System.out.println("One even number is: " + i);
            }
        }
        num.close();
        
    }
    
}
