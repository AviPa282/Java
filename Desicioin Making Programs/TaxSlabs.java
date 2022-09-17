import java.util.*;
public class TaxSlabs 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter salary in lakhs:");
        double salary = num.nextInt();
        double tax = 0;
        if (salary <= 3)
        {
            tax = salary - 0;
        }
        else if (salary <= 5)
        {
            tax = salary -  ((10 * (salary - 3)) / 100);
        }
        else
        {
            tax = salary - ((15 * (salary - 5)) / 100) + 30000;
        }
        System.out.println("The final salary you get is: " + tax);
        num.close();
        
    }
    
}
