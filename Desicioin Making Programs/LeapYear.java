import java.util.*;
public class LeapYear 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = num.nextInt();
        
        if (year%4 == 0 && year%100 != 0 && year%400 == 0 )
        {
            System.out.println("The year is a leap year");
        }
        
        else
        {
            System.out.println("The year is not a leap year");
        }
        num.close();
        
    }
    
}
