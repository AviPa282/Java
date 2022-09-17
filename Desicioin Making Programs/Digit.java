import java.util.*;
public class Digit 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a character:");
        char chr1 = num.nextLine().charAt(0);
        System.out.println("chr1 is :" + chr1);
        if (Character.isDigit(chr1))
        {
            System.out.println("The character is a digit");
        }
        else
        {
            System.out.println("The character is not a digit");
        }

        
        
    }
    
}
