import java.util.*;
public class Vowel 
{

    public static void main(String[] args) 
    {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a character:");
        char chr1 = num.nextLine().charAt(0);
        System.out.println("chr1 is :" + chr1);
        if (chr1 == 'A' || chr1 == 'E' || chr1 == 'I' || chr1 == 'O' || chr1 == 'U')
        {
            System.out.println("The character is a vowel");
        }
        else
        {
            System.out.println("The character is not a vowel");
        }
        num.close();
        
        
    }
    
}
