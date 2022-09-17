import java.util.*;
public class Fibonacci
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3; 
        for ( int i = 1; i <= 20; i ++)
        {
            System.out.println(num1);
            num3 = num1;
            num1 = num2;
            num2 = num3 + num2;
        }
        num.close();
        
    }
    
}
