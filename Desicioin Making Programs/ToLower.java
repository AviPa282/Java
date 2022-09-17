import java.util.*;
public class ToLower 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a character:");
        char chr1 = num.nextLine().charAt(0);
        if (Character.isUpperCase(chr1))
        {
            System.out.println("The character is a uppercase");
            System.out.println("The character changed to lowercase is: " + Character.toLowerCase(chr1));
            
        }
        else
        {
            System.out.println("The character is lowercase");
            System.out.println("The character cahnged to uppercase is: " + Character.toUpperCase(chr1));
        }

        
        
    }
    
}
