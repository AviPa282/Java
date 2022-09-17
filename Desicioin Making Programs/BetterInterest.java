import java.util.*;
public class BetterInterest 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter principle:");
        int principle = num.nextInt();
        System.out.println("Enter the rate: ");
        int rate = num.nextInt();
        System.out.println("Enter the total time: ");
        int time = num.nextInt();
        System.out.println("Enter the number of times interest per time period: ");
        float n = num.nextFloat();
        double simple = (principle*rate*time)/100;
        double complex = principle*(Math.pow(rate/(n*100), n*time));
        if (simple < complex)
        {
            System.out.println("Simple Interest is better with cost of: " + simple);
        }
        else if (complex < simple)
        {
            System.out.println("Complex Interest is better with cost of:" + complex);
        }
        else
        {
            System.out.println("They are both the same with cost of: " + complex);
        }
        num.close();
        
    }
    
}
