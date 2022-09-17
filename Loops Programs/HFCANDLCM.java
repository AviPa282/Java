import java.util.*;
public class HFCANDLCM
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = num.nextInt();
        System.out.println("Enter a another number: ");
        int num2 = num.nextInt(); 
        int first;
        int gcf = 0;
        if (num1 <= num2)
        {
            first = num1;
        }
        else 
        {
            first = num2;
        }
        for (int i = 1; i <= first ; i++)
        {
            if (num1 % i == 0 && num2 % i ==0)
            {
                gcf = i;
            }
            
        }
        System.out.println("Greatest Common Factor is: " + gcf);
        int lcm = num1*num2/gcf;
        System.out.println("Least Common Multiple is" + lcm);
        
    }
    
}
