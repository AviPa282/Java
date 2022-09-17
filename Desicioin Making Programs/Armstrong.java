import java.util.*;
public class Armstrong 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the ones digit: ");
        int ones = num.nextInt();
        System.out.println("Enter the tens digit: ");
        int tens = num.nextInt();
        System.out.println("Enter the hundreds digit: ");
        int hundreds = num.nextInt();
        double cubed = Math.pow(ones,3) + Math.pow(tens,3) + Math.pow(hundreds,3);
        double total = ones + (tens*10) + (hundreds*100);
        
        if (cubed == total)
        {
            System.out.println("The number " + total + " is armstrong number");
        }
        else
        {
            System.out.println("The number " + total + "  is not armstrong");
        }
        num.close();
    }
      
}
